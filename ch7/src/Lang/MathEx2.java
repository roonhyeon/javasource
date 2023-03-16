package Lang;

import static java.lang.Math.*; // => 어차피 Math 자체가 모두 static이기 때문에 import로 상단에 static을 불러오면 Math. 에서 Math도 떼어주고 사용할 수 있다.

public class MathEx2 {

	public static void main(String[] args) {
		
//		Math math=new Math(); //생성자 불가 => static이라서 그냥 Math.으로 부르면 된다.
		
		System.out.println(E);
		System.out.println(PI);
		
		//반올림, 올림, 버림
		double val=90.7552;
		//round(): 반올림
		System.out.println("round("+val+") = "+round(val));
		
		val*=100;
		System.out.println("round("+val+") = "+round(val));
		System.out.println("round("+val+")/100 = "+round(val)/100);
		System.out.println("round("+val+")/100.0 = "+round(val)/100.0);
		System.out.println();
		
		//실수 출력: %f, %3.1f: 출력 시 전체 자릿수는 3자리, 소수점은 첫째자리까지 출력해주세요.
		//ceil(): 무조건 올림
		System.out.printf("ceil(%3.1f) = %3.1f\n",1.1,ceil(1.1));
		
		//floor(): 무조건 버림
		System.out.printf("floor(%3.1f) = %3.1f\n",1.5,floor(1.5));
		
		//max(): 두 숫자 중 더 큰 수 출력
		System.out.printf("max(%d,%d) = %d",1,2,max(1, 2));
		System.out.println();
		//min(): 두 숫자 중 더 작은 수 출력
		System.out.printf("min(%d,%d) = %d",1,2,min(1, 2));
		
		//
	}

}
