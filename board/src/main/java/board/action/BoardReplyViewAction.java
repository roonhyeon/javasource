package board.action;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardReadService;

public class BoardReplyViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get
		int bno=Integer.parseInt(request.getParameter("bno")); // 원본 글의 정보를 담고 replyForm으로 들어간 것이다.
		
		// service
		BoardReadService service=new BoardReadService();
		BoardDTO dto=service.read(bno);
		
		request.setAttribute("dto", dto);
		
		// replyForm.jsp로 이동
		return new ActionForward(false, "replyForm.jsp");
	}

}
