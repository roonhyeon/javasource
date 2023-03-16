package thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		//이거랑 smallletter랑 bigletter랑 numprint 4개를 다같이 돌리는 것
		//같이 돌리려면 인스턴스 생성부터
		Thread t1=new BigLetters();
		SmallLetters t2=new SmallLetters();
		Runnable r=new NumPrint(); //이것만으로는 r.star()가 안되므로
		Thread t3=new Thread(r); //이렇게 한번 더 해주고 t3.start()로 찍어내면 된다. 
		
		t1.start();
		t2.start();
		t3.start();
	}

}