<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% for(int i=0; i<5; i++) { %>
	<h2>이클립스 내부에서 jsp파일 작성하기!</h2>
	<p>
		안녕하세요. 오늘은 2019년 11월 15일입니다. <br>
		지금은 스크립틀릿 연습중이에요~
	</p>
	<% } %>
	
	<h2>구구단 2단</h2>
	<% for(int hang=1; hang<=9; hang++) { 
		//out.print메서드는 브라우저에 바로 출력을 실행하는 메서드입니다.}		out.print("2 x" + hang + "=" + (2*hang) + "<br>");
		}
	%>
	
	<hr>
	<!-- 반복문, 조건문을 이용하여 구구단을 짝수단(2,4,6,8)만 출력해 보세요. -->
	
	<%
		for(int dan=2; dan<=9; dan++) {
			if(dan % 2 == 0) {
				out.print("<h2> 구구단" + dan + "단 </h2><hr>");
				for(int hang=1; hang<=9; hang++) {
					out.print(dan + "x" + hang + "=" + (dan*hang) + "<br>");
				}
			}
		}
	%>
	
	
	
	
</body>
</html>











