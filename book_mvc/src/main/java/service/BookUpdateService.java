package service;

import persistence.BookDAO;

public class BookUpdateService {
	public boolean updateBook(int price, int code) {
//		BookDAO dao=new BookDAO();
//		return dao.update(price, code);
		// 한 줄로
		return new BookDAO().update(price, code);
	}

}
