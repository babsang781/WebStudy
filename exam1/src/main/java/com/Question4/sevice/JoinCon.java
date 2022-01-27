package com.Question4.sevice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Question4.model.BookDTO;

@WebServlet("/JoinCon")
public class JoinCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");

		BookDAO dao = new BookDAO();
		BookDTO dto = new BookDTO(id, pw, nick, email, tel);
		
		int cnt = dao.insert_member(dto);

		if (cnt > 0) {
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('회원가입 성공!');");
			out.print("location.href='Question4_Login.jsp';");
			out.print("</script>");
		} else {
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('회원가입 실패');");
			out.print("location.href='Question4_Join.jsp';");
			out.print("</script>");
		}

	}

}
