package shop2;

public class CellPhone extends Product {
	
	String carrier; //통신사 정보
	
	public CellPhone(String name, int price, String carrier) {
		super(name, price);
		this.carrier=carrier;
	}
	
	//CellPhone의 이름과 가격을 출력 메소드
	
	
	//통신사 정보 출력 메소드
	public void printExtra() {
		System.out.println("통신사 정보: "+carrier);
	}

	
	
	
}
