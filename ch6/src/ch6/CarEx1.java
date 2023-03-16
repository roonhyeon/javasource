package ch6;

public class CarEx1 {

	public static void main(String[] args) {
		
		//Car 객체 생성
		Car car=new Car(); //new Car():붕어빵 반죽
		
		//초기화(반죽 안에 원하는 소를 넣어)
		car.company="현대";
		car.model="아반떼";
		car.color="black";
		car.maxSpeed=200;
		
		car.forward(); //메소드 호출
		
		System.out.println("제조사: "+car.company);
		System.out.println("모델명: "+car.model);
		System.out.println("색상: "+car.color);
		System.out.println("최대속도: "+car.maxSpeed);
		
	}
}
