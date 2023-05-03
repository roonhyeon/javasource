package board.service;

import board.persistence.BoardDAO;

public class BoardCntService {
	public boolean cntUpdate(int bno) {
		return new BoardDAO().readCnt(bno); // 조회수 증가 메서드 가져오기
		
	}

}
