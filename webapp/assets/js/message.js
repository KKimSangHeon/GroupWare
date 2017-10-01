var dialog, form,messageId;
function initSendMessageForm(){
    // From http://www.whatwg.org/specs/web-apps/current-work/multipage/states-of-the-type-attribute.html#e-mail-state-%28type=email%29
	   var name = $( "#name" ),
	      email = $( "#email" ),
	      password = $( "#password" ),
	      allFields = $( [] ).add( name ).add( email ).add( password ),
	      tips = $( ".validateTips" );
	 
	    function updateTips( t ) {
	      tips
	        .text( t )
	        .addClass( "ui-state-highlight" );
	      setTimeout(function() {
	        tips.removeClass( "ui-state-highlight", 1500 );
	      }, 500 );
	    }
    function sendMessage() {
    	//메세지 답장(메세지 ID를 이용)
			var data = new Object();
			
			data.messageId= messageId;
			data.message = $("#messageArea").val();
			
			JSON.stringify(data);
			
			$.ajax({
				
				 url:'/groupware/message/answerMessage',
				type:'POST',
				data:data,
		        contentType: 'application/x-www-form-urlencoded; charset=UTF-8', 
		        dataType: 'json',
				success:function(responseData,status) {
				    
				},
				complete: function() {			
					dialog.dialog( "close" );
					alert("메세지 전송을 완료하였습니다.");
					window.location.reload();
				}
			});
			
			
			
			
	    }
	 
	    dialog = $( "#sendForm" ).dialog({
	      autoOpen: false,
	      height: 400,
	      width: 350,
	      modal: true,
	      buttons: {
	        "전송하기": sendMessage,
	        Cancel: function() {
	          dialog.dialog( "close" );
	        }
	      },
	      close: function() {
	        form[ 0 ].reset();
	        allFields.removeClass( "ui-state-error" );
	      }
	    });
	 
	    form = dialog.find( "form" ).on( "submit", function( event ) {
	      event.preventDefault();
	      sendMessage();
	    });
	 
	    $( "#answer" ).button().on( "click", function() {
	      dialog.dialog( "open" );
	    });
	 
}

function openForm(answerMessageId){
	messageId=answerMessageId;
	dialog.dialog( "open" );
}

function deleteMessage(messageId){
	var data = new Object();
	data.messageId=messageId;
	JSON.stringify(data);
	
	$.ajax({
		url:'/groupware/message/deleteMessage',
		type:'POST',
		data:data,
        contentType: 'application/x-www-form-urlencoded; charset=UTF-8', 
        dataType: 'json',
		success:function(responseData,status) {
		    
		},
		complete: function() {			
			alert('해당 메세지가 삭제되었습니다.');
			window.location.reload();
		}
	});
}


$(function() {
	changeActiveGnb(4);
	initSendMessageForm();


});