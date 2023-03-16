package ch4;

import java.util.Iterator;
import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		//중첩 for문
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//1. 바깥 for int i=1;
		//2. i<6;
		//3. 안쪽 for int j=0;
		//4. j<10;
		//5. System.out.print("*");
		
		//6. j++로 j=1이 됨
		//7. j<10;까지 실행됨
		//8. System.out.print("*");
		//9. 6~8이 반복됨
		
		//10. j가 10이 되면 안쪽 for가 거짓이 되고 안쪽 for는 종료한다.
		//11. System.out.println(); 실행
		//12. 바깥쪽 for i++로 i=2가 됨
		//13. i<6 조건 비교
		//14. 안쪽 for문 10번 수행
		//15. 계속 반복되다가 i가 6이 되는 순간 for문 종료됨
		
	
		
		for (int i = 1; i <=1; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <=2; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <=3; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <=4; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		//이중 for문
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//4x+5y=60의 모든 해 구하기. 단, x,y는 10이하의 자연수
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if(4*i+5*j==60) {
				    System.out.printf("(%d, %d)\n",i,j);
			    }
			}		
		}
		
		//break;
		//자신이 포함된 가장 가까운 반복문을 벗어나게 된다. (주로 if와 같이 사용됨)
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i==5) break; //강제종료 기능
		}
		
		
		for (int i = 0; i <= 10; i++) {
			if (i%3==0) continue;
				System.out.println(i); //3의 배수(3, 6, 9)를 만나면 출력하지 않고 다음 숫자인 4를 집어넣어 다시 반복한다는 의미
		}
		
		
		
		
		
		
		
		
	}
}
