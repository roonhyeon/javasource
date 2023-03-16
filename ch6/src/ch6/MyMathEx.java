package ch6;

public class MyMathEx {

	public static void main(String[] args) {
		
		//static 메소드 호출
		System.out.println(MyMath.add(200L, 300L));
		System.out.println(MyMath.subtract(200L, 300L));
		System.out.println(MyMath.multiple(200L, 300L));
		System.out.println(MyMath.divide(200L, 300L));
		
		//인스턴스 메소드 호출
		MyMath math=new MyMath();
		math.a=200L;
		math.b=100L;
		System.out.println(math.add());
		System.out.println(math.subtract());
		System.out.println(math.divide());
		System.out.println(math.multiple());
		
		//Math.random();

	}
}
