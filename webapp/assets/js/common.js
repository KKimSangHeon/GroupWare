

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