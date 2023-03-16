package thread;

public class SmallLetters extends Thread {
	
	@Override
	public void run() {
		//같이 수행할 코드를 작성한다.
		//a~z까지 출력한다.
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
		
	}

}
