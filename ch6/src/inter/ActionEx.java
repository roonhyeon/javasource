package inter;

public class ActionEx {

	public static void main(String[] args) {
		
		Action action=new Action() {
			
			@Override //익명 클래스: 클래스를 구현하기는 했는데 이름이 없다.
			public void work() {
				System.out.println("work");
				
			}
		};

		action.work();
		
	}
}
