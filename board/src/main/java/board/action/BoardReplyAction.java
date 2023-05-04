package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardReplyService;
import board.util.BoardUploadUtils;

public class BoardReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post
		BoardUploadUtils utils=new BoardUploadUtils();
		Map<String, String> formData=utils.uploadFile(request);
		
		BoardDTO dto=new BoardDTO();
		// 답변글 정보
		dto.setName(formData.get("name"));
		dto.setTitle(formData.get("title"));
		dto.setContent(formData.get("content"));
		if(formData.containsKey("attach")) {
			dto.setAttach(formData.get("attach"));
		}
		dto.setPassword(formData.get("password"));
		
		// 원본글 정보
		int bno=Integer.parseInt(formData.get("bno"));
		dto.setReRef(Integer.parseInt(formData.get("re_ref")));
		dto.setReLev(Integer.parseInt(formData.get("re_lev")));
		dto.setReSeq(Integer.parseInt(formData.get("re_seq")));
		
		BoardReplyService service=new BoardReplyService();
		 
		String path="";
		if(service.isReply(dto)) {
			path="list.do";
		}else {
			path="replyForm.jsp";
		}
		
		return new ActionForward(true, path);
	}

}
