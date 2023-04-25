package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
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
		
		String requestURI=request.getRequestURI();
		// 프로젝트 == context => getContextPath를 하게 되면 프로젝트를 가져오게 된다.
		String contextPath=request.getContextPath();
		String cmd=requestURI.substring(contextPath.length());
		
		System.out.println("requestURI"+requestURI);
		System.out.println("contextPath"+contextPath);
		System.out.println("cmd"+cmd);
		
		Action action = null; // 인터페이스가 들어왔기 때문에 부모는 Action이 된다.
		
		// 어디서 요청이 왔는지 확인하는 작업
		// ~~Pro로 각각 만들었던 것을 이렇게 하나의 창구로 단일화를 시킬 수 있다. by Servlet through Url mapping
		if(cmd.equals("/insert.do")) {
			action = new InsertAction();
			try {
				action.execute(request);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(cmd.equals("/list.do")) {
		
		}else if(cmd.equals("/update.do")) {
			
		}else if(cmd.equals("/delete.do")) {
			action = new DeleteAction();
			try {
				action.execute(request);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
