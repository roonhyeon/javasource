package exam;

import java.util.Scanner;

public class BankApp {
	//인스턴스 변수(초기화 완료) 2개
	private static Account[] accountArray=new Account[10]; //Account 객체 배열 10개 선언하고 생성 //자기 패키지뿐만 아니라 다른 패키지의 것도 불러올 수 있다.
	private static Scanner scanner=new Scanner(System.in); //사용자 입력 준비

	public static void main(String[] args) {
		
		boolean run=true; //run이 true일 때 반복문이 실행된다.
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택 >> ");
			
			//sc.nextLine(); => String 타입으로 입력값을 처리하겠다.
//			int selectNo=scanner.nextInt(); //1 입력하고 엔터 => nextInt가 1만 가져감, 엔터는 그대로 남아있다.			
			int selectNo=Integer.parseInt(scanner.nextLine());
			
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				//while 문 종료
				run=false;
				break;
			default:
				break;
			}
		} //while문 종료		
	} //main 종료	
	
	private static void createAccount() {
		//계좌 생성
		//입력받기: Account 인스턴스를 생성하기 위한 값		
		System.out.println("계좌번호: ");
		String ano=scanner.nextLine();
		System.out.println("예금주: ");
		String owner=scanner.nextLine();
		System.out.println("잔액: ");
		int balance=Integer.parseInt(scanner.nextLine());
		
		//for문을 돌려 i에 해당하는 배열 초기값이 null이면 수행
		//한번만 수행되고 빠져나오기
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i]==null) {
				 accountArray[i]=new Account(ano,owner,balance);
				 System.out.println("계좌가 생성되었습니다.");
				 break;
			}		
		}	
	}
	
	private static void accountList() {
		//accountArray에 있는 내용 출력 => 생성된 계좌 정보 출력
		System.out.println();
		System.out.println("계좌목록");
		System.out.println("-----------------------------------------");
		//null이 아닌 경우만 출력
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i]!=null) {
			 System.out.printf("%s\t%s\t%d\n",accountArray[i].getAno(),accountArray[i].getOwner(),accountArray[i].getBalance());
			 System.out.println();
			}
		}
	}	
	
	private static void deposit() {
		//accountArray에서 일치하는 계좌를 찾아 잔액=잔액+예금액
		System.out.println();
		System.out.println("계좌번호: ");
		String ano=scanner.nextLine();
		System.out.println("예금액: ");
		int check=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i]!=null && accountArray[i].getAno().equals(ano)) {
			 accountArray[i].setBalance(accountArray[i].getBalance()+check);
			 System.out.printf("잔액= %d",accountArray[i].getBalance());
			 System.out.println();
			}
		}
	}	
	
	private static void withdraw() {
		System.out.println();
		System.out.println("계좌번호: ");
		String ano=scanner.nextLine();
		System.out.println("출금액: ");
		int checkout=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i]!=null && accountArray[i].getAno().equals(ano)) {
			 accountArray[i].setBalance(accountArray[i].getBalance()-checkout);
			 System.out.printf("잔액= %d",accountArray[i].getBalance());
			 System.out.println();
			}
		}
	} //메소드 5개
}
