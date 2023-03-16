package ch6;

public class Tv2 {
    //속성(property): 크기, 길이, 높이, 색상, 볼륨, 채널....=> 멤버변수
	String color; //색상 저장
	int channel; //채널 저장
	boolean power; //전원상태 변수 선언
	
	//기능(function): 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경....=> 메서드
	void power() {
		power=!power;
	}
	
	//채널을 증가하고 현재 채널을 리턴하고 싶어요.
	//int: 메소드가 실행이 끝난 후 int값을 가지고 돌아간다.(return)
	//void: 메소드 실행이 끝난 후 그냥 돌아간다.(리턴 값 없다.)
	int channelUp() {
		channel++;
		return channel;
	}
	
	void channelDown() {
		channel--;
	}
	
}
