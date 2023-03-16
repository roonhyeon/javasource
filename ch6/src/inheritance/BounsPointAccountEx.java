package inheritance;

public class BounsPointAccountEx {

	public static void main(String[] args) {
		
		//예금액: 100000
		//현재 보너스포인트: 1000점
		BounsPointAccount bounsPointAccount=new BounsPointAccount("110-200","홍길동",0,0);
		
		//예금
		int amount=100000;
		bounsPointAccount.deposit(amount);
		System.out.println("예금액: "+amount);
		
		//보너스포인트
		System.out.println("현재 보너스 포인트: "+bounsPointAccount.getBonusPoint());
		
	}
}