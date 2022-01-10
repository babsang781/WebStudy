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

		request.setCharacterEncoding("utf-8");
		// 받은 값을 변수에 저장
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		HttpSession session = request.getSession();
		
		if (id.equals("psm") && pw.equals("123")) {
			response.sendRedirect("main.jsp");
			session.setAttribute("id", id);
			session.setAttribute("pw", pw);
		}else {
			response.sendRedirect("loginF.jsp");
		}

		/*
		 * if (cnt > 0) { response.sendRedirect("joinTrue.jsp"); } else {
		 * response.sendRedirect("joinFalse.jsp"); }
		 */

	}

}
