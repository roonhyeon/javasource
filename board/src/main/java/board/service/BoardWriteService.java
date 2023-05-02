package board.service;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardWriteService {
	public boolean insert(BoardDTO boardDto) {
		BoardDAO dao=new BoardDAO();
		return dao.insertArticle(boardDto);
	}

}
