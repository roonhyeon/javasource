package ch7;

//런타임 체크 exception: ArithmeticException

public class ExceptionEx2 {

	public static void main(String[] args) {
		
//		System.out.println(3/0);
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//java.lang.ArithmeticException: syso를 출력했을 때 java.lang 패키지의 ArithmeticException 클래스가 동작하면서 오류를 알려준다. 
		//=> 역시나 try ~ catch 구문 사용하여 오류 처리
	    
		try {
			System.out.println(3/1);
		} catch (Exception e) { //왼쪽은 부모(Exception 클래스), 오른쪽은 자식 형태
//			e.printStackTrace(); //개발 시에 자주 쓰는 코드 형태이다: 예외가 발생하는 구문을 추적해서 출력해달라는 의미다.
//			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage()); //예외 발생 시 자바에서 제공하는 기본 메세지 출력: / by zero
		} finally {
			System.out.println("반드시 실행");
		}
	
	}
}
