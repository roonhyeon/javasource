package ch6;

public class Car2 {
	//속성: 제조사, 모델, 색상, 최대속도.... 
		String company;
		String model;
		String color;
		int maxSpeed; //변수 선언하듯이 클래스 선언
		
		//생성자(Constructor)
		//만드는 법: 마우스 우클릭-source-Generate Constructor using fields...
		//생성자의 이름은 클래스 이름과 동일해야 한다.
		//리턴값이 없다.
		//생성자는 여러 개 존재 가능(=생성자 오버로딩). 객체 생성 시 골라서 부를 수 있다.
		//목적: 인스턴스가 생성될 때 호출됨, 인스턴스 초기화 담당(or 인스턴스 생성 시 수행될 코드)
		
		
        //기본(default) 생성자
		public Car2() { //생성자의 이름=클래스 이름
			super();	
		}
		
        //매개변수(company,model,color,maxSpeed)가 있는 생성자
		public Car2(String company, String model, String color, int maxSpeed) {
			super();
			//this는 내가 가지고 있다는 의미
			this.company = company; //company 값을 내가 객체 생성해서 가지고 있는 this.company에 할당해줘
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
}

		
