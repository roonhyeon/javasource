package ch4;

import java.util.Scanner;

public class WhileEx5 {

	public static void main(String[] args) {
		
		boolean run=true;
		int balance=0; //잔액 변수
		Scanner sc=new Scanner(System.in);
		
		while (run) {
			
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("메뉴 선택 >> ");
			int menu=Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				//예금액 입력받기
				//잔액=잔액+예금액
				System.out.print("예금액을 입력해주세요: ");
				int account=Integer.parseInt(sc.nextLine());
				balance=balance+account;
//				balance+=Integer.parseInt(sc.nextLine()); 더욱 간략하게
				break;
            case 2:
            	//출금액 입력받기
            	//잔액=잔액-출금액
            	System.out.print("출금액을 입력해주세요: ");
				int out=Integer.parseInt(sc.nextLine());
				balance=balance-out;
				break;
            case 3:
            	//현재 잔액 출력
	            System.out.printf("현재 잔액: %d\n",balance);
	            break;
            case 4:
				run=false; //while문의 종료 기준은 조건이 false일 때 이므로!
				break;
			default:
				break;
			}
		}
		
		
		
		
	}
}
