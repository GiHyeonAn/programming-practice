<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>test페이지로 접근 합니다.</p>
	<p>[${ip }]님이 요청한 나라변 인사말</p>
	<ul>
		<c:forEach var="m" items="${msg }">
			<li>${m }</li>
		</c:forEach>
	</ul>
</body>
</html>