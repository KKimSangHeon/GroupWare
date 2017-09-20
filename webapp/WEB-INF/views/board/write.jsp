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

<link
	href="${pageContext.servletContext.contextPath}/assets/css/write.css"
	rel="stylesheet" type="text/css">
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="${pageContext.servletContext.contextPath }/assets/js/common.js"
	type="text/javascript"></script>

<script src="${pageContext.request.contextPath}/assets/js/write.js"
	type="text/javascript"></script>

</head>
<body>

	<c:import url="/WEB-INF/views/includes/header.jsp" />
	<c:import url="/WEB-INF/views/includes/top_gnb.jsp" />
		<form name="boardWriteForm" method="post" action="${pageContext.servletContext.contextPath }/board/write">
			<table class="board_view">
				<colgroup>
					<col width="15%">
					<col width="*" />
				</colgroup>
				<caption id="title">${boardName} 게시글작성</caption>
				<tbody>
					<tr>
						<th scope="row">제목</th>
						<td><input type="text" id="contentTitle" name="contentTitle" class="wdp_90"></input></td>
					</tr>
					<tr>
						<td colspan="2" class="view_text"><textarea rows="20"
								cols="110" title="내용" id="contentContent" name="contentContent"></textarea></td>
					</tr>

				</tbody>

			</table>
			<input type="hidden" id="employeeNo" name="employeeNo" value=${authUser.employeeNo }>
			<input type="hidden" id="employeeNo" name="teamId" value=${authUser.teamId }>
			<input type="hidden" id="boardId" name="boardId" value=${boardId }>
			<div class="right">
					<button id="submit">작성하기</button> 
					<button type="button"  onclick = "location.href = '${pageContext.servletContext.contextPath }/board?boardId=${boardId }' ">돌아가기</button>
			</div>
				<span>
				</span>
		</form>



	<c:import url="/WEB-INF/views/includes/footer.jsp" />

</body>
</html>