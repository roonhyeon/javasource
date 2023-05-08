package board.service;

import board.domain.PageDTO;
import board.persistence.BoardDAO;

public class BoardTotalService {
	public int getTotalRow(PageDTO pageDto){
		
		// 전체 게시물 가져오기
		BoardDAO dao=new BoardDAO();
		int total=dao.totalRows(pageDto);
		
		return total;
	}

}