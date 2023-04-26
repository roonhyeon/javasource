package action;

import javax.servlet.http.HttpServletRequest;

public interface Action {
	public ActionForward execute(HttpServletRequest request) throws Exception; // execute 메서드를 오버라이딩하면서 get or post로 넘어는 내용을 가져올 것이다.

}
