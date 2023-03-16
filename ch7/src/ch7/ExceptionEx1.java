package ch7;

//컴파일러 체크 exception

public class ExceptionEx1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		try {
//			//예외가 발생할 수 있는 구문을 try 안에 입력
//			Class.forName("");
//		} catch (ClassNotFoundException e) {
//			//예외가 발생했을 때 처리하기 위한 구문을 catch 안에 입력
//			e.printStackTrace();
//		}
		
		Class.forName("");
		
	}
}
