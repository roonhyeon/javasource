package board.service;

import java.util.List;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardListService {
	public List<BoardDTO> getList(){
		BoardDAO dao=new BoardDAO();
		List<BoardDTO> list=dao.getRows();
		
		return list;
	}

}
