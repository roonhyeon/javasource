package ch6;

public class Calc3 {
	int plus(int x, int y) {
		return x+y;
	}
	
	double avg(int x, int y) {
		double sum=plus(x,y);
		return sum/2;
	}
	
	void execute() {
		println("실행결과: "+avg(7,10)); //1.execute에서 2.println 호출하고 3.avg 호출
	}
	
	void println(String message) {
		System.out.println(message); //최종 실행 결과 값
	}

	
	
	
}
