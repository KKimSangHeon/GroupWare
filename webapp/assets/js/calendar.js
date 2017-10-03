$(function(){
	init();
	
    $( "#startDate,#endDate" ).datepicker({
        dateFormat: "yy-mm-dd"
 });

	//loadScheduleData();
	
	$("#addScheduleButton").click(function(){  
		
		alert("버튼누름");
		addSchedule();
		//삽입성공하면 화면 reload
	}); 
    

})

function addSchedule(){
	
	
	$('#employeeNo').val($('#userEmployeeNo').val());
	
	
	
	var params = jQuery("#newScheduleForm").serialize();
	$.ajax({
		
		 url:'/groupware/calendar/addSchedule',
		type:'POST',
		data:params,
       contentType: 'application/x-www-form-urlencoded; charset=UTF-8', 
       dataType: 'json',
		success:function(responseData,status) {
			window.location.reload();
		},
		complete: function() {			
		}
	});
	
}

function makeCalendar(){
	$('#calendar').fullCalendar({
		header: {
			left: 'prev,next today',
			center: 'title',
			right: 'month,agendaWeek,agendaDay,listWeek'
		},
		navLinks: true, // can click day/week names to navigate views
		editable: true,
		eventLimit: true, // allow "more" link when too many events
		events: [
			{
				title: 'All Day Event',
				start: '2016-09-01'
			},
			{
				title: 'Long Event',
				start: '2016-09-07',
				end: '2016-09-10'
			},
		
			{
				title: 'Conference',
				start: '2016-09-11',
				end: '2016-09-13'
			}

		]
	});
	
	
}

function init(){
	jQuery.browser = {};
	(function () {
	    jQuery.browser.msie = false;
	    jQuery.browser.version = 0;
	    if (navigator.userAgent.match(/MSIE ([0-9]+)\./)) {
	        jQuery.browser.msie = true;
	        jQuery.browser.version = RegExp.$1;
	    }
	})();

	
	changeActiveGnb(2);
	makeCalendar();
	
}