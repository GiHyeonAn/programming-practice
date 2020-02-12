<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<p>이름 : ${vo.name }</p>
		<p>나이 : ${vo.age }</p>
		<p>전화번호 : ${vo.tel }</p>
		<a href="insert_form.do">돌아가기</a>
	</div>

</body>
</html>