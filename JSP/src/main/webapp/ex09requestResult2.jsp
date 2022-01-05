<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>ex09결과</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");

	String name_str = request.getParameter("name");
		
	String[] score = request.getParameterValues("score");
	
	
	String[] subject = { "JAVA점수", "WEB점수", "IOT점수", "ANDROID점수" };

	int temp = 0;
	for (int i = 0; i < score.length; i++) {
		temp += Integer.parseInt(score[i]);
	}

	double mean = temp / score.length;
	
	String grade = "";
	if (mean >= 95 && mean <= 100) {
		grade = "A+";
	} else if (mean >= 85 && mean < 95) {
		grade = "A";
	} else if (mean >= 80 && mean < 85) {
		grade = "B+";
	} else if (mean >= 70 && mean < 80) {
		grade = "C";
	} else {
		grade = "F";
	}
	%>

	<fieldset>
		<legend>학사 관리 로그인</legend>
		<table width="300px">
			<tr>
				<td align="left">이름</td>
				<td align="left"><%=name_str%></td>
			</tr>

			<%
			for (int i = 0; i < 4; i++) {
			%>
			<tr>
				<td align="left"><%=subject[i]%></td>
				<td align="left"><%=score[i]%></td>
			</tr>

			<%
			}
			%>

			<tr>
				<td align="left">평균</td>
				<td align="left"><%=mean%></td>
			</tr>
			
			<tr>
				<td align="left">학점</td>
				<td align="left"><%=grade%></td>
			</tr>

		</table>

	</fieldset>
</body>
</html>