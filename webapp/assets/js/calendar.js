$(function(){
	init();
	

	

})

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


	
	changeActiveGnb(2);
	makeCalendar();
	
}