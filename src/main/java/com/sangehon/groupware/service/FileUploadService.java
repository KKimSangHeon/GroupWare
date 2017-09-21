package com.sangehon.groupware.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
	private static String SAVE_PATH = "/uploads";
	private static String PREFIX_URL = "/uploads/images/";
	
	public String restore(MultipartFile multipartFile) {
		
		String url = "";
		
		try {
			String originalFileName = multipartFile.getOriginalFilename();
			String extName = originalFileName.substring(originalFileName.lastIndexOf("."), originalFileName.length());	
			Long size = multipartFile.getSize();
			String saveFileName = genSaveFileName( extName );
			
			System.out.println( "#######" + originalFileName );
			System.out.println( "#######" + extName );
			System.out.println( "#######" + saveFileName );
			System.out.println( "#######" + size );
			
			writeFile( multipartFile, saveFileName );
			
			url = PREFIX_URL + saveFileName;
			
		} catch( IOException ex ) {
			throw new RuntimeException( ex );
		}
		
		return url;
	}

	private void writeFile(
		MultipartFile multipartFile,
		String saveFileName ) throws IOException {
		
		byte[] fileData = multipartFile.getBytes();
		
		FileOutputStream fos
			= new FileOutputStream( SAVE_PATH + "/" + saveFileName );
		fos.write( fileData );
		fos.close();
	}
	 
	private String genSaveFileName( String extName ) {
		String fileName = "";
		
		Calendar calendar = Calendar.getInstance();
		fileName += calendar.get( Calendar.YEAR );
		fileName += calendar.get( Calendar.MONTH );
		fileName += calendar.get( Calendar.DATE );
		fileName += calendar.get( Calendar.HOUR );
		fileName += calendar.get( Calendar.MINUTE );
		fileName += calendar.get( Calendar.SECOND );
		fileName += calendar.get( Calendar.MILLISECOND );
		fileName += extName;
		
		return fileName;
	}
}
