package action;

import javax.servlet.http.HttpServletRequest;

import service.MemberDupService;

public class MemberDupAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		String userid=request.getParameter("userid");
		
		MemberDupService service=new MemberDupService();
		boolean dupFlag=service.dup(userid);
		
		if(dupFlag) {
			request.setAttribute("dup", "true");
		}else {
			request.setAttribute("dup", "false");
		}
		return new ActionForward(false, "checkId.jsp");
	}

}
