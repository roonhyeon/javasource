package ch7;

public class MyExceptionEx {

	public static void main(String[] args) {
		
		try {
			test();
		} catch (MyException e) { //사용자 정의 예외: Exception을 안 쓰고 내가 정의한 클래스명 사용
			e.printStackTrace();
		}
		
	}
	public static void test() throws MyException { //사용자 정의 예외: Exception을 안 쓰고 내가 정의한 클래스명 사용
		//강제로 예외를 발생시키기 
		throw new MyException("사용자 정의 예외 발생");
	}
	
	//출력 결과: 'Exception in thread "main" java.lang.ArithmeticException:' 같은 오류 메세지가 안 뜬다.
}
