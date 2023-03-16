package inheritance; //CheckingTrafficCardAccount->CheckingAccount->Account->Object(갈수록 상위 클래스) 
                     //범위 자체는 CheckingTrafficCardAccount가 제일 넓다.

public class CheckingTrafficCardAccount extends CheckingAccount{
	
	//은행+체크카드+교통카드 기능
	private boolean hasTrafficCard; //교통카드 여부
	
	public CheckingTrafficCardAccount(String ano, String owner, int balance, String cardNo, Boolean hasTrafficCard) {
		super(ano, owner, balance, cardNo); //은행+체크카드 기능이 있는 부모 꺼(CheckingAccount) 불러옴	
		this.hasTrafficCard=hasTrafficCard;
	}
	
	//교통비 지불하는 메소드 만들기(int payTrafficCard())
	//카드번호, 사용액 매개변수로 받아 교통카드 기능이 있다면 지불 처리 
	//없으면 '교통카드 기능이 없습니다' 메세지 출력
	
	int payTrafficCard(String cardNo,int amount) {
		if (!hasTrafficCard) {
			System.out.println("교통카드 기능이 없습니다.");
			return 0;
		}
		
		//카드번호 일치하고 잔액이 있다면 지불 처리
		return pay(cardNo,amount); //바로 앞 부모 꺼 가져옴
	}

}
