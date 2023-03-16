package ch6;

public class GoodsStockEx {

	public static void main(String[] args) {
		
		//티셔츠 상품관리
		
		//객체 생성=>기본 생성자가 자동 호출되고 있다.
		//생성자를 하나도 명시하지 않으면 기본 생성자를 알아서 생성해준다. 아무것도 없을 때만 그렇다. 매개변수 있는 생성자를 만들어준 뒤면 이거 안 통한다.
		//그렇기 때문에 앞서 기본 생성자를 정의하지 앟은 경우라면 가로 안에 인자를 입력해주어야 오류가 나지 않는다.
		GoodsStock goods=new GoodsStock("p123456",150); //매개변수가 있는 생성자 호출
		
		System.out.println("현재 재고수량 "+goods.stockNum);
		
		//상품이 10개 판매됨
		goods.subtractStock();
		

	}
}
