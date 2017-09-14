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


            <div class="wrap">
	    	<form id="search_employee_form" name="NlfsAcnutVO" onsubmit="return false;">
				<table id="search_employee_table">
					<tbody>
					<tr >
						<th scope="row" >부서</th>
						<td colspan="2">
							<input type="text" size=30 id="search_employee_department" name="department" >
						</td>
						<th scope="row" >이름</th>
						<td colspan="2">
							<input type="text" size=30  class="long" id="search_employee_name" name="name">							
						</td>
						<td>
							<button type="button" class="search" id="search_employee_btnRetrieve" tabindex="3">검색</button>
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