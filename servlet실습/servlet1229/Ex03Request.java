package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03Request")
public class Ex03Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8"); // ���ڵ� �⺻�� utf-8, ������ ��Ŭ������ euc-kr �� �⺻ ��

		// ����ڿ��� �����͸� �����ϱ����� ��ü ����
		PrintWriter out = response.getWriter(); // new �� ���� �ʰ� �޾ƿ�
		String ip = request.getRemoteAddr();

		out.print("<html>");
		out.print("<head><title>request&response �ǽ�</title></head>");
		out.print("<body>");

		if (ip.equals("222.102.104.24") || ip.equals("121.147.155.180") || ip.equals("220.80.88.62")
				|| ip.equals("211.63.240.99") || ip.equals("220.93.229.187")) {

			out.println("<h1>�츮 �� hello!</h1>");
		} else if (ip == "http://220.80.203.113/") {
			out.println("<h1>�ȳ� ��ȣ��! ȯ��!</h1>");
		} else if (ip == "59.0.236.189") {
			out.println("<h2>���� �Գ�!����</h2>");
		} else if (ip == "59.0.236.207") {
			out.println("<h3>����� ȯ���մϴ�!</h3>");
		} else {
			out.println("<h3>�մ� ȯ���մϴ�!</h3>");
		}
		out.println("<hr size=\"10px\" color=\"orange\" />");
		out.println("<ul>");
		out.println("<li><a href=\"http://www.naver.com\">���̹�</a></li>");
		out.println("<li><a href=\"https://start211120.tistory.com\">��α� start211120</a></li>"
				+ "</ul>");
		out.println("<hr size=\"10px\" color=\"orange\" />");
		out.print(""
				+ "<table border=\"10px solid black\" align=\"center\">\r\n"
				+ "      <caption>"
				+ "        �޴���"
				+ "      </caption>"
				+ "      <tr bgcolor=\"yellow\" height=\"50px\" align=\"center\">\r\n"
				+ "        <th>�޴�</th>"
				+ "        <th>����</th>"
				+ "      </tr>"
				+ "      <tr align=\"center\">\r\n"
				+ "        <td>���̽� �Ƹ޸�ī��</td>\r\n"
				+ "        <td>3500��</td>\r\n"
				+ "      </tr>\r\n"
				+ "      <tr align=\"center\">\r\n"
				+ "        <td>���̽� ī���</td>\r\n"
				+ "        <td>4500��</td>\r\n"
				+ "      </tr>\r\n"
				+ "    </table>");
		
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
