package com.message.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.message.service.MemberDAO;
import com.message.model.MemberDTO;

@WebServlet("/JoinCon")
public class JoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	MemberDTO dto = new MemberDTO();
	MemberDAO dao = new MemberDAO();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �̸��� �н����� ��ȣ �ּ� ��������

		request.setCharacterEncoding("utf-8");
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");

		int cnt = dao.memberJoin(new MemberDTO(email, pw, tel, address));
		// DAO ȸ�����Ա�� �����ؼ� ��� ����
		if ( cnt > 0 ) {
			// ȸ������ ������ ������ ������� email �ּ� ����
			request.setAttribute("success_data",email);
			RequestDispatcher dispatcher = request.getRequestDispatcher("join_success.jsp");
			dispatcher.forward(request, response);
		}else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('ȸ������ ����');");
			out.print("location.href='main.jsp';");
			out.print("</script>");
		}

	}

}