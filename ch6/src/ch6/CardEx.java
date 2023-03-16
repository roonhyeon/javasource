package ch6;

public class CardEx {

	public static void main(String[] args) {
		
		//공통 속성 따로 지정
		Card.width=50;
		Card.height=80;
		System.out.println("Card width="+Card.width);
		System.out.println("Card heigth="+Card.height);
		
		Card card1=new Card();
		card1.design="Heart";
		card1.number=7;
//		card1.width=50;
//		card1.height=80;
		
		Card card2=new Card();
		card2.design="Spade";
		card2.number=4;
//		card2.width=50;
//		card2.height=80;
		
		System.out.printf("card1 %s, number=%d, 크기는 (%d, %d)\n", card1.design, card1.number, Card.width, Card.height);
		
		//전체 카드의 크기 변경
		System.out.println();
		Card.width=60;
		Card.height=90;
		System.out.printf("card1 %s, number=%d, 크기는 (%d, %d)\n", card1.design, card1.number, Card.width, Card.height);
		System.out.printf("card2 %s, number=%d, 크기는 (%d, %d)\n", card2.design, card2.number, Card.width, Card.height);
	}

}
