<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% String id = request.getParameter("id"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%try { %>
	<%=id.toLowerCase() %>
	<% } catch(Exception e) { %>
		<h4>죄송합니다 서버측 오류가 발생했습니다</h4>
		<p>
			<strong>잠시만 기다리시면 빠른 시간 내에 해결하겠습니다</strong>
		</p>
	<% } %>
</body>
</html>