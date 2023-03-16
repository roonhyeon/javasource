package ch6;

public class CalcEx3 {

	public static void main(String[] args) {
		Calc3 calc=new Calc3();
		
		calc.execute(); //execute 호출하는 순간 void execute() 실행되고 println("실행결과: "+avg(7,10)); 실행된다. 그리고 위로 계속 계속 

	}
}
