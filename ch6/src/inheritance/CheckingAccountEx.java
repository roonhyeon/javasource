package inheritance;

public class CheckingAccountEx {

	public static void main(String[] args) {
		CheckingAccount checkingAccount=new CheckingAccount("110-220","홍길동",100000,"4444-5555");
		
		//카드번호 다를 때
		checkingAccount.pay("3333-5555", 50000);
		//카드번호 동일, 잔액
		int balance=checkingAccount.pay("4444-5555",50000);
		System.out.println("사용액 지불 후 잔액: "+balance); //여기서 balance는 부모 클래스에서 가져온 게 아니라 여기서 설정한 지역변수다.
	
	
	
	
	
	
	
	
	
	
	}
}
