package ch1;

public class VariableEx2 {

	public static void main(String[] args) {
		
		// 변수 : 단 하나의 값만 저장할 수 있는 메모리 공간
		// 타입 변수명 = 값;  ==>  int num = 1;
		// 메모리에 어떤 값을 저장할 것인가에 따라 타입이 결정됨
		// *기본타입 하기 정리 참고*
		// 문자 : 문자('가' - char(2byte)), 문자열("가나다") -문자도 쌍따옴표 안에 써도 됨
		// 1byte = 8bite (타입과 크기가 다르면 미스매치가 뜬다) : 1byte = -128 ~ 127
		// type mismatch를 방지하기 위해 정수 대부분은 int를 사용하고 short는 잘 사용하지 않는다
        // 숫자 : 정수 - byte(1byte), short(2byte), int(4byte), long(8byte) -사용하는 공간의 차이에 따라 다르게 사용
		//           - long은 뒤에 L/l을 붙여줘야 값이 표현됨   
		//       실수 - float(4byte), double(8byte)
		//           - float 사용 시 리터럴(literal)에 f 붙여줘야 한다(대소문자 구분 x)
		//           - 실수형을 담을 때 기본으로 인식하는 타입은 double 이다 **double은 리터럴 뒤에 문자를 안 붙여도 됨
		//             >담을 수 있는 공간(float, double)은 곧 정밀도의 차이  -float는 소숫점 7자리까지만 정밀표현 가능, double은 15자리까지만 가능
		// 논리 : 참(true), 거짓(false)  -boolean 타입 사용
		
		// 자바 문장의 끝엔 항상 세미콜론을 찍어야 한다.
		int a=128, b=5;  // <-- 변수의 선언(int a;)과 초기화(a=10) : int c; (행나눔) c=10으로 나눠서 적을 수도 있음(잘 안 함)
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		double d1 = 0.12345678909;
		float f1 = 0.12345678909F;
		
		// "" + : 앞의 문자열과 연결해서 출력하기
		System.out.println("d1 = "+d1);   // "d1 =" 을 출력하고 변수값을 더해야(연결) 원하는 내용이 출력됨.
		System.out.println("f1 = "+f1);

		
		boolean b1 = true;
		System.out.println(b1);
		
	    String b2="true";  // 논리랑은 다름. 쌍따옴표 안에 있는 건 그냥 글자
	    System.out.println(b2);
		
		// 빈(공백) 문자열도 프로그래밍언어에서는 문자로 인식
	    char ch1='a';
	    System.out.println(ch1);
	    System.out.println(ch1+1); // a : 97, A : 65 ==> 유니코드 (알파벳 순으로 숫자가 하나씩 증가함 ex- b : 98, B = 66)
	    
         
	    
	}

}