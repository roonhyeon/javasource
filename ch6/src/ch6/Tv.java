package ch6;

public class Tv {
    //속성(property): 크기, 길이, 높이, 색상, 볼륨, 채널....=> 멤버변수
	String color; //색상 저장
	int channel; //채널 저장
	boolean power; //전원상태 변수 선언
	
	//기능(function): 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경....=> 메서드
	void power() {
		power=!power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
}
