package com.message.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.message.model.MemberDTO;

@WebServlet("/MemberSelectAllCon")
public class MemberSelectAllCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ArrayList<MemberDTO> m_list = new ArrayList<MemberDTO>();
		MemberDAO dao = new MemberDAO();

		m_list = dao.memberSelectAll();		
		
		if (m_list != null) {
			
			request.setAttribute("m_list",m_list);
			RequestDispatcher dispatcher = request.getRequestDispatcher("select.jsp");
			dispatcher.forward(request, response); // 이렇게 해줘야 req, resp 정보를 가지고 넘어감
		} else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('회원목록 가져오기 실패');");
			out.print("location.href='main.jsp';");
			out.print("</script>");
		}

	}

}
