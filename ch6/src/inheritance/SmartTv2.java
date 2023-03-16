package inheritance;

//Tv 쿨래스를 상속받은 SmartTv
public class SmartTv2 extends Tv2 {
	
	boolean caption; //기본값은 false
	
	
	public SmartTv2(boolean power, int channel) {
		super(power, channel);
		// TODO Auto-generated constructor stub
	}
//	public SmartTv2() {
//		super(); //부모(Tv2)의 기본생성자 호출
//	}
	

	void dispalyCaption(String text) {
		if (caption) {
			System.out.println(text); //caption이 true이면 출력
		}
	}
}