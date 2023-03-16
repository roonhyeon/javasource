package thread;

import javax.swing.JOptionPane;

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadEx6 t1=new ThreadEx6();
		t1.start(); //start를 호출한다고 바로 호출되는 것이 아니라, 실행 대기열에 저장되어 자신의 차례가 올 때까지 기다린다.
		
		String input=JOptionPane.showInputDialog("아무 값이나 입력하세요: "); //입력창이 뜬다.
		System.out.println("입력하신 값은 "+input+" 입니다.");
		
	}

}
