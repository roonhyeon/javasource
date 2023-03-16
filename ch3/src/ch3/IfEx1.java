package ch3;


import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		
		int num=0;
		
		if (num==0) {
			System.out.println("num=0");
		}
		
		if (num!=0) {
			System.out.println("num!=0");
		}
		
		int score=88;
		if (score>=60) {
			System.out.println("합격");
		}
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("점수입력: ");
		int score1= Integer.parseInt(sc.nextLine());
		if (score1>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		int jumsu=70;
		char grade=' '; //지역변수 초기화 후 사용
		if (jumsu>=90) {
			grade='A';
		}else if (jumsu>=80) {
			grade='B';
		}else if (jumsu>=70) {
			grade='C';
		}else if (jumsu>=60) {
			grade='D';
		}else if (jumsu>=50) {
			grade='E';
		}
		System.out.printf("점수: %d, 등급: %c\n", jumsu, grade);
		
		
	}

}
