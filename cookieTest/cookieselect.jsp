<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쿠키정보 조회</h1>

	<%
	// 사용자의 쿠키정보는 request 객체로부터 접근이 가능!
	// 접근시 쿠키 배열을 반환 받을 수 있음
	Cookie[] cookies = request.getCookies(); // 아무것도 없으면 null  

	for (int i = 0; i < cookies.length; i++) {
		out.println("쿠키 이름: " + cookies[i].getName()+"<br/>");
		// out.println("쿠키 값: " + cookies[i].getValue()+"<br/><hr>");
		// 한글 출력
		out.println("쿠키 값: " + URLDecoder.decode(cookies[i].getValue(), "utf-8"));
		out.print("<br/><hr>");
	}
	
	%>



</body>
</html>