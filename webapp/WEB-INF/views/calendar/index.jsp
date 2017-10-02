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
<link href="${pageContext.servletContext.contextPath}/assets/css/board.css" rel="stylesheet" type="text/css">
<link href="${pageContext.servletContext.contextPath}/assets/fullcalendar/css/fullcalendar.css" rel="stylesheet" type="text/css">
<link href="${pageContext.servletContext.contextPath}/assets/fullcalendar/css/fullcalendar.min.css" rel="stylesheet" type="text/css">

<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.min.js"></script>
<script src="${pageContext.servletContext.contextPath }/assets/js/common.js" type="text/javascript"></script>
<script src="${pageContext.servletContext.contextPath }/assets/fullcalendar/js/fullcalendar.min.js" type="text/javascript"></script>
<script src="${pageContext.servletContext.contextPath }/assets/js/calendar.js" type="text/javascript"></script>
</head>
<body>

<c:import url="/WEB-INF/views/includes/header.jsp"/>
<c:import url="/WEB-INF/views/includes/top_gnb.jsp"/>

<div id="calendar"></div>


<c:import url="/WEB-INF/views/includes/footer.jsp"/>

</body>
</html>