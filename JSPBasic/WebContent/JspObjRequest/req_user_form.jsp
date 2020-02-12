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
		사용자의 입력값을 서버로 전송하는 방법
		-사용자의 입력 데이터를 서버로 전송하려면 HTML의 form태그를 사용합니다
		-form태그의 action속성에 데이터를 전달받을 페이지의 URL주소를 작성합니다
		-input 태그의 name속성으로 요청 파라미터의 이름을 지정할 수 있습니다
	 --%>


	<h2>회원가입 양식</h2>
	<hr/>
	
	<form action="req_user_info.jsp">
	
		#이름:<input type="text" name="name"><br>
		#아이디:<input type="text" name="id"/><br>
		#비밀번호:<input type="password" name="pw"/><br>

		# 성별: <input type="radio" name="gender" value="남자" /> 남성 &nbsp;
				<input type="radio" name="gender" value="여자" /> 여성<br>

		#취미<br>
		<input type="checkbox"name="hobby" value="reading"/>독서&nbsp;
		<input type="checkbox"name="hobby" value="sleeping"/>잠자기&nbsp;
		<input type="checkbox"name="hobby" value="soccer"/>게임&nbsp;
		<input type="checkbox"name="hobby" value="game"/>운동<br>

		#지역:
		<select name="region">
			<option>서울</option>
			<option>대전</option>
			<option>대구</option>
			<option>부산</option>
		</select><br>

		#자기소개 <br> 
		<textarea name = "introduce"cols="40"rows="10"></textarea><br>

	<!-- 서버로 데이터를 전송하는 버튼 -->
	<input type="submit"value="확인">&nbsp;
	<input type="reset"value="초기화">



	</form>

</body>
</html>