package Lang;

public class StringBufferEx1 {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer(); //아무것도 잡지 않으면 Buffer의 크기는 initial capacity of 16 characters.
		StringBuffer sb2=new StringBuffer(100); //Buffer의 크기가 100으로 생성된다.
		StringBuffer sb3=new StringBuffer("Hello"); // buffer의 크기는 문자열의 길이만큼 생성된다.
		
		//StringBuffer sb4="Hello"; //이렇게 값을 직접 할당하는 것은 불가능하다. 이건 String에서 가능하다.
		
		System.out.println(sb2); //Buffer의 공간은 잡아놨기 때문에 공백 공간이 출력된다.
		System.out.println(sb3);
		
		//append(): 원본 문자열 뒤에 가로 안의 내용이 연결되어 출력된다.
		sb2.append(false);
		sb2.append("abc");
		sb2.append('d');
		sb2.append(false).append("abc").append('d'); //이렇게 연결해줘서 작성하는 것도 가능하다.
		System.out.println(sb2);
		
		
		StringBuffer sb4=new StringBuffer("Hello");
		System.out.println("equals() "+sb3.equals(sb4)); //왜 false로 출력이 되는가?? => equals()를 Object가 넘겨준 상태로(주소 비교로) 사용하고 있기 때문이다.
		
		//값 비교를 해야 한다면?? String으로 변경해준다.
		String str1=sb3.toString();
		String str2=sb4.toString();
		System.out.println("String equals() "+str1.equals(str2));
		
		//delete(int start, int end): 시작 위치부터 (끝 위치-1) 사이의 문자를 제거한다.
		StringBuffer sb5=new StringBuffer("0123456");
		StringBuffer sb6=sb5.delete(3, 6); //345제거(끝나는 위치는 제거 대상에 포함 안된다.)
		System.out.println("sb5 "+sb5);
		System.out.println("sb6 "+sb6);
		
		//deleteCharAt(int index): index 위치의 문자를 제거하고 출력한다.
		sb5=new StringBuffer("0123456");
		sb6=sb5.deleteCharAt(4); //index 4(5번째)의 위치에 있는 문자열을 제거하고 출력
		System.out.println("sb5 "+sb5);
		System.out.println("sb6 "+sb6);
		
		//insert(int offset, 삽입할 값): offset의 위치에 값을 삽입하여 출력한다.
		sb5.insert(4, "-"); //5번째 위치에 '-'추가되서 출력
		System.out.println("insert() "+sb5);
		
		//replace(int start, int end, String str): 시작 위치부터 (끝 위치-1) 사이의 문자를 str로 변경한다.
		sb5=new StringBuffer("0123456");
		sb5.replace(3, 6, "abc");
		System.out.println("replace() "+sb5);
		
		str2="0123456789";
		//거꾸로 출력: 9876543210
		for (int i = str2.length()-1; i >= 0; i--) {
			System.out.print(str2.charAt(i));
		}
		
		//reverse(): 거꾸로 출력
		System.out.println();
		sb5=new StringBuffer(str2);
		System.out.println(sb5.reverse());
		
		//setCharAt(int index, char ch): index 위치에 ch로 문자열 변경
		sb5=new StringBuffer("0123456");
		sb5.setCharAt(3, 'c');
		System.out.println("setCharAt() "+sb5);
		
	}
}
