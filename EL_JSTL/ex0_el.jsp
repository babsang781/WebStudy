<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex0_el</title>
</head>
<body>
	<!-- hello world 출력  -->
	<h2> <%="hello world!" %></h2>
	<h2><% out.print("hello world"); %></h2>
	
		<h2>${"hello world!"} </h2>
	
</body>
</html>