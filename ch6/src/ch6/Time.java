package ch6;

import java.util.Set;

public class Time {
	
	//속성: 시, 분, 초
	private int hour;
	private int minute;
	private int second;
	
	//멤버변수가 private을 사용하게 되면 외부에서 접근 불가.=>메소드를 통해서만 클래스 속성의 값을 얻거나 변경할 수 있도록 제공해야 한다.(getter, setter)
	
	public void setHour(int hour) {
		//0~23 사이라면 시간 변경
		if (hour<0||hour>23) return; //이 조건에 맞을 때 이것만 실행하고 밑에 꺼 실행 안하고 종료된다.
		this.hour = hour; //위 조건에 안 맞으면 이 조건이 실행된다.
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	
	
	public void setMinute(int minute) {
		//0~59 사이로 값이 넘어올 때만 minute 값을 변경한다.
		if (minute<0||minute>59) return;
		//0~59 사이일때만 실행한다.
		this.minute=minute;
	}
	
	public void setSecond(int second) {
		//0~59 사이로 값이 넘어올 때만 minute 값을 변경한다.
		if (second<0||second>59) return;
		//0~59 사이일때만 실행한다.
		this.second=second;
	}
	
	public int getSecond() {
		return second;
	}
	
}
