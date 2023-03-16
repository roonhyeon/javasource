package thread;

public class User2 extends Thread{
	
	//클래스 관계(상속, 포함) 중 포함 관계
	private Calculator cal;
	
	public User2(Calculator cal) {
		super();
		this.cal = cal;
		setName("User2");
	}
	
	@Override
	public void run() {
		cal.setMemory(50); //User1이 잠자는 동안 2가 공유값을 50으로 바꾸어 놈 => 그래서 1도 100이 아니라 50이 출력됨. (멀티 쓰레드 동기화 문제)
	}
	
}
