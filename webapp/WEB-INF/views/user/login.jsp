<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>

<meta http-equiv="content-type" content="text/html; charset=utf-8">
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>

<link href="${pageContext.servletContext.contextPath }/assets/css/login.css" rel="stylesheet" type="text/css">

<script src="${pageContext.servletContext.contextPath }/assets/js/common.js" type="text/javascript"></script>
<script src="${pageContext.servletContext.contextPath }/assets/js/login.js" type="text/javascript"></script>
</head>
<body>

	<div class="login-page">
		<div class="form">
		<img src="/groupware/assets/images/title.png" />

			<form class="login-form" name="loginform" method="post" action="${pageContext.servletContext.contextPath }/user/auth">
				<input  name="employeeNo" id="employeeNo" placeholder="사번을 입력하세요" /> 
				<input type="password" name="password" id="password" placeholder="비밀번호를 입력하세요" />
				<button>login</button>
				<p class="message">
					계정이 없으신가요? <a href="${pageContext.servletContext.contextPath }/user/join">회원가입</a>
				</p>
			</form>
		</div>
	</div>

</body>
</html>