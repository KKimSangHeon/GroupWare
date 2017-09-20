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
	<div id="formDiv">
		<form id="boardWriteForm">
			<table class="board_view">
				<colgroup>
					<col width="15%">
					<col width="*" />
				</colgroup>
				<caption id="title">${boardName} 게시글작성</caption>
				<tbody>
					<tr>
						<th scope="row">제목</th>
						<td><input type="text" id="TITLE" name="TITLE" class="wdp_90"></input></td>
					</tr>
					<tr>
						<td colspan="2" class="view_text"><textarea rows="20"
								cols="110" title="내용" id="CONTENTS" name="CONTENTS"></textarea></td>
					</tr>

				</tbody>

			</table>
			<input type="hidden" id="employeeId" name="employeeNo"
				value=${authUser.employeeNo }>
			<div class="right">
				<span>
					<button id="submit">작성하기</button> <a href="#this" class="right"
					id="list">목록으로</a>
				</span>
			</div>
		</form>

	</div>


	<c:import url="/WEB-INF/views/includes/footer.jsp" />

</body>
</html>