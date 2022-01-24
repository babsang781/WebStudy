<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EX1 SET</title>
</head>
<body>
	
	<!-- JSTL 라이브러리를 이용한 변수선언 -->
	<%-- <c:set var="변수명" value="값" scope="서버영역" /> --%>
	
	<c:set  var="num1" value="10" />
	<!-- 기본적으로 페이지 영역에 저장되는 속성  -->
	${num1 }<br><!-- 바로 출력 가능 -->
	<c:set  var="num2" value="20" />
	${num2 }<br>
	
	<c:set  var="sum" value="${num1+num2 }" />
	${sum}
	
	
	
	
</body>
</html>