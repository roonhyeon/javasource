package ch6;

public class CarEx2 {

	public static void main(String[] args) {
		
        //객체 생성 시 생성자가 자동으로 호출됨 
        Car2 car=new Car2(); //public Car2() 이거 자동으로 호출됨
        
        //초기화
        car.model="제네시스";
        car.company="현대";
        car.color="블랙";
        car.maxSpeed=300; //이렇게 직접 값을 할당하는 방식은 권장하지 않는다.
        
        //기본생성자를 호출(실행)하면서 객체 생성
        System.out.println("제조사: "+car.company);
		System.out.println("모델명: "+car.model);
		System.out.println("색상: "+car.color);
		System.out.println("최대속도: "+car.maxSpeed);
		System.out.println();
		
		//초기화 권장방식1: 생성자 사용
        Car2 car2=new Car2("기아","레이","white",200); 
        //public Car2(String company, String model, String color, int maxSpeed) 자동으로 호출
        //매개변수가 있는 생성자를 호출(실행)하면서 객체 생성
        System.out.println("제조사: "+car2.company);
		System.out.println("모델명: "+car2.model);
		System.out.println("색상: "+car2.color);
		System.out.println("최대속도: "+car2.maxSpeed);
        
	}
}
