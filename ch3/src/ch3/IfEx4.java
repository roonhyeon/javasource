package ch3;


import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		
//		//근무 시간 입력받기, 8시간 근무 시 시간 당 9,800원, 초과 근무 시 원래 급여의 1.5배를 받는다. 12시간 근무 시 하루 총 일당을 구하시오.
		Scanner sc=new Scanner(System.in);
//		System.out.println("근무시간을 입력해주세요: ");
//	    int hours= Integer.parseInt(sc.nextLine());
//	    int rate=9800; //시간 당 페이
//	    int income=0; //하루일당
//	    
//	    if (hours<=8) {
//			income=hours*rate;
//		}else {
//			income=(int)((hours-8)*rate*1.5+rate*8);
//		}
//	    System.out.println("하루 일당: "+income);
		
		
		//키, 몸무게 입력받기, 저체중인지 표준인지 과체중인지 출력하기
//		System.out.println("키를 입력하시오: ");
//	    int height= Integer.parseInt(sc.nextLine());
//	    System.out.println("몸무게를 입력하시오: ");
////	    int weight= Integer.parseInt(sc.nextLine());
//	    double weight= Double.parseDouble(sc.nextLine());
//	    String kg=" ";
//	    
//	    double number=(height-100)*0.9;
//	    if (number<weight) {
//			kg="과체중";
//		}else if (number==weight) {
//			kg="표준";
//		}else if (number>weight) {
//			kg="저체중";
//		}
//	    System.out.println(kg);
	    
	    
//	    //윤년, 평년 구하기. 윤년: 연도를 4로 나눈 나머지가 0이고, 연도를 100으로 나눈 나머지가 0이 아니거나 연도를 400으로 나눈 나머지가 0.
//	    int year=2023;
//	    if (year%4==0 && year%100!=0 || year%400==0) {
//			System.out.println("윤년");
//		}else {
//			System.out.println("평년");
//		}
//	    
	    //임의의 숫자 3개 입력받기, 입력받은 3개의 숫자 중 가장 작은 수 출력하기
		System.out.println("숫자1를 입력해주세요: ");
		int num1= Integer.parseInt(sc.nextLine());
		System.out.println("숫자2를 입력해주세요: ");
		int num2= Integer.parseInt(sc.nextLine());
		System.out.println("숫자3를 입력해주세요: ");
	    int num3= Integer.parseInt(sc.nextLine());
	    
//	    if (num1<num2 && num1<num3) {
//			System.out.println("가장 작은 숫자는: "+num1);
//		} else if (num2<num1 && num2<num3) {
//			System.out.println("가장 작은 숫자는: "+num2);
//		} else {
//			System.out.println("가장 작은 숫자는: "+num3);
//		} //셋 중 조건에 맞는 단 하나만 실행됨
	    
	    int min=num1;
	    if (min>num2) {
			min=num2;
		}
	    if (min>num3) {
			min=num3;
		} //if 각각 개별 실행됨
	    System.out.println("가장 작은 수: "+min);
	    
	    int max=num1;
	    if (max<num2) {
			max=num2;
		}
	    if (max<num3) {
		    max=num3;
		}
	    System.out.println("가장 큰 수: "+max);
	    
	}
}
