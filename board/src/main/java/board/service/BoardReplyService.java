package board.service;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardReplyService {
	public boolean isReply(BoardDTO replyDto) {
		
		return new BoardDAO().reply(replyDto);
	}

}
