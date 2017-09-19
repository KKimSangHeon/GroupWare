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
</head>
<body>

	<c:import url="/WEB-INF/views/includes/header.jsp" />

	<c:import url="/WEB-INF/views/includes/global_aside.jsp" />
	<c:import url="/WEB-INF/views/includes/top_gnb.jsp" />
	<div id="formDiv">
	<form id="frm">
		<table class="board_view">
			<colgroup>
				<col width="15%">
				<col width="*" />
			</colgroup>
			<caption id="title">게시글 작성</caption>
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
		<div class = "right">
			<span>
				<a href="#this" class="right" id="write">작성하기</a>
				<a href="#this" class="right" id="list">목록으로</a>
			</span>
		</div>
	</form>

	</div>


	<c:import url="/WEB-INF/views/includes/footer.jsp" />

</body>
</html>