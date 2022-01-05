<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>ex09결과</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8");
	
	String name_str = request.getParameter("name");
	String java_str = request.getParameter("java");
	int java = Integer.parseInt(java_str);
	String web_str = request.getParameter("web");
	int web = Integer.parseInt(web_str);
	String iot_str = request.getParameter("iot");
	int iot = Integer.parseInt(iot_str);
	String adroid_str = request.getParameter("android");
	int android = Integer.parseInt(adroid_str);
	
	
	
	
	double mean = (java+web+iot+android)/4;
	String grade ="";
	if(mean>=95 &&mean<=100){
		grade = "A+";
	} else if(mean>=85 &&mean<95){
		grade = "A";
	}else if(mean>=80 &&mean<85){
		grade = "B+";
	}else if(mean>=70 &&mean<80){
		grade = "C";
	}else{
		grade = "F";
	}
	
	%>
	<fieldset>
	 <legend>학사 관리 로그인</legend>
	<table>
			<tr>
				<td align ="left">이름</td>
				<td align ="left"><%=name_str %></td>
			</tr>		
			<tr>
				<td align ="left">JAVA점수</td>
				<td align ="left"><%=java %></td>
			</tr>		
			<tr>
				<td align ="left">WEB점수</td>
				<td align ="left"><%=web %></td>
			</tr>		
			<tr>
				<td align ="left">IOT점수</td>
				<td align ="left"><%=iot %></td>
			</tr>		
			<tr>
				<td align ="left">ANDROID점수</td>
				<td align ="left"><%=android %></td>
			</tr>		
			<tr>
				<td align ="left">평균</td>
				<td align ="left"><%=mean %></td>
			</tr>		
			<tr>
				<td align ="left">학점</td>
				<td align ="left"><%=grade %></td>
			</tr>		
			
		</table>
	
	</fieldset>
</body>
</html>