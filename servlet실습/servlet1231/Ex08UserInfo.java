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
		
//		String food = request.getParameter("food1");  // ���� name���� ������ value �� ���� ���� �޾Ƶ����� ����. ù��° ������ ����
		//checkbox Ÿ���� ���� ������ ���� �Ʒ� �޼ҵ� Ȱ��!
		//or name �Ӽ����� ������ �������� �Է°��� ������ ��
		// ���ڿ� �迭�� ��ȯ!
		
		String[] foods =request.getParameterValues("food");
		
		System.out.println(Arrays.toString(foods));
	
	}

}
