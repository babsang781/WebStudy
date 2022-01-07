<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>cookieCreate</title>
</head>
<body>
	<h1>쿠키 생성</h1>
	
	<%
		// 쿠키 생성 - 내장 x 타입 필요
		Cookie cookie = new Cookie("message","CookieCreate"); // 값을 입력할 (이름과 값)을 구분해서 저장
		
		// 사용자에게 생성한 쿠키를 전달하기 위해서 addCookie()활용
		response.addCookie(cookie); //실행만 하면 쿠키가 pc 에 저장
		
	%>
</body>
</html>