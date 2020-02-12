<%@page import="kr.co.dksrlgus.user.model.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%

	/*
		1. 폼 데이터 처리
		2. 로그인 유효성 검사
		3. deleteUser()메서드 선언하여 실행
		4. 탈퇴에 성공하면 세션을 삭제 후 user_login으로 이동
		5. 탈퇴 실패시 user_mypage.jsp로 이동
	*/
	
	request.setCharacterEncoding("utf-8");

	String id = (String) session.getAttribute("user_id");
	String pw = request.getParameter("check_pw");
	
	UserDAO dao = UserDAO.GetInstance();
	
	int result = dao.userCheck(id, pw);
	
	if(result == 0) { %>
			<script>
				alert("비밀번호가 틀렸습니다");
				location.href="user_mypage.jsp";
			</script>
	<% } else {
		if(UserDAO.GetInstance().deleteUser(id)){
			session.invalidate(); %>
		<script>
			alert("탈퇴에 성공하셨습니다");
			location.href="user_login.jsp";
		</script>
		<%  }else {%>
		<script>
   				alert("다시 로그인 하세요");
   				location.href="user_mypage.jsp";
   		</script>
	

<% 		}
	} %>
