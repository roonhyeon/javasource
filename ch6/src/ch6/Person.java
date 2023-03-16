package ch6;

public class Person {
	
	String name;
	float height;
	float weight;
	
	void print() {
		System.out.println("이름: "+name);
		System.out.println("키: "+height);
		System.out.println("몸무게: "+weight);
	}
	
	//name 매개변수에 값을 받아서 Person이 가지고 있는 name 인스턴스 변수의 값을 변경하겠다.
	public void setName(String name) { //set을 쓸 때는 주로 void랑 같이 써준다.
		//name이 공백이 아니거나 null이 아니면 값을 세팅해주고 싶다.
		//내 꺼 name의 값을 name 값으로 변경할거야!
		this.name=name;
		
		//공백이나 null이면 기본값을 홍길동으로 세팅한다.
		if (name.equals("")||name==null) {
			this.name="홍길동";
		} else {
			this.name=name;;
		} //PersonEx에서 p.print()을 통해 출력해주고 있으므로 여기서는 return 해주지 않아도 된다.
	}
	
	static void print2() {
		Person p=new Person(); //생성되는 시기가 다르므로 이 문장이 없으면 static 메소드에서는 static이 붙은 것을 제외하고는 이것을 불러오지 못한다.
		p.setName("");
	} 
}
