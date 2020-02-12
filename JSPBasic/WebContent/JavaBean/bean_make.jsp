<%@page import="kr.co.dksrlgus.user.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

	request.setCharacterEncoding("utf-8");
	
	//UserBean user = new UserBean(
			//request.getParameter("id"),
			//request.getParameter("pw"),
			//request.getParameter("name"),
			//request.getParameter("email")
			//);


%>

<%--
	id - jsp페이지에서 자바빈 객체에 접근할 때 사용할 이름을 지정
	class - 자바빈 클래스 존재 경로를 완전한 경로로 입력
	scope - 자바빈 객체를 저장할 영역을 지정
 --%>
<jsp:useBean id="user" class="kr.co.dksrlgus.user.UserBean" scope="request"/>

<%--
	useBean태그로 객체의 이름과 경로, 범위를 지정해 주고
	setter역할을 아는 setProperty 속성과
	getter역할을 하는 getProperty 속성을 이용하여
	객체에 데이터를 저장하고 ,참조합니다
	
	파라미터 변수명과 자바빈 클래스의 멤버변수명이 모두 일치한다면
	액션태그 setProperty의 속성 property의 값을 *로 지정하면
	자동으로 파라미터값을 읽어서 자바빈 클래스 변수에 저장합니다
 --%>
 
<jsp:setProperty name="user" property="*"/>

<%--<jsp:setProperty name="user" property="id" value="<%request.getParameter("id");%>"/>
<jsp:setProperty name="user" property="pw" value="<%request.getParameter("pw");%>"/>
<jsp:setProperty name="user" property="name" value="<%request.getParameter("name");%>"/>
<jsp:setProperty name="user" property="email" value="<%request.getParameter("email");%>"/>
 --%>

<jsp:forward page="bean_use.jsp"/>




