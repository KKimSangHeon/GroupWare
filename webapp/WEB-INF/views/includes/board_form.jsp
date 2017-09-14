
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<h2>ㅇㅇ게시판</h2>
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
			<th scope="col">조회수</th>
			<th scope="col">작성일</th>

		</tr>
	</thead>
	<tbody>
		<!-- 
            <c:choose>
                <c:when test="${fn:length(list) > 0}">
                    <c:forEach items="${list }" var="row">
                        <tr>
                            <td>${row.IDX }</td>
                            <td class="title">
                                <a href="#this" name="title">${row.TITLE }</a>
                                <input type="hidden" id="IDX" value="${row.IDX }">
                            </td>
                            <td>${row.HIT_CNT }</td>
                            <td>${row.CREA_DTM }</td>
                        </tr>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <tr>
                        <td colspan="4">조회된 결과가 없습니다.</td>
                    </tr>
                </c:otherwise>
            </c:choose>
         -->
		<tr>
			<!--뺄것 -->
			<td>1</td>
			<!--뺄것 -->
			<td class="title">
				<!--뺄것 --> <a href="#this" name="title">ㅎㅇ</a>
			<!--뺄것 --> <input type="hidden" id="IDX" value="ㅎㅇ">
			<!--뺄것 -->
			</td>
			<!--뺄것 -->
			<td>11</td>
			<!--뺄것 -->
			<td>22</td>
			<!--뺄것 -->
		</tr>
		<!--뺄것 -->
	</tbody>
</table>
<br />
<a href="#this" class="btn" id="write">글쓰기</a>


