package ch7;

public class Account {
	
	//속성: 계좌번호(110-10-10000), 계좌주(홍길동), 잔액(정수)
		String accountNum;
		String owner;
		int balance;
		
		//생성자 생성
		public Account(String accountNum, String owner, int balance) {
			super();
			this.accountNum = accountNum;
			this.owner = owner;
			this.balance = balance;
		}

		//기능: 예금하다(현재잔액 리턴=잔액+예금액), 출금하다(현재잔액 리턴=잔액-출금액, 잔액>출금액)
		//예금
		int deposit(int amount) {
			balance+=amount;
			return balance;
		}
		//출금
		int withdraw(int amount) {
			if (balance<amount) {
//				throw new RuntimeException("잔액부족");
				throw new BalanceInsufficientException("잔액 부족");
			}
			balance-=amount;
			return balance; //실행 안 됨
		}

}
