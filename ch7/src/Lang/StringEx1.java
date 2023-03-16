package Lang;

public class StringEx1 {

	public static void main(String[] args) {
		
		//String 클래스의 동작 구현
		//String 클래스는 문자열을 다루는 일이 많기 때문에 new를 사용하지 않고도 인스턴스를 생성할 수 있다.
		String str2="Hello"; //문자열 리터럴 지정 방식: 문자열을 재사용 한다.
		String str4="Hello";
		String str=new String("안녕하세요"); //new를 사용하는 방식
		String str3=new String("안녕하세요");
//		str2=str2+str; //String은 변경이 불가능한 클래스이므로 원본 수정이 아니라 새로운 공식 생성하는 것이다.
		
		//문자열 비교
		System.out.println(str2.equals(str)); //equals가 String 클래스에 오버라이딩이 되어있기 때문에 자동적으로 값 비교로 설정되어 있다.
		System.out.println(str2.equalsIgnoreCase(str));
		System.out.println(str==str3); //==는 주소 비교이므로 문자열 비교 시에는 ==을 사용하지 않는다.
		System.out.println(str2==str4); //true => 이것 역시 주소 비교이다. 착각하지 말기!! 단지 주소를 공유해서 같은 주소를 가졌을 뿐. 그냥 equals 쓰자.
	}

}