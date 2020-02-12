<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
   if(session.getAttribute("auth_pass") == null) {
      response.sendRedirect("concert_auth.jsp");
   }

	List<String> list = new ArrayList<>();
	if(application.getAttribute("complete_list") != null) {
		list = (List<String>) application.getAttribute("complete_list");
	}
	
%>   
    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <div align="center">
      <h2>콘서트 좌석 예매</h2>
      <h4>예매할 좌석을 체크한 후 예약 버튼을 눌러주세요.</h4>
   </div>
   <hr>
   <form action="concert_reserve_check.jsp">
      <p align="center">
      
         <strong>좌석 배치도</strong> <br>&nbsp;&nbsp;&nbsp;&nbsp;
         <% for(char c='A'; c<='Z'; c++) { %>
               <small><%=c %></small>&nbsp;&nbsp;
         <% } %>
         <br>
         
         <% for(int r=1; r<=3; r++) { %>
            <%= r %>
            
            <%for(char c='A'; c<='Z'; c++) { %>
            	<% if(list.contains(c + "-" + r)) { %>
               		<input type="checkbox" name="seat" value="<%=c %>-<%=r %>" disabled>
               	<% } else { %> 
               		<input type="checkbox" name="seat" value="<%=c %>-<%=r %>">
               	<% } %>
            <% } %>
            <br>
         <% } %>
         
         <br>
         
         <% for(int r=4; r<=6; r++) { %>
            <%= r %>
            
            <%for(char c='A'; c<='Z'; c++) { %>
              <% if(list.contains(c + "-" + r)) { %>
               		<input type="checkbox" name="seat" value="<%=c %>-<%=r %>" disabled>
               	<% } else { %> 
               		<input type="checkbox" name="seat" value="<%=c %>-<%=r %>">
               	<% } %>
            <% } %>
            <br>
         <% } %>
         
         <input type="submit" value="예약"> &nbsp;
         <input type="reset" value="재설정"> 
         
      
      </p>
   </form>

</body>
</html>











