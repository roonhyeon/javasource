package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.domain.PageDTO;
import board.service.BoardListService;
import board.service.BoardTotalService;

public class BoardListAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// criteria, keyword 값 가져오기(전체 리스트를 요청하는 경우 값은 없음)
		// http://localhost:8080/board/list.do?criteria=&keyword=

		
		// criteria, keyword 값 가져오기(검색 리스트를 요청하는 경우 값은 있음)
		// http://localhost:8080/board/list.do?criteria=title&keyword=게시글
		
		// 검색기준과 검색어 가져오기
		String criteria=request.getParameter("criteria");
		String keyword=request.getParameter("keyword");
		
		// 페이지 나누기 정보 가져오기
		int page=1;
		if(request.getParameter("page")!=null) {
			page=Integer.parseInt(request.getParameter("page"));
		}
		
		int amount=30;
		if(request.getParameter("amount")!=null) {
			amount=Integer.parseInt(request.getParameter("amount"));
		}
		
		PageDTO pageDto=new PageDTO(criteria, keyword, page, amount);
		
		// 전체 게시물 가져오기
		BoardTotalService totSer=new BoardTotalService();
		int total=totSer.getTotalRow(pageDto);
		
		// service
		BoardListService service=new BoardListService();
		List<BoardDTO> list = service.getList(pageDto);
		
		// 페이지 나누기 정보와 검색 정보 담아주기
		pageDto=new PageDTO(criteria, keyword, page, amount, total);
		
		request.setAttribute("list", list);
		request.setAttribute("pageDto", pageDto);
		
		// ActionForward
		return new ActionForward(false, "listForm.jsp");
	}

}
