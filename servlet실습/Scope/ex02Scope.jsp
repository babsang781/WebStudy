<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02</title>
</head>
<body>
	<!-- 저장하는 코드 날리고, 출력 코드 만,  -->
	page영역: <%=pageContext.getAttribute("page") %><br/>
	request영역: <%=request.getAttribute("request") %><br/>
	session영역: <%=session.getAttribute("session") %><br/>
	application영역: <%=application.getAttribute("application") %><br/>

</body>
</html>