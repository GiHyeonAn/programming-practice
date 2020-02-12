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
	국어점수(kor) 영어점수(eng), 수학점수(math)를 입력받아 전송하는
	폼을 작성하세요 (scroe_bean_make.jsp)
	 --%>
	 
	 <form action="scroe_bean_make.jsp" method="post">
	 	<div align="center">
	 		-국어점수 : <input type="text" name="kor" size="10"><br>
	 		-영어점수 : <input type="text" name="eng" size="10"><br>
	 		-수학점수 : <input type="text" name="math" size="10"><br>
	 		<hr>
	 		<input type="submit" value="확인">
	 	</div>
	 </form>

</body>
</html>