<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04_jstl_forEach</title>
</head>
<body>
	<!-- forEach태그 : Java 의 for 문과 같은 기능
네 가지 속성을 가짐
var: 변수명 ( 생략 가능)
begin: 시작값*
end: 마지막 값*
step: 증가값(생략시 1씩 증가)  
-->

	<c:forEach var="i" begin="1" end="10" step="1">
	${i}
</c:forEach>

	<!-- forEach 태그의 두 번째 구조
var: 변수명 
items: 배열 및 리스트 값
 -->

	<%
	ArrayList<String> list = new ArrayList<>();
	list.add("커피");
	list.add("카레");
	list.add("달걀");

	request.setAttribute("list", list);
	%>

	<c:forEach var="food" items="${list}">
		${food } 
	 </c:forEach>


</body>
</html>