<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>cookie delete</title>
</head>
<body>
	<h1>쿠키 삭제</h1>
	<% 
	// 쿠키 유효기간을 만료 시켜서 삭제
	//Cookie cookie = new Cookie("message","ddd"); // 이름이 달라도 되나?
	Cookie cookie = new Cookie("message", URLEncoder.encode("Cookie Create!한글","utf-8"));
			
	//cookie.setMaxAge(0); // 삭제 한다는 뜻
	response.addCookie(cookie);
	
	//숫자와 알파벳정보만 저장이 가능
	//한글, 특수, 공백을 저장할 때는 인코딩을 설정해줘야 한다.
	//Cookie cookie = new Cookie("message",URLEncoder.encode("Cookie Create!한글","utf-8"));
	
	%>
	
	
</body>
</html>