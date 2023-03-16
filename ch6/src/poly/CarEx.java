package poly;

public class CarEx {

	public static void main(String[] args) {
		
//		Car car1=new FireEngine();
//		Car car2=new Ambulance();
		
		Car car=null;
		
		FireEngine fireEngine=new FireEngine();
		FireEngine fireEngine2=null; //fireEngine2는 자식 타입에 선언된 필드
		
		car=fireEngine; //Car car=new FireEngine(); 자동 형변환
		fireEngine.water();
		
		
		fireEngine2=(FireEngine) car; //자식 타입에 선언된 필드와 메소드를 사용해야 한다면 부모 타입(car)을 자식의 타입(FireEngine)으로 강제 형변환
		fireEngine2.water(); //이제 이렇게 자식 요소 접근 가능
		
		//오류 Case:
//		FireEngine fe=(FireEngine) new Car(); //자식이 왼쪽에 오고 부모가 오른쪽에 오는 것은 강제 형변환을 해줘도 안 된다.
//		fe.drive();
		
//		FireEngine fe=new Ambulance(); //형제 자매 뭣도 아니고 남남 관계라서 형변환 자체가 안 된다.

	}
}
