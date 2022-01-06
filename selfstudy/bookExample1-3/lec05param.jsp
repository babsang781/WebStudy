<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>서블릿</title>
	<script type="text/javascript" src="param.js"></script>
</head>
<body>
	<form action="ParamServlet" method="get">
	아이디:<input type="text" name ="name"><br/>
	나이 :<input type="text" name ="age"> <br/>
	<input type="submit"value="전송" onclick="return check()"></form>
</body>
</html>
