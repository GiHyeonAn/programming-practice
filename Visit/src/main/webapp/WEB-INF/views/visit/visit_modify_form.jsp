<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/httpRequest.js"></script>
<script type="text/javascript">

function send(f)
{
	var name = f.name.value;
	var content = f.content.value;
	var pwd = f.pwd.value;
	
	if(name==''){
		alert('작성자 이름을 입력하세요');
		f.name.focus();
		return ;
	}
	
	if(content==''){
		alert('내용을 입력하세요');
		f.content.focus();
		return;
	}
	
	if(pwd==''){
		alert('비밀번호를 입력하세요');
		f.pwd.focus();
		return;
	}
	
	var url = "modify.do";
	
	var param = "idx=" + encodeURIComponent(f.idx.value) + 
	"&name=" + encodeURIComponent(name) +
	"&content=" + encodeURIComponent(content) +
	"&pwd=" + encodeURIComponent(pwd);
	
	sendRequest(url,param,resultFn,"GET");	
}

function resultFn(){
	// 수정 성공 list.do  - yes
	//실패시  그대로     - no
	if(xhr.readyState == 4 && xhr.status == 200){
		var data = xhr.responseText;
		
		if(data == 'no'){
			alert("수정 실패");
			return;
		}
		
		alert("수정 성공");
		location.href = 'list.do';
	}
}

</script>

</head>
<body>

<form>
    <input type="hidden" name="idx" value="${ vo.idx }">
	<table border="1" align="center">
		<caption>::::방명록수정::::</caption>
		<tr>
			<th>작성자</th>
			<td><input name="name" value="${ vo.name }"></td>
		</tr> 
		<tr>
		    <th>내용</th>
		    <td>
		    	<textarea name="content"  rows="5"  cols="50">
								${ vo.content }</textarea>
		    </td>
		</tr>

		<tr>
			<th>비밀번호</th>
			<td><input type="password" name="pwd" value="${ vo.pwd }"></td>
		</tr>
		
		
		<tr>
			<td colspan="2" align="center">
			   <input type="button" value="수정하기"
			          onclick="send(this.form);" >

			   <input type="button" value="목록보기"
			          onclick="location.href='list.do'">
			</td>
		</tr>

	</table>
</form>

</body>
</html>