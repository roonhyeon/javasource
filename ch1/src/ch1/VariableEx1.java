package ch1;

public class VariableEx1 {

	public static void main(String[] args) {
		// 변수 : 메모리 공간
		// 타입 변수명 = 값;  ==>  int num = 1;
		// 메모리에 어떤 값을 저장할 것인가에 따라 타입이 결정됨
		// 문자 : 문자('가' - char), 문자열("가나다") -문자도 쌍따옴표 안에 써도 됨
        // 숫자 : 정수 - byte, short, int, long
		//       실수 - float, double
		// 논리 : 참(true), 거짓(false)
		
		// 자바 문장의 끝엔 항상 세미콜론을 찍어야 한다.
		int a=10, b=5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);

	}

}
