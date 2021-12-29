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
		// 매개변수 request 와 response 는 인터페이스로 설정 작성되어 있음. 
		// 브라우저가 서버에 주소, 내용 등을 담아서 보내면,
		// 그런 정보를 서버가 해당 정보를 담아주고, 해당 정보를 응답함.그 후 삭제 됨.
		
		// request(요청객체): 사용자가 요청을 했을 때 사용자의 정보를 저장하는 객체
		// 정보: IP, 브라우저정보( 버전, 언어 , 인코딩방식 등등..), 사용자가 입력한 정보들
		// 일단은 주로 사용자 입력 정보를 다루게 될 것
		
		// 사용자 ip 알아보기 실습
		
		String ip = request.getRemoteAddr();
		
		System.out.println("접속한 IP >> "+ip);
		
		if(ip.equals("222.102.104.24") ||ip.equals("121.147.155.180") ||ip.equals("220.80.88.62")||ip.equals("211.63.240.99")|| ip.equals("220.93.229.187")) {
			System.out.println("우리 1차 프로젝트 팀원 환영합니다!");
			
			OutputStream os = response.getOutputStream();
	        PrintStream out = new PrintStream(os, true);
	        out.println("우리 팀 hello! ");
			
		}else if(ip =="59.0.236.207") {
			System.out.println("강사님 환영합니다!");
		}else {
			System.out.println("손님 환영합니다!");
		}
//		211.223.37.175
//		http://211.223.37.175:8081/Servlet/Ex01Request
//		
		
	}

}
