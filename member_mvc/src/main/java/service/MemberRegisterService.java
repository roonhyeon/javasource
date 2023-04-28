package service;

import domain.MemberDTO;
import persistence.MemberDAO;

public class MemberRegisterService {
	public boolean register(MemberDTO registerDto) {
		MemberDAO dao=new MemberDAO();
		return dao.isregister(registerDto);
	}

}
