function makeTeamList(selectTagId){
	
	$.ajax({
		url: "/groupware/api/user/getTeamList",
		type: "get",
		dataType: "json",
		data:"",
		success: function( response ) {
			if( response.result != "success" ) {
				console.log( response.message );
				return;
			}
			
			$.each( response.data, function(index, vo){
				$('#'+selectTagId).append("<option value="+vo.teamId+">"+vo.teamName+"</option>");
			});
		}
	});
	
}


function makePositionList(selectTagId){
	
	$.ajax({
		url: "/groupware/api/user/getPositionList",
		type: "get",
		dataType: "json",
		data:"",
		success: function( response ) {
			if( response.result != "success" ) {
				console.log( response.message );
				return;
			}
			
			$.each( response.data, function(index, vo){
				$('#'+selectTagId).append("<option value="+vo.positionId+">"+vo.positionName+"</option>");
			});
		}
	});
	
}



function changeActiveGnb(itemNum){
	 
	 for(var i=1;i<6;i++){
		 if(i==itemNum){
			 $("#top_gnb > a.item_"+i).addClass('active');
		 }
		 else{
			 $("#top_gnb > a.item_"+i).removeClass('avtive');
		 }
		 
	 }
	 return;
}


function changeActiveGlobal_Aside(boardName){
		
	$('#boardList a').each(function(index, item) {
		
		if($(this).text().substring(0,$(this).text().length-1) == boardName){
		$(this).css('color','red');
	}
	});
}