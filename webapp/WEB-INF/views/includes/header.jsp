<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<header id="main_header">
	<h1 class="logo">
		<a href="#"><img src="/groupware/assets/images/title.png" /></a>
	</h1>


	<div class="login_menu">

		<c:choose>
			<c:when test="${empty authUser }">
			</c:when>
			<c:otherwise>
				<span> ${authUser.employeeName }님 반갑습니다. <c:if
						test="${authUser.role == 'ADMIN' }">
						<a href="${pageContext.servletContext.contextPath }/admin">관리페이지</a>
					</c:if> <a href="${pageContext.servletContext.contextPath }/user/logout">로그아웃</a><br>
					<br>최근로그인: ${authUser.lastLogin }
				</span>
			</c:otherwise>
		</c:choose>
	</div>
</header>