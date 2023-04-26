package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.BookAction;
import action.BookActionFactory;
import action.BookActionForward;

/**
 * Servlet implementation class BookController
 */
@WebServlet("*.do")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글 처리
		request.setCharacterEncoding("utf-8");
		
		// 요청 분석: 1) 요청 경로 가져오기 2) 컨텍스트 경로 가져오기 3) ~.do 추출 경로 가져오기
		String requestURI=request.getRequestURI(); // /book_mvc/list.do
		String contextPath=request.getContextPath(); // /book_mvc
		String cmd=requestURI.substring(contextPath.length()); // /list.do
		
		// 액션 생성 from Factory
		BookActionFactory baf=BookActionFactory.getInstance();
		BookAction action=baf.action(cmd);
		
		// 생성된 액션에게 일을 시켜주자(메서드 호출)
		BookActionForward af=null;
		try {
			af=action.execute(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 이동 방식에 따라 페이지 보여주기
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
