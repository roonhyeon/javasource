package ch6;

public class Tv4 {
    //private: 외부 접근 불가
	//final: 상수(대문자로 표현)
	//선언하면서 초기화를 한다. 값은 처음 한번만 저장해주면 된다.
	
	//속성(property): 크기, 길이, 높이, 색상, 볼륨, 채널....=> 멤버변수
	private String color; //색상 저장
	private int channel; //채널 저장
	private boolean power; //전원상태 변수 선언
	
	final int VOLUME=10;
	
	public Tv4(String color, int channel, boolean power) {
		super();
		this.color = color;
		this.channel = channel;
		this.power = power;
		//this.VOLUME=10;
	}
	
	public Tv4() {
		super();
	}


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
	
	
    //getter/setter 메소드
	//getter: 변수의 값을 리턴하는 용도
	//setter: 변수의 값을 변경하는 용도
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel; //채널 변경 시 원하는 번호 바로 받아서 변경.
	}

	public boolean isPower() { //boolean 타입만 예외적으로 is로 써준다.
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
}
