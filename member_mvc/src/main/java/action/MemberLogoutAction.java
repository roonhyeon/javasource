package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MemberLogoutAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get, post 없음
		// service 필요없음(db 작업 없음)
		
		// session 해제
		HttpSession session=request.getSession();
		session.removeAttribute("loginDto"); // or session.invalidate();
		
		// ActionForward: index.jsp
		return new ActionForward(true, "index.jsp");
	}

}
