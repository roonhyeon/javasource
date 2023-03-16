package ch6;

public class Card {
	
	//속성: 무늬(다이아몬드, 클로버...), 숫자, 너비, 높이
	String design; //무늬
	int number; //숫자
	
	//모든 카드의 너비와 높이는 같으므로 공통 속성이다. 공통 속성일 때는 static(클래스) 변수를 사용한다: 클래스명.변수명
	static int width; //너비
	static int height; //높이

}
