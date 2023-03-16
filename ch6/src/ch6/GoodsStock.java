package ch6;

public class GoodsStock {

	//상품관리를 위한 클래스
	
	//속성
	//상품코드(p123456)
	String code;
	//재고수량(200)
	int stockNum; 
//	
//	//생성자를 하나도 명시하지 않으면 기본 생성자를 알아서 생성해준다.
//	public GoodsStock() {
//		// TODO Auto-generated constructor stub
//	} //기본 생성자
	
	public GoodsStock(String code, int stockNum) {
		super();
		this.code = code;
		this.stockNum = stockNum;
	} //매개변수를 가진 생성자 생성: source-밑에서 세번째

	
	//기능
	//제품 팔면 재고수량 감소
	void subtractStock() {
		System.out.println("재고수량 감소");
	}
	//제품 입고하여 재고수량 증가
	void addStock() {
		System.out.println("재고수량 증가");
	}


	@Override
	public String toString() {
		return "GoodsStock [code=" + code + ", stockNum=" + stockNum + "]";
	}

}
