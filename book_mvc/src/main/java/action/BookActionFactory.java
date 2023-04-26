package action;

public class BookActionFactory {
	// 하나의 공장만을 생성
	private BookActionFactory() {}
	private static BookActionFactory baf;
	
	public static BookActionFactory getInstance() {
		if(baf==null) {
			baf=new BookActionFactory();
		}
		return baf;
	}
	
	public BookAction action(String cmd) {
		BookAction action=null;
		
		if(cmd.equals("/list.do")) {
			action= new BookListAction();
		}else if(cmd.equals("/insert.do")) {
			action=new BookInsertAction();
		}else if(cmd.equals("/read.do")) {
			action=new BookReadAction();
		}else if(cmd.equals("/modify.do")) {
			action=new BookModifyAction();
		}else if(cmd.equals("/update.do")) {
			action=new BookUpdateAction();
		}
		return action;
	}

}
