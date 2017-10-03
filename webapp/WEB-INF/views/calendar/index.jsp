<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>Chapter 8</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

<link
	href="${pageContext.servletContext.contextPath}/assets/fullcalendar/css/fullcalendar.css"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.servletContext.contextPath}/assets/fullcalendar/css/fullcalendar.min.css"
	rel="stylesheet" type="text/css">
<link
	href="${pageContext.servletContext.contextPath}/assets/css/calendar.css"
	rel="stylesheet" type="text/css">

<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>


<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.min.js"></script>
<script
	src="${pageContext.servletContext.contextPath }/assets/js/common.js"
	type="text/javascript"></script>
<script
	src="${pageContext.servletContext.contextPath }/assets/fullcalendar/js/fullcalendar.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.servletContext.contextPath }/assets/js/calendar.js"
	type="text/javascript"></script>
</head>
<body>

	<c:import url="/WEB-INF/views/includes/header.jsp" />
	<c:import url="/WEB-INF/views/includes/top_gnb.jsp" />


			<p id="newSchedulrTitle">일정추가</p>
	<form id="newScheduleForm" name="newScheduleForm">
	
		<table id="newScheduleTable">
			<tbody>
				<tr>
					<th scope="row">시작일자</th>
					<td colspan="2"><input type="text" id="startDate" name="startDate" style="width:80px; HEIGHT:17.6px"></td>
					<th scope="row">종료일자</th>
					<td colspan="2"><input type="text" id="endDate" name="endDate" style="width:80px; HEIGHT:17.6px">
					
					<input type="hidden" id="employeeNo" name="employeeNo" style="width:80px; HEIGHT:17.6px"></td>

				
					<th scope="row">일정내용</th>
					<td colspan="2"><input type="text" id="scheduleContent" name="scheduleContent" size=70 style="width:178.4px; HEIGHT:17.6px"></td>
					<td colspan="2" id="scheduleButtonTd">
						<button type="button" class="search" id="addScheduleButton" style="width:80px; HEIGHT:17.6px" >추가</button>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
	<br>
	<br>

	<div id="calendar"></div>


	<c:import url="/WEB-INF/views/includes/footer.jsp" />

</body>
</html>