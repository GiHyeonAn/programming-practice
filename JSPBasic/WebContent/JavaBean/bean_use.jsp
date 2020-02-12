<%@page import="kr.co.dksrlgus.user.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="kr.co.dksrlgus.user.UserBean" scope="request"/>

- 아이디 : <jsp:getProperty  name="user" property="id"/>
- 비밀번호 : <jsp:getProperty  name="user" property="pw"/>
- 이름 : <jsp:getProperty  name="user" property="name"/>
- 이메일 : <jsp:getProperty  name="user" property="email"/>

<%--
	UserBean user2 = (UserBean) request.getAttribute("user");

--%>

<%---아이디 : <%=user2.getId() %>
-비밀번호 : <%=user2.getPw() %>
-이름 : <%=user2.getName() %>
-이메일 : <%=user2.getEmail() %> --%>



</body>
</html>