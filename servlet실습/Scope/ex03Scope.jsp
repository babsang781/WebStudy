<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Integer count = (Integer)session.getAttribute("count");
	if(count == null){
		session.setAttribute("count", 1);
	}else{
		count+=1;
		session.setAttribute("count", count);
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03scope</title>
</head>
<body>
	<h1>현재 페이지 조회수: <%=session.getAttribute("count") %></h1>
	
</body>
</html>