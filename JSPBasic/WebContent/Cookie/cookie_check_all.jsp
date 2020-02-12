<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
	Cookie[] cookies = request.getCookies();

	for(Cookie c : cookies) {
		String name = c.getName();
		String value = c.getValue();
		out.print(name + " : " + value + "<br>");
		out.print("------------------------------<br>");
	}

%>
    