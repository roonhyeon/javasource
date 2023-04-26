package service;

import domain.BookDTO;
import persistence.BookDAO;

public class BookInsertService {
	// DAO insert메서드 참고
	public boolean insertBook(BookDTO insertDto) {
		
		BookDAO dao=new BookDAO();
		return dao.insert(insertDto);
	}

}
