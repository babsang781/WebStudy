<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>exam11createInput.jsp</title>
</head>
<body>
	<%
	int num = Integer.parseInt(request.getParameter("num"));
	%>

	<div style="text-align: center;">
		<form action="ex11randomWinner.jsp" >
			<h4>랜덤 메뉴 작성</h4>

			주제: <input type="text" name="title"><br>

			<%
			for (int i = 0; i < num; i++) {
			%>

			아이템<%=(i + 1)%>: <input type="text" name="item"><br>

			<%
			}
			%>
			<input type="submit" value="시작">

		</form>
	</div>
</body>
</html>