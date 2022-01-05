<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>랜덤 결과!</title>
</head>
<body>
	<%
	String title = request.getParameter("title");
	String[] item = request.getParameterValues("item");
	Random rd = new Random();
	String result = item[rd.nextInt(item.length)];
	%>

	<div style="text-align: center;">
			<h3>! 랜덤 결과 !</h3>

			<%=title %><br>
			<%=result %>
	</div>
</body>
</html>