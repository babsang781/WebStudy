package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MakeTable")
public class Ex06MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		System.out.println("������ ��û�� ����..!");
		// ����ڰ� request �Է��� ������ ��������!
		int num =0;
		try {
			String num_str = request.getParameter("num");
			num = Integer.parseInt(num_str);
			
			
		} catch (NumberFormatException e) {
			System.err.println("���ڸ� �Է����ֽʽÿ�");
		}

		System.out.println("���޹��� ��>> " + num);

		out.print("<html><head><title>������</title></head>");
		out.print("<body><table border=\"3px solid black\" ><tr height=\"35px\" bgcolor=\"whitesmoke\">");
				
		for( int i = 0;i<num;i++) {
			out.print("<td width=\"20px\" align=\"center\" bgcolor = \"ivory\">"+(i+1)+"</td>");
			
		}
		
		
		
		out.print("</tr></table></body></html>");

	}

}
