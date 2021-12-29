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

		response.setContentType("text/html; charset=utf-8"); // 인코딩 기본값 utf-8, 하지만 이클립스가 euc-kr 이 기본 값

		// 사용자에게 데이터를 전달하기위한 객체 생성
		PrintWriter out = response.getWriter(); // new 를 하지 않고 받아옴
		String ip = request.getRemoteAddr();

		out.print("<html>");
		out.print("<head><title>request&response 실습</title></head>");
		out.print("<body>");

		if (ip.equals("") || ip.equals("") || ip.equals("")
				|| ip.equals("") || ip.equals("")) {

			out.println("<h1>우리 팀 hello!</h1>");
		} else if (ip.equals("")) {
			out.println("<h1>안녕 찬호야! 환영!</h1>");
		} else if (ip.equals("")) {
			out.println("<h2>범수 왔나!ㅋㅋ</h2>");
		} else if (ip.equals("") {
			out.println("<h3>강사님 환영합니다!</h3>");
		} else {
			out.println("<h3>손님 환영합니다!</h3>");
		}
		out.println("<hr size=\"10px\" color=\"orange\" />");
		out.println("<ul>");
		out.println("<li><a href=\"http://www.naver.com\">네이버</a></li>");
		out.println("<li><a href=\"https://start211120.tistory.com\">블로그 start211120</a></li>"
				+ "</ul>");
		out.println("<hr size=\"10px\" color=\"orange\" />");
		out.print(""
				+ "<table border=\"10px solid black\" align=\"center\">\r\n"
				+ "      <caption>"
				+ "        메뉴판"
				+ "      </caption>"
				+ "      <tr bgcolor=\"yellow\" height=\"50px\" align=\"center\">\r\n"
				+ "        <th>메뉴</th>"
				+ "        <th>가격</th>"
				+ "      </tr>"
				+ "      <tr align=\"center\">\r\n"
				+ "        <td>아이스 아메리카노</td>\r\n"
				+ "        <td>3500원</td>\r\n"
				+ "      </tr>\r\n"
				+ "      <tr align=\"center\">\r\n"
				+ "        <td>아이스 카페라떼</td>\r\n"
				+ "        <td>4500원</td>\r\n"
				+ "      </tr>\r\n"
				+ "    </table>");
		
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
