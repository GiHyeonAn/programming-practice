<%@page import="kr.co.dksrlgus.board.model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
	Long id = Long.parseLong(request.getParameter("id"));

	if(BoardDAO.getInstance().delete(id)) { %>
		<script>
			alert("삭제가 정상 처리되었습니다.");
			location.href="list.jsp";
		</script>
	<% } else { %>
		<script>
			alert("삭제에 실패했습니다.");
			location.href="list.jsp";
		</script>
	<% } %>