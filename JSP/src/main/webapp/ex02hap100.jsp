<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int sum =0;
	for(int i = 1 ; i<=100;i++){
		sum+=i;
	}
	
	%>
	<p>1~100 까지의 합은: <%=sum %> 입니다.</p>
	<hr width="<%=sum/5%>x" size = "10px" color ="red">
	
</body>
</html>