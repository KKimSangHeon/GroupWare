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
		<img src="/groupware/assets/images/title.png" />
		<div>
			<p id="join">회원가입</p>
		</div>
		<div id="menu2">
			<p>사번</p>
			<p>비밀번호</p>
			<p>사진업로드</p>
			<p>이름</p>
			<p>주소</p>
			<p>휴대전화</p>
		</div>
		<div id="form2">
			<form>
				<p>
					<input type="text" name="id"> (영문소문자/숫자, 4~16자)
				</p>
				<p>
					<input type="password" name="pw" /> (영문 대소문자/숫자/특수문자 중 2가지 이상 조합,
					10자~16자)
				</p>
				<p>
					<input type="file" name="file1">
				</p>
				<p>
					<input type="text" name="pw_answer" />
				</p>
				<p>
					<input type="text" name="name" />
				</p>
				<p>
					<select name="PhoneNo">
						<option value="010">010</option>
						<option value="017">017</option>
						<option value="017">011</option>
					</select> - <input type="text" name="PhoneNo1" size="3" /> - <input
						type="text" name="PhoneNo2" size="3" />


				</p>
			</form>
		</div>

		<button id="submit" style="WIDTH: 80pt; HEIGHT: 20pt">가입요청하기</button>
	</div>

</body>
</html>