package inheritance.code;

public final class FinalTest { //클래스 앞에
	
	final int MAX_SIZE=10; //멤버변수 앞에, 상수
	
	static final int MIN_SIZE=0; //공통으로 사용하는 상수
	
	final void getMaxSize() { //메소드 앞에
		final int LV=MAX_SIZE; //지역변수 앞에, 상수(초기화 이후에는 값을 변경할 수 없고 항상 일정하다.)
	}
	
}