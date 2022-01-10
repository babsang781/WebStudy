<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로긴세션</title>
</head>
<body>
	/* 로그인은 보안을 위해 session을 사용하고, 
	* 이 직전 예제에서 세션을 생성했을 경우에 .jsp 에서 별도의 생성 없이 바로 표현식을 사용했음.
	* 즉, 세션 생성된 뒤일 경우, 다른 jsp 페이지에서 표현식, 스크립트릿으로 곧장 사용 가능
	*/
	
    <% if(session.getAttribute("id") == null){ %>  // if (로그인 세션이 없다면), 
	
	<h1>로그인 페이지</h1>
	<form action="LoginService" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>PW:</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="로그인">
			</tr>
		</table>
	</form>
	
    <% }else{ %>  // else 아니라면 ( 로그인 세션이 있다면 ),
	
	<h1><%=session.getAttribute("id")%>님 환영합니다!</h1>
	<span>로그인 중입니다.</span><br/>
	<a href="logout.jsp">로그아웃하기</a> 

    <%} %>

</body>
</html>
