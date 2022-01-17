package com.message.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.message.model.MemberDTO;

@WebServlet("/UpdateCon")
public class UpdateCon extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO member=(MemberDTO) session.getAttribute("member");

		request.setCharacterEncoding("utf-8");
		
		String M_email = member.getM_email();
		String M_pw = request.getParameter("pw");
		String M_tel = request.getParameter("tel");
		String M_address = request.getParameter("address");
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.update(new MemberDTO(M_email, M_pw, M_tel, M_address));

		if (cnt > 0) {
			session.setAttribute("member", new MemberDTO(M_email, M_pw, M_tel, M_address));
			response.sendRedirect("main.jsp");
		} else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('회원정보 수정 실패');");
			out.print("location.href='main.jsp';");
			out.print("</script>");
		}

	}

}
