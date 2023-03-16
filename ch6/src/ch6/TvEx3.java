package ch6;

public class TvEx3 {

	public static void main(String[] args) {
		
        //객체 생성
        Tv3 tv=new Tv3();
        Tv3 tv2= new Tv3("white",7,false);
        
        //초기화
        //private이 있을 때 초기화를 하기 위해서는 생성자가 무조건 필요하다.
        
        //현재 채널 정보를 알고 싶다면?
        System.out.println("현재 채널: "+tv2.getChannel());
        System.out.println("현재 색상: "+tv2.getColor());
        System.out.println("현재 전원 여부: "+tv2.isPower());
        
        
        //채널 변경
        tv2.setChannel(150); //메소드 호출 시 void인 경우 호출만 가능하지 syso에 넣지 못한다.
        System.out.println("현재 채널: "+tv2.getChannel());
        
        //색상 변경
        tv.setColor("black"); //메소드 호출 시 void인 경우 호출만 가능하지 syso에 넣지 못한다.
        System.out.println("tv1 color: "+tv.getColor());
        
	}
}
