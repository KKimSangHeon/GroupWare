<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
<title>Sang Company</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="${pageContext.servletContext.contextPath }/assets/css/wrong_base.css" rel="stylesheet" type="text/css">
</head>
<body>
	<c:import url="/WEB-INF/views/includes/header.jsp"/>
		<div id="content">
					<h1>아직 가입승인이 되지 않았습니다..관리자에게 연락하거나 기다려 주세요</h1>
		</div>
</body>
</html>