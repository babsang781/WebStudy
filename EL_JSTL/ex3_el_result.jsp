<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <% 
 String id = (String)request.getAttribute("id");
 String pw = (String)request.getAttribute("pw");
 String name= (String)session.getAttribute("name");
 String email= (String)application.getAttribute("email");
 %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<tr>
			<td>아이디</td>
			<td>패스워드</td>
			<td>이름</td>
			<td>이메일</td>
		</tr>
		<tr>
			<td><%=id%></td>
			<td><%=pw%></td>
			<td><%=name%></td>
			<td><%=email%></td>
		</tr>
		<tr>
			<%-- ${서버영역에 저장된 값의 name 값 } --%>
			<td>${id}</td>
			<td>${pw }</td>
			<td>${name }</td>
			<td>${email}</td>
			<%-- ${ 이게 왜 바로 출력이 되냐면 접근 순서 문제 ; page 찾고> requsest 찾고,>  
			session 찾고>application에서 찾는 순서 } --%>
		</tr>
		<tr>
			<%-- ${서버영역에 저장된 값을 접근할 때 해당 영역을 명시해서 접근하면 
			더 정확하게 가지고 홀 수 있음. 각각 다른 영역에 같은 속성이 있는 경우가 있을 수 있음} --%>
			<td>${requestScope.id}</td>
			<td>${sessionScope.pw }</td> <!-- 잘못된 영역에서 가져오면 안 나옴. -->
			<td>${sessionScope.name }</td>
			<td>${applicationScope.email}</td>
			<%-- ${ 이게 왜 바로 출력이 되냐면 접근 순서 문제 ; page 찾고> requsest 찾고,>  
			session 찾고>application에서 찾는 순서 } --%>
		</tr>
	</table>
</body>
</html>