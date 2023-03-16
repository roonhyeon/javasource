package ch6;

public class TvEx1 {

	public static void main(String[] args) {
		
		//클래스로부터 객체를 만드는 과정: 인스턴스화
		//Tv 객체 생성
		//Tv tv=new Tv(); //형식: 클래스이름 변수명=new 클래스이름();
        
		//객체 선언
		Tv tv;
		//객체 생성
		tv=new Tv();
		
//		//객체가 갖고 있는 속성, 메소드를 사용하기 위해서는(멤버 변수나 메소드에 접근하려면) .(dot)으로 접근한다.
//		System.out.println("색상 "+tv.color);
//		System.out.println("채널 "+tv.channel);
//		System.out.println("전원여부 "+tv.power);
//		System.out.println();
		print(tv); //주소 넘어감 
		
		//멤버변수 초기화
		tv.color="black";
		tv.channel=6;
		tv.power=true;
	
		
		//초기화 후 확인
//		System.out.println("색상 "+tv.color);
//		System.out.println("채널 "+tv.channel);
//		System.out.println("전원여부 "+tv.power);
//		System.out.println();
		print(tv);
		
		//메소드 호출 => 메소드 실행
		tv.channelUp();
		System.out.println("채널 "+tv.channel);
	    
		tv.power();
		System.out.println("전원여부 "+tv.power);
		System.out.println();
	    
		//새로운 객체 생성
	    Tv tv2=new Tv();
	    tv2.color="white";
	    tv2.channel=11;
	    
	    //tv 켜기, 끄기
	    tv2.power(); //킴
	    print(tv2);
//	    System.out.println("색상 "+tv2.color);
//		System.out.println("채널 "+tv2.channel);
//		System.out.println("전원여부 "+tv2.power);

	}
	
	static void print(Tv tv) {
		System.out.println("색상 "+tv.color);
		System.out.println("채널 "+tv.channel);
		System.out.println("전원여부 "+tv.power);
	}
	
	
	
	
	
	
	
	
	
	
	
}
