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
	// Map을 쓰기로 했으면 Map<K,V> 키와 밸류에 어떤 자료형을 설정해야할지 결정해야 함.
	// 클래스는 ? -> 자료형이다. 
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

		// FrontController 패턴
		// : 사용자의 모든 요청을 한 곳으로 전송할 수 있게 하는 구조
		// : URLMapping의 경롤를 "*.do"로 설정
		// : 모든 요청에 .do 를 붙여야 하나의 서블릿으로 오게 됨

		// getRequestURI()로 reqURI에 담기는 값 : /DesignPattern/insert.do
		// getContextPath() : /DesignPattern
		// command: 필요 값 /insert.do
//		String reqURI = request.getRequestURI();
//		String contextPath = request.getContextPath();
//		String command2 = reqURI.substring(contextPath.length());
		
		String command = request.getServletPath(); // 식별값만 출력하는 메소드
		System.out.println("요청식별값>> " + command);

		Command com = map.get(command);
		com.execute(request, response);
		
//		if (command.equals("/insert.do")) {
//			//사용자의 요청을 처리할 수 있는 객체를 생성하여 매개변수를 넘김
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
		// 미리 이 구조를 만들어 두고 시작하면 편함.
	}

}
