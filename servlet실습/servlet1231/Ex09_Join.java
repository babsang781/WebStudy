package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("Join")
public class Ex09_Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");// Post방식일 때 필수!
		System.out.println("요청이 들어옴..!");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
	
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobbys");
		String birthday = request.getParameter("birthday");
		String color = request.getParameter("color");
		String country = request.getParameter("country");
		String talk = request.getParameter("talk");
		
		
		out.print("<html><head><title>응답결과</title></head>");
		out.print("<body>");
		out.print("<br/>ID: "+id);
		out.print("<br/>NAME: "+name);
		out.print("<br/>EMAIL: "+email);
		out.print("<br/>GENDER: "+gender);
		out.print("<br/>HOBBY: "+Arrays.toString(hobby));
		out.print("<br/>BIRTHDAY: "+birthday);
		out.print("<br/>COLOR: "+color);
		out.print("<br/>COUNTRY: "+country);
		out.print("<br/>TALK: "+talk);
		
		
		
		
		
		
		out.print("</body></html>");

		
	
	
	}

}
