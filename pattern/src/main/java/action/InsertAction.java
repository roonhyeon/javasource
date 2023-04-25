package action;

import javax.servlet.http.HttpServletRequest;

public class InsertAction implements Action{
    // patterncontroller에서 넘어온 request	=> 보내고 싶은 요소 인자에 넣어 getParameter로 받을 수 있다.
	@Override
	public void execute(HttpServletRequest request) throws Exception {
		System.out.println("이름 "+request.getParameter("name"));
	}
    
}
