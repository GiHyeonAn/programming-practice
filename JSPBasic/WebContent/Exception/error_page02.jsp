<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>
		요청 처리 과정에서 문제가 발생했습니다 <br>
		빠른 시간 내에 문제를 해결하겠습니다 <br>
		잠시만 기다려 주세요
	</p>
	<p>
		에라 원인<%= exception.getMessage() %>
	</p>

</body>
</html>

<!-- 인터넷 익스플로러 브라우저의 경우 전체 응답 결과의 데이터 크기가
브라우저 기준보다 작을 경우 마이크로소크르에서 자체 제공하는 에러 페이지를 출력합니다 -->
