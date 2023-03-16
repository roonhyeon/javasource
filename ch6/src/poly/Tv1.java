package poly;

public class Tv1 extends Product{
	
	public Tv1() {
		super(100); // 부모의 매개변수를 받는 생성자 호출: Tv는 100만원, 보너스포인트는 10만원
	}

	@Override
	public String toString() { //Product에 toString 요소가 없으므로 Object 클래스가 부모 클래스
		return "Tv";
	}

}
