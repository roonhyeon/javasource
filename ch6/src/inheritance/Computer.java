package inheritance;

public class Computer extends Calculator {
	
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle 실행");
		return Math.PI*r*r; //상수는 대문자로 호출. PI는 상수. final static double PI=3.141592.......
	}

	
}
