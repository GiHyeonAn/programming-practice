<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%

	request.setCharacterEncoding("utf-8");
	//String name = request.getParameter("name");
	
%>

<jsp:useBean id="person" class="el.basic.Person"/>
<jsp:setProperty  name="person" property="*"/>

<%request.setAttribute("p", person); %>

<jsp:forward page="el_obj3.jsp"/>