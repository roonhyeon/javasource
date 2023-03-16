package inheritance;

public class SmartTvEx1 {

	public static void main(String[] args) {
		
		SmartTv stv=new SmartTv();
		
		//상속 여부 확인
		stv.channel=10;
		stv.channelUp();
		System.out.println("현재 채널 "+stv.channel);
		
		stv.power();
		System.out.println("전원 상태 "+stv.power);
		
		stv.dispalyCaption("Hello World"); //caption의 기본값은 false이다. 그래서 앞선 조건 때문에 출력이 안 된다.
		
		stv.caption=true;
		stv.dispalyCaption("Hello World"); //true로 선언을 해주고 난 후에야 텍스트가 출력이 된다.		
	}
}