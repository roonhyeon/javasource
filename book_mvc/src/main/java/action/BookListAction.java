package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import service.BookListService;

public class BookListAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		// get or post 넘어올 내용 없음
		
		// service에게 db 작업 부탁
		BookListService service = new BookListService();
		List<BookDTO> list = service.list();
		
		request.setAttribute("list", list); // 이걸 쓰면 무조건 forward, 안 쓰면 sendRedirect
		
		return new BookActionForward(false, "list.jsp");
	}

}
