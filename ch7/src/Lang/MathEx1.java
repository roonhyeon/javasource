package Lang;

public class MathEx1 {

	public static void main(String[] args) {
		
//		Math math=new Math(); //생성자 불가 => static이라서 그냥 Math.으로 부르면 된다.
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		//반올림, 올림, 버림
		double val=90.7552;
		//round(): 반올림
		System.out.println("round("+val+") = "+Math.round(val));
		
		val*=100;
		System.out.println("round("+val+") = "+Math.round(val));
		System.out.println("round("+val+")/100 = "+Math.round(val)/100);
		System.out.println("round("+val+")/100.0 = "+Math.round(val)/100.0);
		System.out.println();
		
		//실수 출력: %f, %3.1f: 출력 시 전체 자릿수는 3자리, 소수점은 첫째자리까지 출력해주세요.
		//ceil(): 무조건 올림
		System.out.printf("ceil(%3.1f) = %3.1f\n",1.1,Math.ceil(1.1));
		
		//floor(): 무조건 버림
		System.out.printf("floor(%3.1f) = %3.1f\n",1.5,Math.floor(1.5));
		
		//max(): 두 숫자 중 더 큰 수 출력
		System.out.printf("max(%d,%d) = %d",1,2,Math.max(1, 2));
		System.out.println();
		//min(): 두 숫자 중 더 작은 수 출력
		System.out.printf("min(%d,%d) = %d",1,2,Math.min(1, 2));
		
	}
}
