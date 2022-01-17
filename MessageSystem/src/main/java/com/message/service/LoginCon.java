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

@WebServlet("/LoginCon")
public class LoginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	MemberDTO member = null;
	MemberDAO dao= new MemberDAO();
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// �̸��� , pw �� �����ͼ� �α��� ��� ���� , �α� ������ session ������ email ���� �����ϰ�  main.jsp �� �̵�
		request.setCharacterEncoding("utf-8");
		String M_email = request.getParameter("email");
		String M_pw = request.getParameter("pw");
		
		member =dao.memberLogin(M_email, M_pw);
		if(member != null) {
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			response.sendRedirect("main.jsp");
		}else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('�α��� ����');");
			out.print("location.href='main.jsp';");
			out.print("</script>");
		}
		
		
		
	}

}
