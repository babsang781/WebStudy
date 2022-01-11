<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01</title>
</head>
<body>
	<%
	// Scope: 웹 서버의 저장할 수 있는 영역(범위), 아래는 스코프의 종류.
	// 1. pageContext : 하나의 웹 페이지 안에서 정보를 저장하는 영역 예시)
	// 2. request : 하나 이상의 웹 페이지 안에서 정보를 저장하는 영역
	// ** (forward 방식으로 이동할 경우, 데이터를 가지고 넘어간다.) ** 
	// 3. session : 하나의 브라우저 안에서 정보를 저장하는 영역, 브라우저 종료 시점.
	// 4. application : 하나의 웹 어플리케이션 안에서 정보를 저장하는 영역

	//
	pageContext.setAttribute("page","100");
	request.setAttribute("request","200");
	session.setAttribute("session","300");
	application.setAttribute("application","400");
	// 조회수 같은 경우 브라우저와 상관 없이 카운트 되기 때문에 application 영역에서 관리
	

%>
	page영역: <%=pageContext.getAttribute("page") %><br/>
	request영역: <%=request.getAttribute("request") %><br/>
	session영역: <%=session.getAttribute("session") %><br/>
	application영역: <%=application.getAttribute("application") %><br/>
	
	
	<% 
	 response.sendRedirect("ex02Scope.jsp");	
	// response.sendRedirect 방식으로는 request 자료를 가지고 갈 수 없음. 
	// sendRedirect 요청이 2 번일어나는 방식, req, resp 가 변경됨. 가지고 갈 수 없음.
	
	// forward 방식: 웹 서버 내부에서만 이동하는 기술
	// - dispatcher.forward(request, response) 로 정보를 가지고 넘어갈 수 있음
	// - URL의 변화가 없음
	// - 
	/* 
	RequestDispatcher dispatcher = request.getRequestDispatcher("ex02Scope.jsp");
	dispatcher.forward(request, response);  // 이렇게 해줘야 req, resp 정보를 가지고 넘어감
	 
 */	
 
 
	%>
	
	
	

</body>
</html>