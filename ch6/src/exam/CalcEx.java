package exam;

import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input Num1: ");
		int Num1=Integer.parseInt(sc.nextLine());
		System.out.println("Input Num2: ");
		int Num2=Integer.parseInt(sc.nextLine());
		System.out.println("Input operator: ");
		String op=sc.nextLine();
		
		Calc calc=null; //매 메소드마다 하나하나 설정해주는 것을 방지하기 위해 이렇게 calc 변수를 정의해준다. 다형성
		switch (op) {
		case "+":
			calc=new Add();
			break;
		case "-":
			calc=new Sub();
			break;
		case "*":
			calc=new Mul();
			break;
		case "/":
			calc=new Div();
			break;
		}
		calc.setValue(Num1, Num2);
		System.out.println("결과 "+calc.calculate());
	
	}
}
