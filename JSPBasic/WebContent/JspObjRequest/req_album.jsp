<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align="center">

<%--<form action="req_album_result.jsp"> --%>

   <table border="1" width="700">
      
      <tr align="center">
         <%--<td></td> --%>
         <td>앨범 커버</td>
         <td>가수</td>
         <td>앨범 제목</td>
         <td>발매일</td>
      </tr>
      <tr align="center">
         <%--<td><input type= "radio" name= "title" value="Xjapan"></td> --%>
         <td><img src="xjapan.jpg" width="100" height="100"></td>
         <td>Xjapan</td>
         <td><a href="req_album_con.jsp?title=xjapan">blueBlood</a></td>
         <td>1989.04.21</td>
      </tr>
      <tr align="center">
         <%-- <td><input type= "radio" name= "title" value="LinkinPark"></td>--%>
         <td><img src="LinkinPark.jpg" width="100" height="100"></td>
         <td>LinkinPark</td>
         <td><a href="req_album_con.jsp?title=LinkinPark">Meteora</a></td>
         <td>2003.03.25</td>
      </tr>
      <%--<tr align="center">
         <td colspan="5">
            <input type="submit" value="확인">
         
         </td>
      </tr> --%>
<%--실행 후 f12버튼 눌러서 확인 --%>
   </table>
<%--</form> --%>
</div>
</body>
</html>