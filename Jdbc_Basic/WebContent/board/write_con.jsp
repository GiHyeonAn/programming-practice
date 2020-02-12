<%@page import="kr.co.dksrlgus.board.model.BoardDAO"%>
<%@page import="kr.co.dksrlgus.board.model.IBoardDAO"%>
<%@page import="kr.co.dksrlgus.board.model.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<%
	//글 등록 성공시 list.jsp로 리다이렉팅
	//등록 실패 시 write.jsp로 리다이렉팅
	request.setCharacterEncoding("utf-8");
	
	Board article = new Board();
	article.setWriter(request.getParameter("writer"));
	article.setTitle(request.getParameter("title"));
	article.setContent(request.getParameter("content"));
	
	//IBoardDAO dao = BoardDAO.getInstance();
	if(BoardDAO.getInstance().insert(article)) {//insert에서 F3누르면 이동
			response.sendRedirect("list.jsp");
	} else {
			response.sendRedirect("write.jsp");
	}
	
%>
