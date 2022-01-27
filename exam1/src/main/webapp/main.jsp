<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>빅데이터과정 회원시스템</h1>
	<hr>
	<form action="Logout" method="post">
		<table border="1">
			<tr align="center">
				<td>
					<% String id = (String) session.getAttribute("id");
					out.print(id); %>님 환영합니다!
				</td>
			</tr>

			<tr align="center">
				<td><input type="submit" value="로그아웃"></td>
			</tr>
		</table>
	</form>
</body>
</html>