package service;

import java.util.List;

import domain.BookDTO;
import persistence.BookDAO;

// ~~service 클래스: 비즈니스 로직(insert, update, delete, select) 처리를 위한 메서드 호출

public class BookListService {
	public List<BookDTO> list() {
		BookDAO dao = new BookDAO();
		List<BookDTO> list=dao.getList();
		
		return list;
	}

}
