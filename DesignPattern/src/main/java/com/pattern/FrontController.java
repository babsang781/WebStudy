package com.pattern;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// Map�� ����� ������ Map<K,V> Ű�� ����� � �ڷ����� �����ؾ����� �����ؾ� ��.
	// Ŭ������ ? -> �ڷ����̴�. 
	private Map<String, Command> map;

	@Override
	public void init() throws ServletException {
		map = new HashMap<String, Command>();
		// 
		map.put("/insert.do", new InsertService());
		map.put("/update.do", new UpdateService());
		map.put("/delete.do", new DeleteService());
		map.put("/select.do", new SelectService());
		
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// FrontController ����
		// : ������� ��� ��û�� �� ������ ������ �� �ְ� �ϴ� ����
		// : URLMapping�� ��Ѹ� "*.do"�� ����
		// : ��� ��û�� .do �� �ٿ��� �ϳ��� �������� ���� ��

		// getRequestURI()�� reqURI�� ���� �� : /DesignPattern/insert.do
		// getContextPath() : /DesignPattern
		// command: �ʿ� �� /insert.do
//		String reqURI = request.getRequestURI();
//		String contextPath = request.getContextPath();
//		String command2 = reqURI.substring(contextPath.length());
		
		String command = request.getServletPath(); // �ĺ����� ����ϴ� �޼ҵ�
		System.out.println("��û�ĺ���>> " + command);

		Command com = map.get(command);
		com.execute(request, response);
		
//		if (command.equals("/insert.do")) {
//			//������� ��û�� ó���� �� �ִ� ��ü�� �����Ͽ� �Ű������� �ѱ�
//			InsertService insert = new InsertService();
//			insert.execute(request,  response);
//		} else if (command.equals("/update.do")) {
//			UpdateService update = new UpdateService();
//			update.execute(request,  response);
//		} else if (command.equals("/delete.do")) {
//			DeleteService delete = new DeleteService();
//			delete.execute(request,  response);
//		} else if (command.equals("/select.do")) {
//			SelectService select = new SelectService();
//			select.execute(request,  response);
//		} 
		// �̸� �� ������ ����� �ΰ� �����ϸ� ����.
	}

}
