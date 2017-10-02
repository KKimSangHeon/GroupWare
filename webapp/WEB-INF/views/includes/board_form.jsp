
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<h2 id="selectedBoard">${boardName}</h2>
<br>
<table class="board_list">
	<colgroup>
		<col width="10%" />
		<col width="*" />
		<col width="15%" />
		<col width="20%" />
	</colgroup>
	<thead>
		<tr>
			<th scope="col">글번호</th>
			<th scope="col">제목</th>
			<th scope="col">작성자</th>
			<th scope="col">작성일</th>

		</tr>
	</thead>
	<tbody>
		
            <c:choose>
                <c:when test="${fn:length(list) > 0}">
                    <c:forEach items="${list }" var="row">
                        <tr>
                            <td>${row.no }</td>
                            <td class="title">
                                <a href="${pageContext.request.contextPath }/board/view?contentId=${row.contentId }">${row.contentTitle }</a>
                                <input type="hidden" id="IDX" value="${row.no }">
                            </td>
                            <td>${row.employeeName }</td>
                            <td>${row.writeDate }</td>
                        </tr>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td colspan="4">등록된 게시물이 없습니다.</td>
                    </tr>
                </c:otherwise>
            </c:choose>
         

	</tbody>
</table>
<br />
	
	<fmt:parseNumber var ='i' type = "number" value="${authUser.positionId} }"/>
	<fmt:parseNumber var ='j' type = "number" value="${boardAuthority }"/>
	<c:if test="${ i <= j }">
		
		<a href="${pageContext.request.contextPath }/board/write?boardId=${boardId }&boardName=${boardName}" class="btn" id="write">글쓰기</a>
	</c:if> 

