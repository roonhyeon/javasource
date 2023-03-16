package ch3;


import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
	    int num2= Integer.parseInt(sc.nextLine());
	    String result3=num2%2==0 ? "짝수": "홀수";
	    System.out.println(result3);
		
	    String result="";
	    if (num2%2==0) {
			result="짝수";
		}else {
			result="홀수";
		}
	    System.out.println(result);
	}

}
