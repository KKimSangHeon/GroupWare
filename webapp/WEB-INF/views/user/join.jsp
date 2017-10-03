<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Sang Company</title>

<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="${pageContext.servletContext.contextPath }/assets/js/common.js" type="text/javascript"></script>
<script src="${pageContext.servletContext.contextPath }/assets/js/join.js" type="text/javascript"></script>

<link
	href="${pageContext.servletContext.contextPath }/assets/css/join.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<div class="form-wrap">
		<form  name="loginform" method="post" action="${pageContext.servletContext.contextPath }/user/join" enctype="multipart/form-data" >
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
					<input type="password" name="password" /> 
				</p>
				<p>
					<input type="file" name="file">
				</p>
				<p>
					<input type="text" name="employeeName" />
				</p>
				<p>
					<select id="teamId" name="teamId" style="width:160.8px; HEIGHT:22PX"></select>
				</p>
				<p>
					<input type="text" name="email" />
				</p>
				<p>
					<select id="positionId" name="positionId" style="width:160.8px; HEIGHT:22PX" ></select>
				</p>
			</div>

			<button id="submit" style="width:160.8px; HEIGHT:22PX">가입요청하기</button>
		</form>
	</div>

</body>
</html>