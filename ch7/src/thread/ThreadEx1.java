package thread;

public class ThreadEx1 {

	public static void main(String[] args) {
		
		//멀티쓰레드 동작할 인스턴스 생성
		SmallLetters t1=new SmallLetters();
		t1.start();
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}

	}

}