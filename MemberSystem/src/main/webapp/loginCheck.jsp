<%@page import="java.net.URLEncoder"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>loginCheck</title>
</head>
<body>
	<%
	
	// login.html 에서 입력된 id, pw  값을 변수에 저장
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	// jdbc 연결을 통해서 로그인 기능 구현
	//jdbc 연결과정: 
	//1. OracleDriver 연결
	//2. DB연결(Connection)
	//3. 쿼리문 작성/ 쿼리문 실행
	//4. DB 연결종료
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user ="hr";
	String password = "hr";  
	// 실습 중에는 안 바뀌겠지만, 프로젝트 진행하면 localhost:1521 과 id ,pw가 바뀔 것
	
	Connection conn = DriverManager.getConnection(url, user, password);

	if(conn == null) out.print("DB연결실패.");
	else out.print("DB연결성공!");
	
	String sql = "select * from s_member where m_id=? and m_pw=?";
	PreparedStatement psmt=conn.prepareStatement(sql);
	
	psmt.setString(1, id);
	psmt.setString(2, pw);
	
	ResultSet rs = psmt.executeQuery();

	if(rs.next()){   // next 변수는 한 번에 한 칸만 내려가서 true/false 반환, 데이터를 가져올 수 있음
	 	String nick = rs.getString(3);  // rs.getString("m_nick") 과 같은 결과. 컬
	 	//
	 	// URL 주소창에 한글 데이터 전달할 때는 
	 	//URLEncoder.encode(문자열 데이터, 인코딩 방식); 
	 	
	 	response.sendRedirect("loginTrue.jsp?nick="+ URLEncoder.encode(nick,"UTF-8"));
	}else{
		response.sendRedirect("loginFalse.jsp");
	}
	
	rs.close();
	psmt.close();
	conn.close();
	
	/* if(id.equals("smhrd") && pw.equals("1234")){
		response.sendRedirect("loginTrue.jsp?id="+id);
	}else{
		response.sendRedirect("loginFalse.jsp");	
	} */
	
	%>
</body>
</html>