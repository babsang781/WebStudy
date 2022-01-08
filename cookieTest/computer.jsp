<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	사무용 PC에 대한 상세 페이지입니다.<br>
	모델명: 사무용 PC<br>
	제품가격: 159,000원<br>
	<%
		//1.상품정보를 저장한 쿠기객체 생성
	//Cookie cookie = new Cookie(URLEncoder.encode("사무용 PC","utf-8"), URLEncoder.encode("제품가격: 159,000원","utf-8"));
	Cookie cookie2 = new Cookie(URLEncoder.encode("사무용 PC","utf-8"), URLEncoder.encode("item:사무용 PC<br>제품가격: 159,000원","utf-8"));
		//2.1시간동안 유지
		cookie2.setMaxAge(120);
		
		//3.클라이언트PC에 쿠키를 보내기 위해 response객체에 저장
		response.addCookie(cookie2);
	%>
	<a href="list.jsp">제품 목록 페이지</a>
</body>
</html>