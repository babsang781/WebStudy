<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Calendar" %>

<!-- 
날짜와 시간 정보를 얻어오는 클래스: SimpleDateFormat (현재 시간 데이터를 가져올 수 있음)
날짜와 시간 정보를 관리하는 클래스: Calendar (시간 데이터를 출력하기 위해 값을 가져옴) 
-->

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
Calendar date = Calendar.getInstance();
SimpleDateFormat today = new SimpleDateFormat("yyyy년 mm월 dd일");
SimpleDateFormat now = new SimpleDateFormat("hh시 mm분 ss초");

%>

	오늘은 <strong> <%= today.format(date.getTime()) %> </strong>입니다.<br>
	지금 시각은 <strong> <%= now.format(date.getTime()) %></strong>입니다. 
</body>
</html>
