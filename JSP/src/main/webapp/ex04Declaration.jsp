<%@ page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 선언문 : 필드 ( 멤버 변수, 전역변수) 필드나 메소드를 만들ㄸ 사용함 -->
	<%! public int myNumber1 = 100;
		public String hello(){
			return "안녕!"; }
		%>
	<!-- 전역변수로 선언됨, 접근제한자 선언 가능 -->
	<%
	int myNumber2 = 100;
	Random rd = new Random();
	%>
	<!--  -->



</body>
</html>