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
			<form class="register-form">
				<input type="text" placeholder="name" /> <input type="password"
					placeholder="password" /> <input type="text"
					placeholder="email address" />
				<button>create</button>
				<p class="message">
					Already registered? <a href="#">Sign In</a>
				</p>
			</form>
			<form class="login-form">
				<input type="email" name="email" id="email" placeholder="please input email" /> 
				<input type="password" name="password" id="password" placeholder="please input password" />
				<button>login</button>
				<p class="message">
					Not registered? <a href="join">Create an account</a>
				</p>
			</form>
		</div>
	</div>

</body>
</html>