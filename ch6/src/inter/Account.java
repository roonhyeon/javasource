package inter;

public interface Account {
	
//	int x,y; //인터페이스에서 변수는 final 필드와 함께 써야 한다.	
	int x=0, y=0; //모든 멤버변수는 public static final(생략 가능)이다.
//	void stop() {} //모든 메서드는 public abstract(생략 가능)이다.
	void stop();
	
	//단, static메서드와 default 메서드는 사용 가능하다.(jdk8 버전부터 가능)
	static void print() {}
	default void add() {}
	
}
