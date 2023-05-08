package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import board.domain.BoardDTO;
import board.service.BoardWriteService;
import board.util.BoardUploadUtils;

public class BoardWriteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// multipart, form-data 형태는 request.getParameter() 작업이 불가하다.
		// request => BoardUploadUtils 넘겨야 함
		BoardUploadUtils utils=new BoardUploadUtils();
		Map<String, String> formData=utils.uploadFile(request);
		
		// formData 값들을 BoardDTO 객체 생성 후 담기
		// file이 입력된 경우와 입력이 안된 경우
		BoardDTO dto=new BoardDTO();
		dto.setName(formData.get("name"));
		dto.setTitle(formData.get("title"));
		dto.setContent(formData.get("content"));
		dto.setPassword(formData.get("password"));
		
		if(formData.containsKey("attach")) {
			dto.setAttach(formData.get("attach"));
		} // 파일첨부를 안할 수도 있으므로 조건을 걸어준다.
		
		// 서비스 작업
		BoardWriteService service=new BoardWriteService();
		
		// ActionForward: 성공하면 목록 보여주기, 실패시 writeForm.jsp
	    String path="";
	    if(service.insert(dto)) {
			path="list.do?criteria=&keyword=&page=1&amount=30";
		}else {
			path="writeForm.jsp";
		}
	    return new ActionForward(true, path);
	}

}
