package poly;

public class Product {
	int price;
	int bonusPoint;
	
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int price) {
		super();
		this.price = price;
		bonusPoint=(int)(price/10.0); //보너스 점수는 제품 가격의 10%
	}
	
}
