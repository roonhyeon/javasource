package poly;

public class Audio extends Product{
	
	public Audio() {
		super(50);
	}

	@Override
	public String toString() { //Product에 toString 요소가 없으므로 Object 클래스가 부모 클래스
		return "Audio";
	}
	
}
