package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardReadService;
import board.util.BoardUploadUtils;

public class BoardReadAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get
		int bno=Integer.parseInt(request.getParameter("bno"));
		
		// service
		BoardReadService service=new BoardReadService();
		BoardDTO dto=service.read(bno);
		
		request.setAttribute("dto", dto);
		
		// readForm.jsp로 이동
		return new ActionForward(false, "readForm.jsp");
	}

}
