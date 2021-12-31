package com.smhrd.servlet1231;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInfo")
public class Ex08UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
//		String food = request.getParameter("food1");  // 같은 name으로 복수의 value 가 오는 것을 받아들이지 못함. 첫번째 값만을 받음
		//checkbox 타입의 값을 접근할 때ㅔ 아래 메소드 활용!
		//or name 속성값이 동일한 여러개의 입력값을 접근할 때
		// 문자열 배열로 반환!
		
		String[] foods =request.getParameterValues("food");
		
		System.out.println(Arrays.toString(foods));
	
	}

}
