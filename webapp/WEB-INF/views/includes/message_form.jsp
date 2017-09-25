<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>




<h2>쪽지 리스트</h2>

<table class="board_list">
	<colgroup>
		<col width="10%" />
		<col width="*" />
		<col width="15%" />
		<col width="20%" />
	</colgroup>
	<thead>
		<tr>
			<th scope="col">발신자</th>
			<th scope="col">내용</th>
			<th scope="col">수신시간</th>
			<th scope="col">답장</th>
			<th scope="col">삭제</th>

		</tr>
	</thead>
	<tbody>
		        <c:choose>
                <c:when test="${fn:length(list) > 0}">
                    <c:forEach items="${list }" var="row">
                        <tr>
                            <td>${row.sender }</td>
                            <td class="title">
                                <a href="${pageContext.request.contextPath }/message/temp">${row.message }</a>
                                <input type="hidden" id="IDX" value="temp">
                            </td>
                            <td>${row.writeDate }</td>
                			<td><button id="answer">답장</button></td>
							<td><a href="#this">삭제</a></td>
                        </tr>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td colspan="5">수신한 쪽지가 존재하지 않습니다.</td>
                    </tr>
                </c:otherwise>
            </c:choose>
	</tbody>
</table>
<br />
