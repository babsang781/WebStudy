package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetPost")
public class ex07GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Post 방식일 때 한 글깨짐 방지 
		req.setCharacterEncoding("utf-8");// Post방식일 때 필수!
		
		System.out.println("요청이 들어옴..!");

		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("user-id");
		String pw = req.getParameter("user-pw");
		System.out.println(id+" "+ pw);
		
		out.print(id+" ");
		out.print(pw);
	}

//	// Get 방식일때
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("Get방식으로 실행..!");
//
//	}
//	// Post 방식일때
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		System.out.println("Post방식으로 실행..!");
//	}

}
