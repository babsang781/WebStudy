<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_el</title>
</head>
<body>

	<h1>EL 문법 다루기</h1>
	
	\${true} : ${true}<br>
	\${100 }: ${ 100}<br>
	\${3.14}: ${3.14}<br>
	\${"hello"}: ${"hello" }	<br>
	\${'world'}: ${'world'} <br>
	\${10+5} : ${10+5}<br>
	\${"5"+1} : ${"5"+1 }<br>
	\${"jsp"=="jsp" } : ${"jsp"=="jsp" }<br>
	\${"jsp"=="jsp" } : ${"jsp"=="jss" }<br>
	
	<!-- num 은 속성(attribute): 변수가 아님. 서버에 정해진 속성. 흠... -->
	 \${empty num} : ${empty num}<br>
	\${empty ""} : ${empty ""}<br>
	
	
	
	
</body>
</html>