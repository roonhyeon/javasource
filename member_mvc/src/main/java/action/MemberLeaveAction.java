package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.MemberDTO;
import service.MemberLeaveService;
public class MemberLeaveAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		MemberLeaveService service=new MemberLeaveService();
		boolean removeFlag=service.leave(userid, password);
		
		// 탈퇴 성공시 세션 해제 and go to index.jsp
		String path="";
		if(removeFlag) {
			HttpSession session=request.getSession();
			session.invalidate();
			path="index.jsp";
		}else {
			path="leave.jsp";
		}
		return new ActionForward(true, path);
	}

}
