package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.MemberDTO;
import service.MemberLoginService;

public class MemberLoginAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post 가져오기
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		// service 작업
		MemberLoginService service=new MemberLoginService();
		MemberDTO loginDto=service.login(userid, password);
		
		// 앞서 DAO에서 로그인 정보가 일치하지 않으면 null을 리턴한다고 했으므로....
		String path="";
		if(loginDto!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("loginDto", loginDto);
			path="index.jsp";
		}else {
			path="login.jsp";
		}
		// ActionForward
		return new ActionForward(true, path);
	}

}
