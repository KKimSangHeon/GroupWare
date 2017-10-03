<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>Sang Company</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  
<link href="${pageContext.servletContext.contextPath}/assets/css/message.css" rel="stylesheet" type="text/css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script src="${pageContext.servletContext.contextPath }/assets/js/common.js" type="text/javascript"></script>
<script src="${pageContext.servletContext.contextPath }/assets/js/message.js" type="text/javascript"></script>
</head>
<body>

<c:import url="/WEB-INF/views/includes/header.jsp"/>
<c:import url="/WEB-INF/views/includes/top_gnb.jsp"/>




<div id="sendForm" title="메세지 전송">
  <form>
    <fieldset>
      <label for="name">전송할 내용을 입력하세요</label>
      <input type="hidden" name="selectedEmail" id="selectedEmail">
 	  <textarea id = "messageArea" rows="15" cols="48" name="contents"></textarea>
      <!-- Allow form submission with keyboard without duplicating the dialog button -->
      <input type="submit" tabindex="-1" style="position:absolute; top:-1000px">
    </fieldset>
  </form>
</div>

<c:import url="/WEB-INF/views/includes/message_form.jsp"/>
<c:import url="/WEB-INF/views/includes/footer.jsp"/>

</body>
</html>