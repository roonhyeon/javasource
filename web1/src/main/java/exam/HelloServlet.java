package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * jsp == servlet: 할 수 있는 일이 같다. 사용자 요청 처리
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet"); // html action의 method ="get"으로 줄 때 작동하는 함수
		
        request.setCharacterEncoding("utf-8"); // 한글 깨짐 방지
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		// 화면에 보여주기?
		response.setContentType("text/html;charset=utf-8"); // 창에 html 형태로 보여주세요.
		PrintWriter out = response.getWriter(); // jsp 처럼 out.print를 바로 못 써준다.
		out.print("<h3> 이름 : "+name+"</h3>");
		out.print("<h3> 나이 : "+age+"</h3>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost"); // html action의 method ="post"로 줄 때 작동하는 함수
		doGet(request, response); // html action의 method ="get"으로 줄 때 작동하는 코드. 이렇게 해주면 doPost는 밑의 코드들을 작성해줄 필요가 없어진다. 
		                          // 그냥 자동적으로 doGet의 코드를 가져오기 때문이다.
		
//		request.setCharacterEncoding("utf-8"); // 한글 깨짐 방지
//		
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
//		
//		// 화면에 보여주기?
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter(); // jsp 처럼 out.print를 바로 못 써준다.
//		out.print("<h3> 이름 : "+name+"</h3>");
//		out.print("<h3> 나이 : "+age+"</h3>");
	}

}
