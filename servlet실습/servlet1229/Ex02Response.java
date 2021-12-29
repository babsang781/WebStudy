package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02Response")
public class Ex02Response extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// response ���� ��ü: ����ڿ��� ��û ����� ���� �� �� ����ϴ� �� ����ü
		// ���� ������: HTML �� ���� ���� ,txt , img �� ����
		
		//**** ��Ÿ ����!!!
		
		//������ �̵� �� ���� - redirect �ڿ� ������ ��
		
		// ���� �������� ������ �����ϴ� �޼ҵ�
		// MIME type: ������ ���� ���� 
		// ���ڵ� : ��ǻ�Ͱ� �ؼ��� �� �ֵ��� ó��
		response.setContentType("text/html; charset=euc-kr"); // ���ڵ� �⺻�� utf-8, ������ ��Ŭ������ euc-kr �� �⺻ ��
		
		// ����ڿ��� �����͸� �����ϱ����� ��ü ����
		PrintWriter out = response.getWriter(); // new �� ���� �ʰ� �޾ƿ�
		
		out.print("<html>");
		out.print("<head><title>response ��ü</title></head>");
		out.print("<body>");
		out.print("<h1>hello servlet!</h1> <br/>hello servlet! <br/>hello servlet! <br/>"
				+ "<hr width=\"150px\" size=\"120px\" color=\"orange\" />"
				+ "<br/><div width=\"200px\" height=\"200px\" bgcolor=\"red\"> "
				+ "<strong><p color=\"blue\">ddd</p>"
				+ "</div> ");
		
		
		out.print("</body>");
		out.print("<html>");
		
		// 220.80.88.62 :8081/Servlet/Ex02Response
		
	}

}
