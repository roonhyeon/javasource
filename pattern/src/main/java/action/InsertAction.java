package action;

import javax.servlet.http.HttpServletRequest;

import service.InsertService;

public class InsertAction implements Action{
    // patterncontroller에서 넘어온 request	=> 보내고 싶은 요소 인자에 넣어 getParameter로 받을 수 있다.
	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get or post로 넘어오는 내용 가져오기
		System.out.println("이름 "+request.getParameter("name"));
		
		// 서버스한테 db 작업 부탁하기 위해 서비스 클래스 호출
		InsertService service=new InsertService();
		boolean result=service.insertArticle(); // InsertService로부터 받은 return 받는다.
		
		if(result) {
			
		}
		
		// 페이지 이동방식이 sendRedirect일 때는 true, forward일 때는 false
		return new ActionForward(true, "list.jsp");
	}
    
}
