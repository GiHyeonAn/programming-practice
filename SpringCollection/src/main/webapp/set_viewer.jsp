<%@page import="java.util.Set"%>
<%@page import="ex.MySet"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	WebApplicationContext wc = WebApplicationContextUtils.getWebApplicationContext(application);

	//MySet mySet = (MySet)wc.getBean("mySetBean"); 둘 중 하나
	MySet mySet = wc.getBean("mySetBean",MySet.class);
	
	Set set = mySet.getSet();
	
	request.setAttribute("set", set);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:forEach var="dosi" items="${set }">
			<li>${dosi }</li>
		</c:forEach>
	</ul>
</body>
</html>