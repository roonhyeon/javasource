package Lang;

public class WrapperEx1 {

	public static void main(String[] args) {
		
		//정수형을 다룰 때: 기본형
		int a=3;
		char ch='a';
		byte b=4;
		float f=4.15f;
		double d=4.5;
		boolean b3=true;
		long l=123L;
		
		//정수형을 다룰 때: 참조형 => 클래스(인터페이스)가 만들어져 있다.
		//래퍼 클래스
//		Integer i=new Integer(3); 구버전
		Integer i2=3; //신버전
		Integer i3=3;
		Character ch2='a';
		Byte b2=4;
		Float f2=4.15f;
		Double d2=4.5;
		Boolean b4=false;
		Long l2=123L;
		
		System.out.println(i2.equals(i3));
		System.out.println(i2==i3);
		
		System.out.println("문자 형태의 숫자를 정수로 Integer.parseInt()"+Integer.parseInt("10"));
		System.out.println("문자 형태의 숫자를 실수로 Integer.parseInt()"+Double.parseDouble("10"));
//		Float.parseFloat(""); Boolean.parseBoolean("true"); Long.parseLong("10"); //래퍼 클래스에 있는 것을 불러와서 쓴다.
		
		//기본형으로 선언된 변수(a)를 참조형에 바로 대입할 수 있다.
		Integer i4=a;

	}

}
