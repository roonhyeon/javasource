package inheritance;

//this(), this.변수명: 자기 자신
//super(), super.변수명: 부모

public class Tv2 {
	
	boolean power;
	int channel;
	
	
//	public Tv2() {
//		super(); //부모의 기본생성자 호출
//	}
	
	public Tv2(boolean power, int channel) {
	super();
	this.power = power;
	this.channel = channel;
}
	
	
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