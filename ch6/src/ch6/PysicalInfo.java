package ch6;

public class PysicalInfo {
	
	String name;
	int age;
	float height;
	float weight;
	
	//생성자 오버로딩
	public PysicalInfo(String name, int age, float height, float weight) {
//		super();
//		this.name = name;
//		this.age = age;
		this(name, age); //생성자에서 다른 생성자 호출
		this.height = height;
		this.weight = weight;
//		this(height, weight); //제일 첫 줄에서만 가능한 행동
	}

	public PysicalInfo(int age, String name, float height, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight; 
	}
	
	public PysicalInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public PysicalInfo(float height, float weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	

	
	

}
