<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Join form</title>
<link
	href="${pageContext.servletContext.contextPath }/assets/css/join.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<div class="form-wrap">
		<form id="login-form" name="loginform" method="post" action="${pageContext.servletContext.contextPath }/user/join" >
			<img src="/groupware/assets/images/title.png" />
			<div>
				<p id="join">회원가입</p>
			</div>
			<div id="menu2">
				<p>사번</p>
				<p>비밀번호</p>
				<p>사진업로드</p>
				<p>이름</p>
				<p>소속</p>
				<p>이메일</p>
				<p>직급</p>
				
			</div>
			<div id="form2">

				<p>
					<input type="text" name="employeeNo"> 
				</p>
				<p>
					<input type="password" name="password" /> (영문 대소문자/숫자/특수문자 중 2가지 이상 조합, 10자~16자)
				</p>
				<p>
					<input type="file" name="file1">
				</p>
				<p>
					<input type="text" name="employeeName" />
				</p>
				<p>
					<input type="text" name="teamName" />
				</p>
				<p>
					<input type="text" name="email" />
				</p>
				<p>
					<input type="text" name="position" />
				</p>
			</div>

			<button id="submit" style="WIDTH: 80pt; HEIGHT: 20pt">가입요청하기</button>
		</form>
	</div>

</body>
</html>