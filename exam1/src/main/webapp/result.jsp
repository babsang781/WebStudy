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
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String[] fruit = request.getParameterValues("fruit");
	String fruits="";
	
	String[] hobby = request.getParameterValues("hobby");
	String hobbys = "";

	for (int i = 0; i < fruit.length; i++) {
		fruits += fruit[i] + " ";
	}
	%>

	<table border="1">
		<tr align="center">
			<td>이름</td>
			<td><%=name%></td>
		</tr>
		<tr align="center">
			<td>좋아하는 과일</td>
			<td>
				<%=fruits %>
			</td>
		</tr>
	</table>



</body>
</html>