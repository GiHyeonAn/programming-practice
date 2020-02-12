<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	List<String> party = new ArrayList<>();
	List<Integer> jobNumber = new ArrayList<>();
%>

<%
	String[] jobs = {"전사", "도적", "사냥꾼", "마법사", "사제"};

	/*
		- 직업 갯수 만큼의 정수 난수를 발생시켜 주세요. (0~4)
		- 발생된 난수의 번호대로 party라는 리스트에 직업을 추가해 주세요.
		
		- party라는 list에 현재 선택된 직업이 몇 개 존재하는지 확인하는 작업을
		 해 주셔야 합니다.
		 
		- 반복문으로 list를 순회해서, 현재 선택된 직업의 문자열과 party라는 리스트 내부에
		 들어있는 문자열 중에 같은 문자열이 발견될 때마다 숫자를 세서
		 나와 같은 직업을 가진 파티원이 몇 명인지 세 주셔야 합니다.
	*/
	
	
	//직업 갯수만큼의 정수 난수를 발생시킵니다.
	int r = (int) (Math.random() * jobs.length); //[0,1,2,3,4]
	String job = jobs[r];
	party.add(job);
	jobNumber.add(r);
	
	//party라는 list에 현재 선택된 직업이 몇 개 존재하는지 확인하는 작업이
	//필요합니다.
	int cnt = 0;
	
	/*
		-반복문으로 list를 순회해서 현재 선택된 직업의 문자열과 리스트 내부에
		 들어있는 문자열 중에서 같은 문자열이 발견될 때마다 숫자를 세 주겠습니다.
	*/
	for(String player : party) {
		if(job.equals(player)) {
			cnt++;
		}
	}
	

%>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>당신의 역할</h2>
	<p>
		<!-- <img src="img/~~~.png 가로 40px 세로 40px" -->
		<img src="img/<%= r %>.png" width="40px" height="40px">
		당신에게 부여된 역할은 <strong>[<%= job %>]</strong> 입니다. <br>
		현재 파티에 당신과 같은 역할을 가진 플레이어는 <%= cnt %>명 입니다.
	</p>
	<p>
		현재 파티 구성 <br>
		<%--
			list를 반복문으로 순회하여 해당 직업(jobs)의 번호를 따로 부여하신 후
			 그 직업의 인덱스 번호에 맞추어서 사진을 img태그로 넣어주시면 됩니다.
			 가로- 20px 세로 - 20px
			 
			 파티원이 10명이 되었을 때 리스트를 비워 주시면 됩니다.
		 --%>
		 <% for(int idx : jobNumber) { %>
		 	<img src="img/<%=idx %>.png" width="20px" height="20px">
		 <% } %>
		(<%=party.size() %> 명 참가 중)
	</p>
	<%
		if(party.size() == 10) {
			party.clear();
			jobNumber.clear();
		}
	%>

</body>
</html>











