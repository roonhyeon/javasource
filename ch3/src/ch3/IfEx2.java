package ch3;


import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		
		int jumsu=70;
		char grade=' '; //점수가 범위 내에 없을 경우에 대비하여 지역변수 초기화 후 사용
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
		}else { //0~49: 이때는 지역변수 초기화가 안되어도 실행 오류가 없다.
			grade='F';
		}
		System.out.printf("점수: %d, 등급: %c\n", jumsu, grade);
		
		
	}

}
