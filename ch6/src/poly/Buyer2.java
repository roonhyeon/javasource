package poly;

public class Buyer2 {
	
	int money=1000;
	int bonusPoint=0;
	
	Product cart[]=new Product[5]; //구입한 제품을 저장하기 위한 배열. Product를 상속받은 모든 자식들 요소(tv, computer, audio)를 다 담을 수 있다.
	int i=0;
			
			
	//Product p=tv1 or computer or audio
	void buy(Product p) { //computer나 tv말고 Product로 설정해야 computer 살 지 tv를 살 지 고를 수 있다.) 매개변수의 다형성: 부모 변수로 받는다. 
		if(money<p.price) {
			System.out.println("잔액 부족으로 물건을 구매할 수 없습니다.");
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		cart[i++]=p; //카트 공간 각각에 요소(tv, computer, audio) 각각 넣어주기
		System.out.println(p+"을/를 구매하셨습니다."); //여기서 p를 쓸 때 주소값으로 나오지 않게 하기 위해서 앞서 tv1과 computer에 toString을 써주었다.
	}
	
	void summary() {
		//구매한 물품에 대한 정보를 요약해서 보여주기
		//구입한 물품의 가격합계
		//구입한 물품목록
		//위에서 정의한 배열을 돌려주면 된다.
		int sum=0;
		String itemList="";
		
		for (int i = 0; i < cart.length; i++) {
			if (cart[i]==null) break;
			
			sum+=cart[i].price;
			itemList+=cart[i]+", ";
		}
		
		System.out.println("구입하신 물품의 총 금액은 "+sum+"만원 입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}

}
