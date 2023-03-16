package ch7;

import java.util.Iterator;

public class ExceptionEx5 {

	public static void main(String[] args) {
		int arr[]=new int[0];
		try {
			getAverage(arr);
		} catch (Exception e) {
//			e.printStackTrace();
			//예외 메세지만 출력
			System.out.println(e.getMessage());
		}
	}
	
	//getAverage 메서드에 예외를 선언: getAverage를 호출하면 예외가 발생할 수 있다는 의미
	static double getAverage(int arr[]) throws Exception {
	
	    
		if (arr.length==0) {
			//예외를 강제로 발생시키기
			throw new Exception("비어있는 배열입니다."); //RuntimeException 클래스 대신 그냥 Exception 클래스를 쓰면 오류가 난다. => throws Exception(던지기) 추가
			                                       //Exception 클래스 사용 시: 컴파일 시 예외, RuntimeException 클래스 사용 시: 실행 시 예외
		}
		return getTotal(arr)/arr.length;
	}
	
	static int getTotal(int arr[]) {
		int total=0;
		for (int i = 0; i < arr.length; i++) {
			total+=arr[i];
		}
		return total;
	
	
	}
}
