<%@page import="vo.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	PersonVO p1 = new PersonVO();
	p1.setName("ddd");
	p1.setAge(30);
	p1.setTel("010-0000-0000");
	
	PersonVO p2 = new PersonVO("aaa",28,"010-2222-2222");
	
	pageContext.setAttribute("p1", p1);
	request.setAttribute("p2", p2);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<p>${p1.name } / ${p1.age} / ${p1.tel }</p>
		<p>${p2.name } / ${p2.age} / ${p2.tel }</p>
	</div>

</body>
</html>