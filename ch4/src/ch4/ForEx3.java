package ch4;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		//팩토리얼
		//4!=4*3*2*1
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int factorial=Integer.parseInt(sc.nextLine()); 
		
        int sum=1; //곱셈 결과를 저장할 변수
		for (int i = 1; i<=factorial; i++) {
			sum=sum*i;
		}
		System.out.printf("%d! = %d",factorial,sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
