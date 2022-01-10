<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로긴세션</title>
</head>
<body>
<%
	if(session.getAttribute("id")==null){
	%>
	
	<h1>로그인 페이지</h1>
	<form action="LoginService" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>PW:</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="로그인">
			</tr>
		</table>
	</form>
	
	<%  }else{ %>
	
	<h1><%=session.getAttribute("id")%>님 환영합니다!</h1>

	<a href="logout.jsp">로그아웃하기</a> 

	<%} %>

</body>
</html>