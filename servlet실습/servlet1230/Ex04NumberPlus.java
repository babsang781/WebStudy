package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberPlus")
public class Ex04NumberPlus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8"); 
		PrintWriter out = response.getWriter(); 

		System.out.println("������ ��û�� ����..!");
		// ����ڰ� request �Է��� ������ ��������!
		
		String num1str = request.getParameter("num1");
		String num2str = request.getParameter("num2");
		int num1 = Integer.parseInt(num1str);
		int num2 = Integer.parseInt(num2str);
//		int number = Integer.parseInt(request.getParameter("number"));
		
		
		System.out.println("���޹��� ��>> " + num1 +", "+num2);
		
		
		out.print("<html><head><title>������</title></head>");
		out.print("<body><h1>���</h1> "
				+ "<h2> : "+num1+"+"+num2+"="+(num1+num2)+"</h2></body></html>");
	
	
	
	
	}

}
