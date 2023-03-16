package abstr;

public class ManuCar extends Car {

	//추상클래스 오버라이딩 강제
	@Override
	public void drive() {
		System.out.println("사람이 주행 중입니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟아서 멈춥니다.");
	}

}
