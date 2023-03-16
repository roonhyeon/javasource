package inheritance;

public class SmartTvEx2 {

	public static void main(String[] args) {
		
		//이거 한 줄로 SmartTv2, Tv2, Object 인스턴스까지 모두 생성된다.
		SmartTv2 stv=new SmartTv2(false,10); //public SmartTv2()호출->public Tv2()호출->최상위 부모인 object를 호출하고 되돌아 옴.
                                     	
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