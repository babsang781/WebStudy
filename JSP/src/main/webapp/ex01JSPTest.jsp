<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- jsp에서 정수형 변수 num 에 100을 넣고 웹 페이지에 출력: 소스가 숨겨지지 않음F12로 보이는 부분-->
	<%-- jsp 주석: jsp 에서 java 코드를 사용하고 싶다면 스크립트릿으 사용한다.--%>	
	<%
	// java 주석
	int num = 10;
	%>
	<%-- jsp 에서 java 변수의 값으 웹 페이지로 꺼내고 싶을 때는 표현식을 사용한다.--%>
	num의 값 : 'hr' 선 두께 <%= num %><br/>
	
	<hr width="500px" size = "<%=num%>px" color ="red">
	
	
	
	
</body>
</html>