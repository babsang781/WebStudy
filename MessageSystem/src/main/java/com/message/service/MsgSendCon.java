package com.message.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.message.model.MessageDTO;

@WebServlet("/MsgSendCon")
public class MsgSendCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String m_sendName = req.getParameter("name");
		String m_recieveEmail= req.getParameter("email");
		String m_content= req.getParameter("message");
		
		MessageDAO dao= new MessageDAO();
		MessageDTO dto =null;
		
		int cnt = dao.sendMessage(new MessageDTO(0,m_sendName, m_recieveEmail,m_content, null));
		
		if(cnt>0) {
			resp.sendRedirect("main.jsp");
		
		}else {
			resp.setContentType("text/html; charset=utf-8");
			PrintWriter out = resp.getWriter();
			out.print("<script>");
			out.print("alert('메세지 전송 실패');");
			out.print("location.href='main.jsp';");
			out.print("</script>");
			
		}
	}

}
