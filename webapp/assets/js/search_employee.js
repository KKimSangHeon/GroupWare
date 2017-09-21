function initGrid() {
     
    $("#list").jqGrid({
        //로컬그리드이용
        datatype: "local",
        //그리드 높이
        height: 250,
        //컬럼명들
        colNames:['사진','이름', '소속', '직급'],
        //컬럼모델
        colModel:[
            {name:'imageUrl',align:"center"},
            {name:'employeeName',align:"center"},
            {name:'teamName',align:"center"},
            {name:'positionName',align:"center"},
        ],
        width:700,
        //그리드타이틀
        caption: "사원목록"
    });
}

function loadEmployeeData() {
	
	
  
	
	var gridData;
	//그리드의 데이터를 비우고
	var trf = $("#list tbody:first tr:first")[0];
	$("#list tbody:first").empty().append(trf);
	
	
	var params = jQuery("#searchEmployeeForm").serialize();
	console.log(params);
	$.ajax({
		
		 url:'/groupware/searchemployee',
		type:'POST',
		data:params,
        contentType: 'application/x-www-form-urlencoded; charset=UTF-8', 
        dataType: 'json',
		success:function(responseData,status) {
			console.log(responseData);
			
		    for(var i=0;i<=responseData.data.length;i++){
	            $("#list").jqGrid('addRowData',i+1,responseData.data[i]);
	    }
		    
		},
		complete: function() {			
		}
	});
	
	
}


 $(function(){
		changeActiveGnb(3);
		initGrid();
		
		loadEmployeeData();
		
		$("#searchEmployeeButton").click(function(){  
			loadEmployeeData();
		});  
})