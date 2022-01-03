<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>room</title>
</head>
<body>
	<%
	String a = "<table border='3px solid black' ><tr height=\"35px\" bgcolor=\"whitesmoke\">";
	for (int i = 1; i <= 10; i++) {
		a = a + "<td width=30px align='center' bgcolor = \"ivory\">" + i + "</td>";
	}
	a = a + "</tr></table>";
	%>
	
	10개의 룸 :
	<%=a%>

	<table border='1px solid black'>
		<tr>
		
			<%
			for (int i = 1; i <= 10; i++) {
			%>
			
			<td><%=i%></td>
			
			<%
			}
			%>

		</tr>
	</table>

</body>
</html>