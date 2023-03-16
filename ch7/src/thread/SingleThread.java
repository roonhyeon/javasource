package thread;

import javax.swing.JOptionPane;

public class SingleThread {

	public static void main(String[] args) throws InterruptedException {
		
		String input=JOptionPane.showInputDialog("아무 값이나 입력하세요: "); //입력창이 뜬다.
		System.out.println("입력하신 값은 "+input+" 입니다.");
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000); //1초간 i 출력시간 지연
		} //입력한 값은(input)은 이 for문과 아무 관련이 없다. 그럼에도 불구하고 입력창에 입력을 안하면 이 for문이 실행되지 않는다. 
		  //=> 멀티 쓰레드로 입력창 코드와 for문을 구분해서 돌려주면 이제 서로 상관없이 동시에 실행된다.(MultiThread+TreadEx6 참고)

	}

}
