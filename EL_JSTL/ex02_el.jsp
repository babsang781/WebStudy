<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");
String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String email = request.getParameter("email");
String[] hobby = request.getParameterValues("hobby");

String hobbys = "";

for (int i = 0; i < hobby.length; i++) {
	hobbys += hobby[i] + " ";
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_el</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>패스워드</td>
			<td>이름</td>
			<td>이메일</td>
			<td>취미</td>
		</tr>
		<tr>
			<td><%=id%></td>
			<td><%=pw%></td>
			<td><%=name%></td>
			<td><%=email%></td>
			<td><%=hobbys%></td>
		</tr>
		<tr><!-- EL 문법으로 작성해보기 
				값 접근 형식 : param.imput 태그의 name 속성-->
			<!-- param 객체 : java 코드의 request.getParameter()역할을 함 -->
			<!-- paramValues 객체 : java 코드의 request.getParameterValues()역할을 함 -->
			<td>${param.id}</td>
			<td>${param.pw }</td>
			<td>${param.name }</td>
			<td>${param.email}</td>
			<td>${paramValues.hobby[0]} ${paramValues.hobby[1]}</td>
		</tr>



	</table>

</body>
</html>