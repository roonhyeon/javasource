package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.MemberDTO;
import service.MemberLoginService;
import service.MemberRegisterService;

public class MemberRegisterAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post 가져오기
		MemberDTO registerDto =new MemberDTO();
		registerDto.setUserid(request.getParameter("userid"))  ;
		registerDto.setPassword(request.getParameter("password"));
		registerDto.setName(request.getParameter("name"));
		registerDto.setGender(request.getParameter("gender"));
		registerDto.setEmail(request.getParameter("email"));
		
		// service 작업
		MemberRegisterService service=new MemberRegisterService();
		boolean registerFlag=service.register(registerDto);
		
		// ActionForward
		String path="";
		if(registerFlag) {
			path="login.jsp";
		}else {
			path="register.jsp";
		}
		return new ActionForward(true, path);
	}

}
