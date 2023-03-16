package inheritance;

public class CheckingAccount extends Account {
	
	private String cardNo; //체크카드 번호
	
    //은행계좌 + 체크카드 기능
	public CheckingAccount(String ano, String owner, int balance, String cardNo) {
		super(ano, owner, balance); //이 매개변수 갖고 있는 부모 클래스(Account) 생성자 호출
		this.cardNo=cardNo; //자식 꺼는 여기서 해결하겠다.	
	}
	
	//체크카드 사용액을 지불하는 메소드 만들기
	//카드번호, 사용액을 매개변수로 받아서 은행잔고보다 작은 경우 사용액을 지불
	//카드번호도 일치한지 확인한다.
	//은행잔고보다 크거나 카드번호가 일치하지 않으면 '지불 불가' 메세지 출력
	//메소드명: pay(cardNo, amount), return 돈 뺀 후 잔액
	int pay(String cardNo,int amount) {
		
		if (!this.cardNo.equals(cardNo) || amount>super.getBalance()) {
			System.out.println("지불 불가. 카드번호나 잔액을 확인해주세요.");
			return 0; //밑에는 실행하지 않도록 하기 위해서
		}
		
//		//잔액=잔액-사용액;
//		//위 if 조건이 아니라면 이거 출력
//		setBalance(getBalance()-amount);
//		return getBalance();
		
		//부모가 갖고 있다면 부모의 메소드 호출
		return super.withdraw(amount); //부모의 메소드라는 뜻으로 super를 붙여쓸 수 있지만 여기서는 없어도 된다.
	}	
}
