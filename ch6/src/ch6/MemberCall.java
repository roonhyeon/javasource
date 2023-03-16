package ch6;

public class MemberCall {
	
	//인스턴스 변수
	int iv=10;
	//static(클래스) 변수
	static int cv=20;
	
	//인스턴스 변수=클래스 변수
	int iv2=cv;
	
	//클래스 변수=인스턴스 변수 오류
	//인스턴스 변수의 값을 클래스 변수에 대입 불가:
	//메모리에 지금 iv 값이 없다. new 설정을 안해줬기 때문에 아직 인스턴스 값이 메모리에 안 올라와 있다. 그래서 지금 메모리에는 공통공간의 cv=20 밖에 없다.
//	static int cv2=iv;
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); => new 이후에만 가능하다.
//		instanceMethod1(); => 이 아이의 생성 역시 new 이후인데 static은 이미 존재. 그래서 호출 못 함.
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); //iv와 instanceMethod1()은 생성되는 시기가 같아서 문제없다.
	}
	
}
