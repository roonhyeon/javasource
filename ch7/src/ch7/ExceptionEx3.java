package ch7;

//런타임 체크 exception: ArrayIndexOutOfBoundsException

public class ExceptionEx3 {

	public static void main(String[] args) {
		
//	    System.out.println(args[0]);
		//java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
		//배열 인덱스 오류 => if 문으로 확인 
    
//	    if (args.length==1) {
//			System.out.println(args[0]);
//		}else {
//			System.out.println("실행방법 확인");
//		}
		
		try {
			System.out.println(args[0]); //java.lang.ArrayIndexOutOfBoundsException
			System.out.println(3/0); //java.lang.ArithmeticException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행방법 확인"); 
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		} catch (Exception e) {
			System.out.println("오류 발생");
		} //catch는 여러번 사용 가능, catch() 안에는 자식->부모의 순서로 클래스 선언을 해준다.
		
		
	}
}
