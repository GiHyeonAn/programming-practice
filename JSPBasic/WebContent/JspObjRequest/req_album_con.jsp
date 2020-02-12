<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	
    	
    	String album = request.getParameter("title");
    	
    	if(album.equals("xjapan")) {
    		response.sendRedirect("xjapan.jsp");
    	} else if(album.equals("LinkinPark")){
    		response.sendRedirect("LinkinPark.jsp");
    	}
    
    %>
