package ch6;

public class CalcEx1 {

	public static void main(String[] args) {
		//사칙연산
		//클래스 사용=>객체 생성
		Calc1 calc=new Calc1(); //기본 생성자를 사용하여 초기화
		
		//메소드 호출
		//호출할 때는 메소드 원형에 맞춰서 호출해야 한다.
		//메소드의 리턴 타임이 void가 아닌 경우 리턴 타입에 대한 준비를 해야 한다.
		//1)출력문 안에 넣고 출력하기
		System.out.println("5+3="+calc.add(5,3));
		//2)변수(result)에 받기
		int result=calc.add(15,3); 
		//변수에 받은 후 출력, 변수에 받은 후 다른 연산이나 작업들을 추가로 함.
		result+=65;
		System.out.println("result="+result);
		
		System.out.println("10-3="+calc.subtract(10,3));
		System.out.println("10*3="+calc.multiple(10,3));
		System.out.println("10/3="+calc.divide(10,3));
		
	}
}
