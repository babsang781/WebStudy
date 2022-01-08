<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쿠키 생성</h1>
	
	<%
	
	Cookie coo = new Cookie("cook", "kiescookthecookiesfortest");
	System.out.println("쿠키를 생성함");

	coo.setMaxAge(120);
	System.out.println("쿠키 유효기간 설정");
	
	response.addCookie(coo);
	
	%>
</body>
</html>