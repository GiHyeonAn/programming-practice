<%@page import="java.util.Arrays"%>
<%@page import="java.util.UUID"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//범용 고유 식별자(Universally unique identifier)
	//소프트웨어 구축에 쓰이는 식별자 표준 번호입니다
	UUID uuid = UUID.randomUUID();
	System.out.println(uuid.toString());
	
	String[] uuids = uuid.toString().split("-");
	System.out.println(Arrays.toString(uuids));
	
	session.setAttribute("auth_code", uuids[1]);
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>회원 인증 페이지</h2>
	<h1>인증코드:<del><%=uuids[1] %></del></h1>
	<form action="concert_auth_check.jsp">
		<small>위의 인증코드를 입력하세요</small>
		<input type="text" name="code" size="5">
		<input type="submit" value="확인">
	
	</form>


</body>
</html>