package service;

import persistence.MemberDAO;

public class MemberDupService {
	public boolean dup(String userid) {
		return new MemberDAO().duplicateId(userid);
	}

}
