$(function(){
	
	changeActiveGnb(1);
	changeActiveGlobal_Aside($("#selectedBoard").text())
})

function deleteContent(contentId){
	var data = new Object();
	data.contentId= $('#contentId').val();
	JSON.stringify(data);
	
	$.ajax({
		
		 url:'/groupware/board/deleteContent',
		type:'POST',
		data:data,
        contentType: 'application/x-www-form-urlencoded; charset=UTF-8', 
        dataType: 'json',
		success:function(responseData,status) {
		    
		},
		complete: function() {			
			alert("게시물 삭제를 완료하였습니다");
			location.href = '/groupware/board?boardId'+ $('#boardId').val();
			}
	});
}