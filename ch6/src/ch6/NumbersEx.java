package ch6;

public class NumbersEx {

	public static void main(String[] args) {
		
		//배열 생성
		int num[]= {1,2,3,4,5};
		
		Numbers numbers=new Numbers(num);
		System.out.println("배열총합: "+numbers.getTotal());
		System.out.println("배열평균: "+numbers.getAverage());
		
		

	}
}
