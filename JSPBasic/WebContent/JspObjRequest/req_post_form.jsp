<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
		전송방식을 post로 사용하기 위해서는  반드시 form 태그가 필요합니다
		form태그의 method란 속성을 "post"로 설정하면 요청 방식이
		post방식으로 전송됩니다
	 --%>
	<form action="req_post_take.jsp" method="post">
		-아이디: <input type="text" name= "id" size= "10px"/> <br>
		-비밀번호: <input type="password" name= "pw" size= "10px"/> <br>
		-이름: <input type="text" name= "name" size= "10px"/> <br>
		<input type="submit" value= "전송"/>
	</form>


</body>
</html>