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
		System.out.println("서버에 요청이 들어옴..!");
		
		int num =0;
		try {
			num = Integer.parseInt(request.getParameter("num"));
		} catch (NumberFormatException e) {
			System.err.println("숫자가 입력되지 않음");
		}

		System.out.println("전달받은 값>> " + num);
	
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
		
		out.print("<html><head><title>고양이이미지</title></head><body>");
		out.print("<img src='"+ src+"' alt='이미지를 불러올 수 없습니다.' >");
		out.print("</body></html>");
	}

}
