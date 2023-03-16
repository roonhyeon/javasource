package poly;

//Tv 쿨래스를 상속받은 SmartTv
public class SmartTv extends Tv {
	
	boolean caption; //기본값은 false
	
	void dispalyCaption(String text) {
		if (caption) {
			System.out.println(text); //caption이 true이면 출력
		}
	}
	
}