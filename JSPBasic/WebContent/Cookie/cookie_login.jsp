<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%

	/*
		생성된 id_cookie쿠키를 검색하여 쿠키가 이미 존재한다면
		로그인 창 대신에 브라우저에 "이미 로그인한 사용자입니다"를 출력 후 
		welcome페이지로 이동할 수 있는 링크를 제공하세요
		
		id_cookie가 없는 사용자는 로그인 입력창이 등장하도록 구성하세요
	*/
	
	Cookie[] cookies = request.getCookies();
	boolean flag = false;
	String userId = "";
	if(cookies != null) {
		for(Cookie c : cookies) {
			if(c.getName().equals("id_cookie")) {
				flag = true;
				break;
			}
			if(c.getName().equals("remember_id")) {
				userId = c.getValue();
			}
		}
	}
	

%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% if(!flag) { %>

	<form action="cookie_login_con.jsp" method="post">
		<input type="text" name="id" size="10" placeholder="ID" value="<%=userId%>">
		<input type="checkbox" name="id_remember" value="yes">
		<small>아이디 기억하기</small><br>
		<input type="password" name="pw" size="10" placeholder="PW"><br>
		<input type="submit" value="로그인">
	</form>
	<% } else { %>
		<h2>이미 로그인한 사용자입니다</h2>
		<a href="cookie_login_welcome.jsp">웰컴 페이지로 이동</a>
	<% } %>



</body>
</html>