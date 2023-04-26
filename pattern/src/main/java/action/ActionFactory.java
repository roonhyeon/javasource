package action;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {
	// 이것을 또 따로 빼서 정리해주기 위한 메서드
//	if(cmd.equals("/insert.do")) {
//		action = new InsertAction();
//	}else if(cmd.equals("/list.do")) {
//	
//	}else if(cmd.equals("/update.do")) {
//		
//	}else if(cmd.equals("/delete.do")) {
//		action = new DeleteAction();
//	}
	private static ActionFactory actionFactory;
	private ActionFactory() {} // 생성자를 private으로 설정해놓았기 때문에 서블릿에서 new로 메서드를 호출할 수 없다.
	
	public static ActionFactory getInstance() {
		if(actionFactory==null) {
			actionFactory=new ActionFactory(); // 얘가 new 해주네? 서블릿으로 넘어오겠네?
		}
		return actionFactory;
	}
	// 굳이 이렇게 생성자를 prviate으로 막아놓고 getInstance()를 따로 정의하는 이유가 뭘까?? => 싱글톤 패턴
	
	// Action 리턴 메서드(action)
	Action action;
	public Action action(String cmd) {
		
		if(cmd.equals("/insert.do")) {
			action = new InsertAction();
		}else if(cmd.equals("/list.do")) {
		
		}else if(cmd.equals("/update.do")) {
			
		}else if(cmd.equals("/delete.do")) {
			action = new DeleteAction();
		}
		
		return action;
	}
}
