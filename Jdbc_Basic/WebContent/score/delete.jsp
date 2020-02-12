<%@page import="kr.co.dksrlgus.score.model.ScoreDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%

	//파라미터 데이터 얻어오신 후 DAO에게 삭제 요청 해 주시면 됩니다
	//삭제가 완료되면 score_list.jsp로 강제 이동
	//삭제 실패해도 score_list.jsp로 이동
	
	Long id = Long.parseLong(request.getParameter("id"));

	if(ScoreDAO.getInstance().delete(id)) { %>
			<script>
				alert("정보 삭제에 성공하셨습니다");
				location.href ="score_list.jsp";
			</script>
		<%
	} else {%>
			<script>
				alert("정보 삭제에 실패하셨습니다");
				location.href ="score_list.jsp";
			</script>
		<%
	}
	


%>