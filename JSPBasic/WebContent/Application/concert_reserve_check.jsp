<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<%
		//예매가 확정된 좌석 정보를 저장할 리스트
		List<String> list = new ArrayList<>();
	
		if(application.getAttribute("complete_list") != null) {
			list = (List<String>) application.getAttribute("complete_list");
		}
	
		//사용자가 예매를 희망하는 좌석 정보가 들어있는 배열
		String[] seat = request.getParameterValues("seat");
		
		//예약 선점 여부를 확인할 로직
		
		//예약 확정 전에 임시로 좌석정보를 저장할 리스트
		List<String> temp = new ArrayList<>();
		
		//몇 자리를 예약할 수 있는지의 여부를 체크할 변수
		int count = 0;
		
		for(String s : seat) {
			if(list.contains(s)) break;
			else {
				temp.add(s);
				count++;
			}
		}
		
		if(count == seat.length) {
			//addAll()메서드는 리스트 내부에 리스트 객체들을 전부 추가하는 메서드입니다
			list.addAll(temp);
		}
		
		application.setAttribute("complete_list", list);
	
	%>

    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>좌석 예매 결과</h2>
		<p>
			선택한 좌석<br>
			<% 
				for(String s : seat) {
					out.println("<b>[" + s + "]</b>");
				}
			%>
			<br>(이)가 예매 신청되었습니다
		</p>
		
		<p>
		 	예매 신청 결과 :<%= (count == seat.length) ? "성공" : "실패" %>
		 	<br>
		 	<% if(count != seat.length) { %>
		 			예매하고자 하는 좌석이 이미 선점되었습니다
		 	<% } %>
		 	<br>
		 	<a href="concert_reserve.jsp">추가 예매하기</a> 
		</p>
		
	</div>

</body>
</html>