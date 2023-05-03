package board.service;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardReadService {
	public BoardDTO read(int bno) {
		
		BoardDAO dao=new BoardDAO();
		// 조회수 증가
//		dao.readCnt(bno); Cntservice로 분리
		
		return dao.getRow(bno);
	}

}
