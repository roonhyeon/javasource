package abstr;

public abstract class Car {
	
	//추상메소드: 미완성본 => 자식클래스에서 이건 공통사항이라서 자식에서 알아서 각자 원하는 대로 오버라이딩 해서 완성해라.
	public abstract void drive();
	public abstract void stop();
	
	//추상메소드X: 완성본
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void stopCar() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		stopCar();
	}

}
