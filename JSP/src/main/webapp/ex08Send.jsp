<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>send</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8");
		
		String text = request.getParameter("text");
	
	%>
	
	전달받은 결과: <%=text %> 
</body>
</html>