package inheritance.code;

public class TimeEx {

	public static void main(String[] args) {
		
		Time time=new Time();
		
//		time.hour=30; //public int hour로 인해 값을 내 마음대로 제어할 수 없다. 그렇기 때문에 private int hour로 바꿔준다.
		time.setHour(30);

	}
}
