function initGrid() {
     
    $("#list").jqGrid({
        //로컬그리드이용
        datatype: "local",
        //그리드 높이
        height: 700,
        //컬럼명들
        colNames:['사진','이름', '소속', '직급','이메일','가입승인'],
        //컬럼모델
        colModel:[
            {name:'imageUrl',align:"center",formatter:imageFormatter},
            {name:'employeeName',align:"center",width:100},
            {name:'teamName',align:"center"},
            {name:'positionName',align:"center"},
            {name:'email',align:"center",width:200},
            {name:'IDX', index:'IDX',align:"center", width:100,formatter:approveButton },
        ],
        width:700,
        //그리드타이틀
        caption: "사원목록"
    });
}

function approve(email) {
	var data = new Object();
	
	data.email= email;
	JSON.stringify(data);
	$.ajax({
		 url:'/groupware/user/approve',
		type:'POST',
		data:data,
        contentType: 'application/x-www-form-urlencoded; charset=UTF-8', 
        dataType: 'json',
		success:function(responseData,status) {
		    
		},
		complete: function() {			
			alert('가입승인이 완료되었습니다.');
			window.location.reload();
		}
	});
	
	
}


// 버튼 생성
function approveButton (cellvalue, options, rowObject) {
  return '<input type="button" id="sendMessageButton" onclick="approve(\''+rowObject.email+'\')" value="가입 승인하기"/>';
}

function imageFormatter(cellvalue, options, rowObject){
    return '<img src="' +getContextPath()+ rowObject.imageUrl + '" />';
}

function getContextPath() {
	   return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
}
function loadEmployeeData() {
	
	var gridData;
	//그리드의 데이터를 비우고
	var trf = $("#list tbody:first tr:first")[0];
	$("#list tbody:first").empty().append(trf);
	
	
	var params = jQuery("#searchEmployeeForm").serialize();
	$.ajax({
		
		 url:'/groupware/user/searchnotapproved',
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
		changeActiveGnb(0);
		initGrid();
		loadEmployeeData();
})