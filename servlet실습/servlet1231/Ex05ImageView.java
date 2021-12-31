package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ImageView")
public class Ex05ImageView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		System.out.println("������ ��û�� ����..!");
		
		int num =0;
		try {
			num = Integer.parseInt(request.getParameter("num"));
		} catch (NumberFormatException e) {
			System.err.println("���ڰ� �Էµ��� ����");
		}

		System.out.println("���޹��� ��>> " + num);
	
		String src = "";
		
		if(num ==1) {
			src = "img/img1.jpg";
		}else if(num ==2) {
			src = "img/img2.jpg";
		}else if(num ==3) {
			src = "img/img3.jpg";
		}else {
			src = "img/img3.jpg";
		}
		
		out.print("<html><head><title>������̹���</title></head><body>");
		out.print("<img src='"+ src+"' alt='�̹����� �ҷ��� �� �����ϴ�.' >");
		out.print("</body></html>");
	}

}
