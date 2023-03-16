package ch6;

public class MyMath {
	
	long a,b; //멤버(인스턴스)변수
	
	long add() {
		return a+b;
	}
	
	long subtract() {
		return a-b;
	}
	
	long multiple() {
		return a*b;
	}
	
	double divide() {
		return a/b;
	}
	
	//기본형 매개변수(지역변수)를 이용한 사칙연산
	static long add(long a, long b) { //static 메소드 안에서는 인스턴스를 바로 사용할 수 없다. 따라서 static long add()로 하면 오류가 난다.
		return a+b;
	}
	
	static long subtract(long a, long b) {
		return a-b;
	}
	
	static long multiple(long a, long b) {
		return a*b;
	}
	
	static double divide(long a, long b) {
		return a/(double)b;
	}
	
	
	
	
}
