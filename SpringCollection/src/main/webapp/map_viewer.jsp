<%@page import="java.util.Map"%>
<%@page import="ex.MyMap"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	WebApplicationContext wc = WebApplicationContextUtils.getWebApplicationContext(application);

	MyMap myMap = (MyMap)wc.getBean("myMapBean");
	
	Map<String,String> map = myMap.getMap();
	
	request.setAttribute("map", map);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>MyMap의 내용</p>
	
	<ul>
		<li>${map.hong }</li>
		<li>${map['kim'] }</li>
		<li>${map.park }</li>
		<li>${map.lee }</li>
	</ul>
</body>
</html>






















