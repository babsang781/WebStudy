<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 

request.setAttribute("id","smhrd");
request.setAttribute("pw","1234");
session.setAttribute("name","스인개");
application.setAttribute("email","smhrd@smhrd.or.kr");

/* ex3_el_result.jsp 로 이동 
forward 방식으로 이동*/
RequestDispatcher dispatcher = request.getRequestDispatcher("ex3_el_result.jsp");
dispatcher.forward(request, response);



%>


</body>
</html>