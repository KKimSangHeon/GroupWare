<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<aside id="global_aside">
	
<div id="boardList">
	<c:forEach items="${boardList }"	var="vo" varStatus="status">	
	<span>
		<img src="/groupware/assets/images/board_icon.png" />
		<a href="${pageContext.request.contextPath }/board?boardId=${vo.boardId}">${vo.boardName} </a> 
	</span>

	
	</c:forEach>
</div>	
	
	
</aside>