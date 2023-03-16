package ch4;

import java.util.Iterator;

public class ForEx1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
		    System.out.print(i+"  ");
		}
//		System.out.println(i); //지역변수 i는 블럭을 벗어나면 못 불러온다.
		
		System.out.println();
		for (int i = 10; i >= 1; i--) {
		    System.out.print(i+"  ");
		}	
		
		System.out.println();
		for (int i = 1; i <= 10; i++) {
		    System.out.print(i+"  ");
		}

		
		//i+=2 는 i=i+2의 의미
		System.out.println();
		for (int i = 1; i <= 10; i+=2) {
		    System.out.print(i+"  ");
		}
		
		System.out.println();
		for (int i=0; i<3; i++) {
		    System.out.println("Hello");
		}
		
		System.out.println();
		for (int i=1; i<=100; i++) {
		    System.out.print(i+"  ");
		}
		
		System.out.println();
		for (int i=1; i<=100; i+=2) {
		    System.out.print(i+"  ");
		}
		
		
		//1~10까지의 덧셈 결과 출력
		System.out.println();
		int sum=0;
		for (int i=1; i<=10; i++) {
			sum=sum+i; //sum+=i;
		}
		System.out.println("1~10 합 "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
