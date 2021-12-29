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
		
		// response 응답 객체: 사용자에게 요청 결과를 보내 줄 때 사용하는 ㄱ ㅐㄱ체
		// 응답 데이터: HTML 와 같은 문서 ,txt , img 등 파일
		
		//**** 오타 주의!!!
		
		//페이지 이동 도 응답 - redirect 뒤에 설명할 것
		
		// 응답 데이터의 포맷을 설정하는 메소드
		// MIME type: 데이터 포맷 설정 
		// 인코딩 : 컴퓨터가 해석할 수 있도록 처리
		response.setContentType("text/html; charset=euc-kr"); // 인코딩 기본값 utf-8, 하지만 이클립스가 euc-kr 이 기본 값
		
		// 사용자에게 데이터를 전달하기위한 객체 생성
		PrintWriter out = response.getWriter(); // new 를 하지 않고 받아옴
		
		out.print("<html>");
		out.print("<head><title>response 객체</title></head>");
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
