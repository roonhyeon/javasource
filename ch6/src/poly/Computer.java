package poly;

public class Computer extends Product{
	
	public Computer() {
		super(100);
	}

	@Override
	public String toString() { //Product에 toString 요소가 없으므로 Object 클래스가 부모 클래스
		return "Computer";
	}
	
}
