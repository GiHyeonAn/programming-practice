<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 14일차 -10 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<table border="1">
			<tr>
				<th>부서번호</th>
				<th>부서명</th>
				<th>위치</th>
			</tr>
			<c:forEach var="vo" items="${list }">
				<tr>
					<td>${vo.deptno }</td>
					<td>${vo.dname }</td>
					<td>${vo.loc }</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>