package ch6;

public class DataEx2 {

	public static void main(String[] args) {
		
		//데이터의 인스턴스를 생성한다.
		//참조형타입 변수명=new 참조형타입();
		Data d=new Data();
		d.x=10;
		Data d2=copy(d); //주소    d.x값
		System.out.println("d2.x="+d2.x);

	}
	
	static Data copy(Data d) {
		Data temp=new Data();
		//
		temp.x=d.x; //d.x의 값을 temp.x의 값에 넣어라: temp.x=10
		return temp; //이게 끝나면 다시 main으로 돌아가서 temp값=Data d2
	}

}
