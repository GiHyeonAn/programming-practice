<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%if(user != null) {%>
      <h1><%=user.getName() %>님은 현재 로그인 중입니다</h1>
      
      <a href="login_welcome.jsp">웰컴 페이지로</a>

      
   <%} else { %>
      
   
   
   <h1>로그인 양식</h1>
   
   <form action="login_controller.jsp" method="post">
      <p>
         <input type="text" name="account" placeholder="아이디"><br>
         <input type="password" name="password" placeholder="비밀번호"><br>
         <input type="submit" value="로그인">
         <button type="button" onclick="location.href='register_form.jsp'">회원가입</button>
         <%--location.href는 자바스크립트 문법입니다
          페이지 이동을 시킬 때 사용합니다--%>
      </p> 
   
   </form>

<% }%>