package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionFactory;
import action.ActionForward;
import action.DeleteAction;
import action.InsertAction;

/**
 * Servlet implementation class PatternController
 */
@WebServlet("*.do") // Url mapping: 앞의 이름은 상관없으나 뒤에는 통일되게 .do로 끝나야 한다. => .do 말고 다른 걸로 설정할 수 있지만 자바에서는 주로 .do를 사용한다.
public class PatternController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		// 아래 3문장이 요청이 어디서 왔는지 분석하는 과정
		String requestURI=request.getRequestURI(); // 리턴값 예시: /pattern/list.do
		// 프로젝트 == context => getContextPath를 하게 되면 프로젝트 Path를 가져오게 된다.
		String contextPath=request.getContextPath(); // 리턴값 예시: /pattern
		String cmd=requestURI.substring(contextPath.length()); // 리턴값 예시: /list.do
		
		System.out.println("requestURI"+requestURI);
		System.out.println("contextPath"+contextPath);
		System.out.println("cmd"+cmd);
		
		// cmd가 어디서 요청이 왔는지에 따라 액션(insertaction, deleteaction....) 생성
		// ~~Pro로 각각 만들었던 것을 이렇게 하나의 창구로 단일화를 시킬 수 있다. by Servlet through Url mapping
//		if(cmd.equals("/insert.do")) {
//			action = new InsertAction();
//		}else if(cmd.equals("/list.do")) {
//		
//		}else if(cmd.equals("/update.do")) {
//			
//		}else if(cmd.equals("/delete.do")) {
//			action = new DeleteAction();
//		}
		
		ActionFactory actionFactory=ActionFactory.getInstance();
		Action action = actionFactory.action(cmd); // 인터페이스가 들어왔기 때문에 부모는 Action이 된다.
		
		// 겹치는 부분 따로 빼서 한꺼번에 정의
		// 생성된 액션에 일 시키기(메서드 호출)
		ActionForward af=null;
		try {
			af=action.execute(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 리턴 받은 ActionForward에 맞춰 사용자에게 화면을 보여줌
		if(af.isRedirect()) {
			response.sendRedirect(af.getPath());
		}else {
			RequestDispatcher rd=request.getRequestDispatcher(af.getPath());
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
