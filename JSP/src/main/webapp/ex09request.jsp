<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>직접확인프로그램</title>
</head>
<body>
	
	<form action="ex09requestResult.jsp" method="post">
		<table>
			<tr>
				<td align ="left">이름</td>
				<td align ="left"><input type="text"name="name"></td>
			</tr>		
			<tr>
				<td align ="left">JAVA점수</td>
				<td align ="left"><input type="text" name="java"></td>
			</tr>		
			<tr>
				<td align ="left">WEB점수</td>
				<td align ="left"><input type="text"name="web"></td>
			</tr>		
			<tr>
				<td align ="left">IOT점수</td>
				<td align ="left"><input type="text"name="iot"></td>
			</tr>		
			<tr>
				<td align ="left">ANDROID점수</td>
				<td align ="left"><input type="text"name="android"></td>
			</tr>		
			<tr>
			<td colspan="2" align = "center" value="확인하기!"><input type="submit"></td></tr>
		</table>
	</form>
</body>
</html>