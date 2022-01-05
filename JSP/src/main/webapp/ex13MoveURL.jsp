<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>MoveURL</title>
</head>
<body>
	<%
	
	request.setCharacterEncoding("utf-8");
	String pages = request.getParameter("url");

	/* 
	*만약 option value에 url을 받아왔을 경우,
	* response.sendRedirect(url); 로 해서 if 문 없이 사용 가능 
	*/
	
	if (pages.equals("네이버")) {
		response.sendRedirect("https://www.naver.com");
	} else if (pages.equals("다음")) {
		response.sendRedirect("https://www.daum.net");
	} else if (pages.equals("구글")) {
		response.sendRedirect("https://www.google.com");
	}
	
	%>
	
</body>
</html>