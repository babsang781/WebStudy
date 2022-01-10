<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 세션을 모두 삭제하는 메소드 clearall() 같은 것, ex)로그아웃 기능
	session.invalidate();
	response.sendRedirect("main.jsp");
	
	
	%>
</body>
</html>