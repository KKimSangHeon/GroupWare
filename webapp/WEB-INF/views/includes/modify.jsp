<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


	<div class="form-wrap">
		<form  name="loginform" method="post" action="${pageContext.servletContext.contextPath }/mypage/modify" enctype="multipart/form-data" >
			<img src="/groupware/assets/images/title.png" />
			<div>
				<p id="join">정보수정</p>
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
					<input type="text" name="employeeNo1" value="${authUser.employeeNo}" disabled> 
					<input type="hidden" name="employeeNo" value="${authUser.employeeNo}" > 
				</p>
				<p>
					<input type="password" name="password" /> 
				</p>
				<p>
					<input type="file" name="file" value="${authUser.imageUrl}">
				</p>
				<p>
					<input type="text" name="employeeName" value="${authUser.employeeName}"/>
				</p>
				<p>
					<input type="text" name="teamName" value="${authUser.teamName}"  disabled>
				</p>
				<p>
					<input type="text" name="email" value="${authUser.email}" />
				</p>
				<p>
					<input type="text" name="positionName" value="${authUser.positionName}" disabled > 
				</p>
			</div>

			<button id="submit" style="width:160.8px; HEIGHT:22PX">변경하기</button>
		</form>
	</div>

