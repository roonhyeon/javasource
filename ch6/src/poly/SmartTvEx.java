package poly;

public class SmartTvEx {

	public static void main(String[] args) {
		
		SmartTv smartTv=new SmartTv(); //참조 변수의 타입과 인스턴스 타입이 일치
		
		Tv tv=new SmartTv(); //다형성. 조상타입 참조 변수로 자손 타입 인스턴스를 참조
		
//		SmartTv smartTv2=new Tv(); //에러 남. 
		
	}
}
