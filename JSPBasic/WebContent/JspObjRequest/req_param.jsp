<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--
	요청 파라미터(request Parameters)
	
	- 클라이언트 측에서 서버로 데이터를 요청할 때 전달되는 값들을 담은
	변수를 요청 파라미터라고 부릅니다
	
	- 요청 파라미터는 URL 주소 뒤에 ?를 붙인 이후 [파라미터변수명=값]의
	형식을 통해서 서버로 데이터를 전달합니다
	
	-요청 파라미터를 여러개 전달할 때는 &기호를 사용하여 나열하여 전달합니다

 --%>
    
    <%
    	//클라이언트에서 전송된 요청 파라미터의 값을 읽는 방법
    	//내장 객체 request의 메서드 getParameter("파라미터 변수명");
    
    	String breakfast = request.getParameter("bf");
    	String lunch = request.getParameter("lunch");
    	String dinner = request.getParameter("dinner");
    	
    
    %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>
		-아침밥 : <%=breakfast %> <br> <%--주소창 뒤에 "?bf=메뉴"를 입력하면 메뉴가 나타난다 --%>
		-점심밥 : <%=lunch %> <br>
		-저녁밥 : <%=dinner %> <br>
	</p>

	

</body>
</html>