<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>Sang Company</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">

<link
	href="${pageContext.servletContext.contextPath}/assets/css/write.css"
	rel="stylesheet" type="text/css">
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="${pageContext.servletContext.contextPath }/assets/js/common.js"
	type="text/javascript"></script>

<script src="${pageContext.request.contextPath}/assets/js/messageview.js"
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
				<tbody>
					<tr >
						<th scope="row" >발신자</th>
						<td><input id="contentTitle" class="wdp_90" value="${sender}"  readonly style="border:0px;"></input></td>
					</tr>
					<tr>
						<td colspan="2" class="view_text"><textarea rows="20"
								cols="110" title="내용" id="contentContent" name="contentContent" readonly>${message}</textarea></td>
					</tr>

				</tbody>

			</table>
			<input type="hidden" id="employeeNo" name="employeeNo" value=${authUser.employeeNo }>
			<input type="hidden" id="teamId" name="teamId" value=${authUser.teamId }>
			<input type="hidden" id="boardId" name="boardId" value=${boardId }>
			<div class="right">
					<button type="button"  onClick="history.back();">돌아가기</button>
			</div>
				<span>
				</span>
		</form>



	<c:import url="/WEB-INF/views/includes/footer.jsp" />

</body>
</html>