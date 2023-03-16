package poly;

public class Buyer {
	
	int money=100;
	int bonusPoint=0;
	
	void buy(Product p) { //computer나 tv말고 Product로 설정해야 computer 살 지 tv를 살 지 고를 수 있다.) 매개변수의 다형성: 부모 변수로 받는다. 
		if(money<p.price) {
			System.out.println("잔액 부족으로 물건을 구매할 수 없습니다.");
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println(p+"을/를 구매하셨습니다."); //여기서 p를 쓸 때 주소값으로 나오지 않게 하기 위해서 앞서 tv1과 computer에 tostring을 써주었다.
	}

}
