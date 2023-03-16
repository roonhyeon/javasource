package ch4;

import java.util.Iterator;

public class WhileEx1 {

	public static void main(String[] args) {
		
		int i = 0;
		while (i < 10) {
			System.out.print(i+"  ");
			i++;
		}
		
		
		
		System.out.println();
		i=10;
		while (i >= 1) {
			System.out.print(i+"  ");
			i--;
		}
		
		
		
		System.out.println();
		i=1;
		while (i <= 10) {
			System.out.print(i+"  ");
			i++;
		}
		
		
		
		System.out.println();
		i=1;
		while (i <= 10) {
			System.out.print(i+"  ");
			i+=2;
		}
		
		
		
		System.out.println();
		i=0;
		while (i<3) {
			System.out.println("Hello");
			i++;
		}
		
		
		
		i=1;
		while (i<=100) {
			System.out.print(i+"  ");
			i++;
		}
		
		
		
		System.out.println();
		i=1;
		while (i<=100) {
			System.out.print(i+"  ");
			i+=2;
		}
		
		
		
		//1~10까지의 덧셈 결과 출력
		System.out.println();
		int sum=0;
		i=1;
		while (i<=10) {
			sum=sum+i;
			i++;
		}
		System.out.println("1~10 합 "+sum);
		
		
		
		
		
	}
}
