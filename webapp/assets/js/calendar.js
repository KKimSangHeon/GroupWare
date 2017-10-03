$(function() {
	init();
	
	$("#startDate,#endDate").datepicker({
		dateFormat : "yy-mm-dd"
	});

	//loadScheduleData();

	$("#addScheduleButton").click(function() {

		addSchedule();
		//삽입성공하면 화면 reload
	});

})

function getSchedule() {
	var data = new Object();
	data.employeeNo = $("#userEmployeeNo").val();

	JSON.stringify(data);

	$.ajax({

		url : '/groupware/calendar/getSchedule',
		type : 'POST',
		data : data,
		contentType : 'application/x-www-form-urlencoded; charset=UTF-8',
		dataType : 'json',
		success : function(responseData, status) {
					
					for(var i=0;i<responseData.data.length;i++){
							responseData.data[i].start = responseData.data[i].startDate;
							responseData.data[i].end = responseData.data[i].endDate;
							responseData.data[i].title = responseData.data[i].scheduleContent;
					}
					
					makeCalendar(responseData.data);
		},
		complete : function() {
		}
	});
}

function addSchedule() {
	$('#employeeNo').val($('#userEmployeeNo').val());

	var params = jQuery("#newScheduleForm").serialize();
	$.ajax({
		url : '/groupware/calendar/addSchedule',
		type : 'POST',
		data : params,
		contentType : 'application/x-www-form-urlencoded; charset=UTF-8',
		dataType : 'json',
		success : function(responseData, status) {
			alert('일정추가 완료');
			window.location.reload();
		},
		complete : function() {
		}
	});
}

function makeCalendar(event) {
	$('#calendar').fullCalendar({
		header : {
			left : 'prev,next today',
			center : 'title',
			right : 'month,agendaWeek,agendaDay,listWeek'
		},
		navLinks : true, // can click day/week names to navigate views
		editable : true,
		eventLimit : true, // allow "more" link when too many events
		events : event
	});

}

function init() {
	jQuery.browser = {};
	(function() {
		jQuery.browser.msie = false;
		jQuery.browser.version = 0;
		if (navigator.userAgent.match(/MSIE ([0-9]+)\./)) {
			jQuery.browser.msie = true;
			jQuery.browser.version = RegExp.$1;
		}
	})();

	changeActiveGnb(2);
	getSchedule();


}