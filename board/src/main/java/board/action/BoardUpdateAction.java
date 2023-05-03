package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardUpdateService;
import board.util.BoardUploadUtils;

public class BoardUpdateAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post
		BoardUploadUtils utils=new BoardUploadUtils();
		Map<String, String> formData=utils.uploadFile(request);
		
		BoardDTO dto=new BoardDTO();
		dto.setBno(Integer.parseInt(formData.get("bno")));
		dto.setTitle(formData.get("title"));
		dto.setContent(formData.get("content"));
		dto.setPassword(formData.get("password"));
		if(formData.containsKey("attach")) {
			dto.setAttach(formData.get("attach"));
		}
		
		BoardUpdateService service=new BoardUpdateService();
		
		String path="";
		if(service.update(dto)) {
			path="read.do?bno="+dto.getBno();
		} else {
			path="modify.do?bno="+dto.getBno();
		}
		return new ActionForward(true, path);
	}

}
