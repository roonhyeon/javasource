package ch1;

import java.util.Scanner;

public class VariableEx6 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     //사용자로부터 두 개의 피연산자를 입력받기
		 System.out.println("첫 번째 수 입력 : ");
	     int num1 = Integer.parseInt(sc.nextLine());
	     System.out.println("두 번째 수 입력 : ");
	     int num2 = Integer.parseInt(sc.nextLine());

	     //사칙연산 결과 출력
		 System.out.println(num1+num2);
		 System.out.println(num1-num2);
		 System.out.println(num1*num2);
		 System.out.println(num1/num2);
		 
		 //사칙연산 우선순위 부여 : +는 plus 가 아니라 연결이므로 괄호 안에 사칙연산 넣기
		 //println ver
		 System.out.println("num1+num2="+(num1+num2));
		 System.out.println("num1-num2="+(num1-num2));
		 System.out.println("num1*num2="+(num1*num2));
		 System.out.println("num1/num2="+(num1/num2));
	 
         //printf ver
		 System.out.printf("num1+num2=%d\n",(num1+num2));
		 System.out.printf("num1-num2=%d\n",(num1-num2));
		 System.out.printf("num1*num2=%d\n",(num1*num2));
		 System.out.printf("num1/num2=%d\n",(num1/num2));
		 
		 
	 			}

	 		}


