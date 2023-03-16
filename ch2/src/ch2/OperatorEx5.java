package ch2;

import java.util.Scanner;

public class OperatorEx5 {

	public static void main(String[] args) {
        
        //534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때 학생 한 명당 몇 개를 가질 수 있고, 연필의 나머지는 몇 개인지 출력하기, 출력예시: 학생 한 명당: , 남은 연필 수:
	    int pencil=534;
		int student=30;
		
		int share=pencil/student;
		System.out.println("학생 한 명당: "+share);
		int rest=pencil%student;
	    System.out.println("남은 연필 수: "+rest);
	
		
	
		//사다리꼴 너비 구하기. 윗변:5, 아랫변:10, 높이:7인 사다리꼴 너비 구하기
		int a=5;
		int b=10;
		int c=7;
		
		double result=(a+b)*c/2.0;
		System.out.println("사다리꼴 너비: "+result);
		
		
	    //한 달 월급을 10년 동안 저축할 때 최종 저축 금액 구하기. 조건: 사용자로부터 한달 월급 입력받기, 출력예시: 10년 저축 금액:}
		Scanner sc=new Scanner(System.in);
		System.out.println("한 달 월급을 입력하세요: ");
	    int num1= Integer.parseInt(sc.nextLine());
	    System.out.println("10년 저축금액: "+(num1*12*10));
	    
	    
	    //화씨 온도를 섭씨 온도로 변경하기. 화씨 온도가 100일 때 섭씨온도가 얼마인지 출력하기, 섭씨온도=5/9*(화씨온도-32)
        int fahr=100;
        double cels=5/9.0*(fahr-32);
        System.out.println("섭씨온도: "+cels);
        
        
        //삼항연산자 2개이용
        //int num=10일 때 num이 양수인지, 음수인지, 0인지 출력
        int num=10;
        String result1=num>0 ? "양수": (num<0 ? "음수":"0");
        System.out.println(result1);
        
        
        //삼항연산자 1개 이용, 숫자를 입력받아 짝수인지 홀수인지 출력하기
        System.out.println("숫자를 입력하세요: ");
	    int num2= Integer.parseInt(sc.nextLine());
	    String result3=num2%2==0 ? "짝수": "홀수";
	    System.out.println(result3);
	    
		
	}
}
