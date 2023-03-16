package inheritance;

public class CheckingTrafficCardAccountEx {

	public static void main(String[] args) {
		
		CheckingTrafficCardAccount checkingTrafficCardAccount=new CheckingTrafficCardAccount("110-220","전우치",100000,"2222-3333",false);
		
		CheckingTrafficCardAccount checkingTrafficCardAccount2=new CheckingTrafficCardAccount("110-330","이몽룡",100000,"2222-4444",true);
		
		//교통카드 기능이 없을 때
		checkingTrafficCardAccount.payTrafficCard("2222-3333",2500);
		
		//교통카드 기능이 있을 때-카드번호 불일치
		System.out.println(checkingTrafficCardAccount2.payTrafficCard("6666-7777",15000));
		
		//교통카드 기능이 있을 때-카드번호 일치
		System.out.println(checkingTrafficCardAccount2.payTrafficCard("2222-4444",15000));
		
		
	}
}
