package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex01Request")
public class Ex01Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// �Ű����� request �� response �� �������̽��� ���� �ۼ��Ǿ� ����. 
		// �������� ������ �ּ�, ���� ���� ��Ƽ� ������,
		// �׷� ������ ������ �ش� ������ ����ְ�, �ش� ������ ������.�� �� ���� ��.
		
		// request(��û��ü): ����ڰ� ��û�� ���� �� ������� ������ �����ϴ� ��ü
		// ����: IP, ����������( ����, ��� , ���ڵ���� ���..), ����ڰ� �Է��� ������
		// �ϴ��� �ַ� ����� �Է� ������ �ٷ�� �� ��
		
		// ����� ip �˾ƺ��� �ǽ�
		
		String ip = request.getRemoteAddr();
		
		System.out.println("������ IP >> "+ip);
		
		if(ip.equals("222.102.104.24") ||ip.equals("121.147.155.180") ||ip.equals("220.80.88.62")||ip.equals("211.63.240.99")|| ip.equals("220.93.229.187")) {
			System.out.println("�츮 1�� ������Ʈ ���� ȯ���մϴ�!");
			
			OutputStream os = response.getOutputStream();
	        PrintStream out = new PrintStream(os, true);
	        out.println("�츮 �� hello! ");
			
		}else if(ip =="59.0.236.207") {
			System.out.println("����� ȯ���մϴ�!");
		}else {
			System.out.println("�մ� ȯ���մϴ�!");
		}
//		211.223.37.175
//		http://211.223.37.175:8081/Servlet/Ex01Request
//		
		
	}

}
