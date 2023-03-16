package Lang;

public class Card {
	
	String kind;
	int number;
	
	//Card 인스턴스 생성: 기본 생성자, 매개인수를 받는 생성자
	//Card card1=new Card("HEART",7) => 이런 식으로 내가 인자 넣어서 새롭게 만들어낼 수도 있다. (매개인수를 받는 생성자)
	//Card card1=new Card() => 이렇게 되면 무조건 spade의 1로 출력이 된다. (기본 생성자)
	public Card() {
		this("SPADE",1);
	}

	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	} 
	
	
//	@Override
//	public String toString() {
//		return "kind : "+kind+", number : "+number; //내가 정해도 된다.
//	} 
	
	

}
