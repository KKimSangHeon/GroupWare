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
<link href="${pageContext.servletContext.contextPath}/assets/css/search_employee.css" rel="stylesheet" type="text/css">

<link rel="stylesheet" type="text/css" media="screen" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" type="text/css" media="screen" href="${pageContext.servletContext.contextPath}/assets/jqgrid/css/ui.jqgrid.css" />

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="${pageContext.servletContext.contextPath}/assets/jqgrid/js/jquery.jqGrid.min.js"></script>
<script src="${pageContext.servletContext.contextPath }/assets/js/common.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/js/search_employee.js" type="text/javascript"></script>


 <script type="text/javascript">  
 
 </script>
</head>
<body>


<c:import url="/WEB-INF/views/includes/header.jsp"/>
<c:import url="/WEB-INF/views/includes/top_gnb.jsp"/>



		<div id="sendForm" title="메세지 전송">
		  <form>
		    <fieldset>
		      <label for="name">전송할 내용을 입력하세요</label>
		      <input type="hidden" name="selectedEmail" id="selectedEmail">
		 	  <textarea id = "messageArea" rows="15" cols="48" name="contents"></textarea>
		      <!-- Allow form submission with keyboard without duplicating the dialog button -->
		      <input type="submit" tabindex="-1" style="position:absolute; top:-1000px">
		    </fieldset>
		  </form>
		</div>
 



            <div class="wrap">
	    	<form id="searchEmployeeForm" name="searchEmployeeForm">
				<table id="searchEmployeeTable">
					<tbody>
					<tr >
						<th scope="row" >팀명</th>
						<td colspan="2">
							<select id="teamId" name="teamId" style="width:178.4px; HEIGHT:17.6px"></select>
						</td>
						<th scope="row" >이름</th>
						<td colspan="2">
							<input type="text" size=30  id="employeeName" name="employeeName">							
						</td>
						<td>
							<button type="button" class="search" id="searchEmployeeButton" tabindex="3">검색</button>
						</td>
					</tr>					
					</tbody>					
				</table>
			</form>
			</div>

<div id = "list_div">
<table id="list"></table>

</div>
<c:import url="/WEB-INF/views/includes/footer.jsp"/>

</body>
</html>