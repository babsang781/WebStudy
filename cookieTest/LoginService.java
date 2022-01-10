package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/*순서: 
		* 1) <form -submit> 전달받음(post) - (한글시 인코딩) - 값을 변수에 저장
		* 2) if( id/pw true){session 생성)[위에서 생성하고 아닐 경우에 지우면 메모리 낭비]
		* 3) 조건에 해당하는 .jsp 로 이동.  끝.  
		*/
		
		request.setCharacterEncoding("utf-8");  // 한글 인코딩 req.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");  // 값 받기 req.getParameter("이름");
		String pw = request.getParameter("pw");

		HttpSession session = request.getSession();  // 세션 생성할 세션 변수 생성* import 중요* HttpSession session = req.getSession();
		
		if (id.equals("psm") && pw.equals("123")) {  
			session.setAttribute("id", id);  // 세션 생성
			session.setAttribute("pw", pw);
			response.sendRedirect("main.jsp");  // 연결될 페이지로 이동 resp.sendRedirect("main.jsp");
		}else {
			response.sendRedirect("loginF.jsp");
		}


	}

}
