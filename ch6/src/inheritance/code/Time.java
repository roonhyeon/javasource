package inheritance.code;

public class Time {
	
	private int hour;
	public int minute;
	public int second;
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) { //이렇게 메소드를 생성했기 때문에 잘못된 값이 입력되지 않도록 세팅할 수 있다.
		if(hour<0 || hour>23) return; //0-23 일때만 실행된다.
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute<0 || minute>59) return; 
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second<0 || second>59) return;
		this.second = second;
	}

}
