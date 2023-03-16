package poly;

public class ProductEx2 {

	public static void main(String[] args) {
		
		//구매자 인스턴스 생성
		Buyer2 buyer=new Buyer2();
		
		buyer.buy(new Tv1()); //Buyer에 있는 void buy(Product p)에 투입된다.
		buyer.buy(new Computer());
		buyer.buy(new Audio());
		
		//카트 정보 출력
		buyer.summary();
		
		
	}
}
