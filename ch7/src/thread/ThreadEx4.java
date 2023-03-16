package thread;

//멀티 쓰레드: -,| 출력하는 작업을 2개의 쓰레드가 처리
// 두 쓰레드가 	번갈아가면서 작업을 처리하기 때문에 쓰레드 간 작업 전환 시간이 소요된다.

public class ThreadEx4 {
	
	static long start=0; //BarPrint에서 static 부르는 법: 클래스명.static 변수명

	public static void main(String[] args) {
		//두 개의 쓰레드가 돌아가도록 설정
		BarPrint t1=new BarPrint();
		t1.start();
		
		start=System.currentTimeMillis();
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s",new String("-"));
		}
		
		long end=System.currentTimeMillis();
		System.out.println("소요시간 1 "+(end-start));
		
	}

}
