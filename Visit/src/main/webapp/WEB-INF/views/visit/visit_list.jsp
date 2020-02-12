<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/visit.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/httpRequest.js"></script><!-- js파일 불러오기 -->
<script type="text/javascript">
	function del(f) { 
		var pwd = f.pwd.value; //원래 비밀번호
		var c_pwd = f.c_pwd.value; //입력 비밀번호

		if(pwd != c_pwd) {
			alert("비밀번호가 틀립니다");
			return;
		}
		//삭제 확인
		if(confirm("정말 삭제하시겠습니까?") == false) {
				return;
		} 

		//id를 Ajax를 통해서 서버로 전송
		var url = "delete.do";

		//id에 @와 같은 특수문자가 들어가 있는 경우를 대비해서 인코딩 
		var param = "idx = " + encodeURIComponent(f.idx.value);

		sendRequest(url, param, resultFn, "GET");
		
	}

	function resultFn() {
		//결과를 받을 콜백 메소드
		if(xhr.readyState == 4 && xhr.status == 200) {
			//결과값 읽어 오기
			var data = xhr.responseText;

			if(data == 'no') {
				alert("삭제 실패");
				return;
			}

			alert("삭제 성공");

			location.href = "list.do";
		}

	}

	function modify(f) {
		var pwd = f.pwd.value; //원래 비밀번호
		var c_pwd = f.c_pwd.value; //입력 비밀번호

		if(pwd != c_pwd) {
			alert("비밀번호가 틀립니다");
			return;
		}
		f.action = "modify_form.do";
		f.submit();
	}
</script>
</head>
<body>
	<!-- 현재 ContextPath : ${pageContext.request.contextPath }<br> -->
	<div id="main_box">
	<h1>::::방명록 리스트::::</h1>
	<div align="center">
		    <input type="button"  value="글쓰기" 
		           onclick="javascript:location.href='insert_form.do'">
		</div>
		
		<!--  for(VisitVo vo : list ) -->
		<c:forEach var="vo" items="${ list }">
	
			<div class="visit_box">
			  <div class="type_content">${ vo.content }</div>
			  <div class="type_name">작성자:${ vo.name } (${ vo.ip })</div>
			  <div class="type_regdate">작성일자:${ vo.regdate }</div>
	
			  <div>
				  <form>   
				      <input type="hidden" name="idx" value="${ vo.idx }">
				      <input type="hidden" name="pwd" value="${ vo.pwd }">
				      
				      비밀번호(${ vo.pwd }):<input type="password"  name="c_pwd">
				      
				      <input type="button"    value="수정" 	
									onclick="modify(this.form);">
				             
				      <input type="button"    value="삭제"  
									onclick="del(this.form);">
				  </form>    
			  </div>
			</div>
		</c:forEach>
		
	</div>
</body>
</html>