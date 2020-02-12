<%@page import="vo.PersonVO"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//Spring Container (applicationScope)에 대한 참조 값을 얻어 와야 한다
	WebApplicationContext wc = WebApplicationContextUtils.getWebApplicationContext(application);
	//context(interface), contextutils(class)
	
	PersonVO p1 = (PersonVO)wc.getBean("p1");
	PersonVO p2 = (PersonVO)wc.getBean("p2");
	PersonVO p3 = (PersonVO)wc.getBean("p3");
	
	request.setAttribute("p1", p1);
	request.setAttribute("p2", p2);
	request.setAttribute("p3", p3);
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
		<p>${p3.name } / ${p3.age} / ${p3.tel }</p>
	</div>

</body>
</html>