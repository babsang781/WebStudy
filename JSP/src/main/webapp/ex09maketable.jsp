<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% String room_str = request.getParameter("room");
		int room = Integer.parseInt(room_str);
		String floor_str = request.getParameter("floor");
		int floor = Integer.parseInt(floor_str);
		
	%>

	<table border="1px solid black">
		<%
			for (int i = 1; i <= floor; i++) {
				out.print("<tr>");
				
					for(int j = 1 ; j<=room;j++){
						out.print("<td>" + j + "</td>");
					}
					
					out.print("</tr>");
			}
		%>	

	</table>
	
</body>
</html>