package poly;

public class ProductEx {

	public static void main(String[] args) {
		
		//구매자 인스턴스 생성
		Buyer buyer=new Buyer();
		
		//Tv 구매하다
//		Tv1 tv1=new Tv1();
//		buyer.buy(tv1);
		buyer.buy(new Tv1()); //Tv1 tv1=new Tv1(); 처럼 양쪽이 같고, tv1.뭐시기 안 쓸 거면 이렇게 한 줄로 간단하게 작성이 가능하다.
		
		//Computer 구매하다
//		Computer computer=new Computer();
//		buyer.buy(computer);
		buyer.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+buyer.money+"만원입니다.");
		System.out.println("현재 보너스 점수는 "+buyer.bonusPoint+"점입니다.");
		
	}
}
