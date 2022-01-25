<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03_jstl_if.jsp</title>
</head>
<body>

	${param.num1 } ${param.num2 } ${param.num1 + param.num2 }

	<%-- 자바의 if 문과 같은 역할(기능):
	 <c:if test="조건식"></c:if> --%>
	<c:set var="sum" value="${(param.num1 + param.num2)}" />
	<c:if test="${sum%2 ==0 }">
		<h2>${sum}는짝수입니다.</h2>
	</c:if>
	<c:if test="${sum%2 ==1 }">
		<h2>${sum}는홀수입니다.</h2>
	</c:if>
	<%--- ----------------------------------------------- -->- --%>

	<%-- <c: <c:choose, <c:when, <c:otherwise: 
	
	when태그 : if, else if 
	otherwise 태그 : else --%>
	<c:choose>
		<c:when test="${sum%2==0 }">
			<h2>${sum}는짝수입니다.</h2>
		</c:when>
		<c:otherwise>
			<h2>${sum}는홀수입니다.</h2>
		</c:otherwise>
	</c:choose>
</body>
</html>