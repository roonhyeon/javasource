package Lang;

import java.util.Arrays;
import java.util.Iterator;

public class StringEx2 {

	public static void main(String[] args) {
		
		//new String(char value[]) => 캐릭터 배열 선언해주기
		char c[]= {'H','e','l','l','o'};
		String str1=new String(c);
		System.out.println(str1);
		
		String str2="Hello";
		System.out.println("length() : 문자열 길이 "+str1.length());
		
		//charAt(int index): char => charAt 호출 시 () 안에 int 매개변수를 넣어서 호출하고, void가 아니라면(리턴값이 존재한다면) 리턴값은 char로 받는다는 의미.
	    System.out.println(str1.charAt(0)); //()안에는 str1의 총 길이 내에서 숫자를 입력해줄 수 있다.
	    System.out.println(str1.charAt(str1.length()-1));
	    
	    System.out.println();
	    String str3="자바 프로그래밍프";
	    //str3 문자열에 '프' 문자가 들어있는지 확인하고 싶다. => 글자열 길이만큼 for문을 돌려 charAt으로 한 글자씩 뽑아내주고, 그게 '프'와 같은지 비교.
	    for (int i = 0; i < str3.length(); i++) {
	    	if(str3.charAt(i)=='프') {
	    		System.out.println("문자열에 '프' 문자가 포함되어 있습니다.");
	    		break;
	    	}
		}
	    
	    int cnt=0; //프 문자 개수를 세는 변수
	    for (int i = 0; i < str3.length(); i++) {
	    	if(str3.charAt(i)=='프') {
	    		cnt++;
	    	}
	    }
	    System.out.println(cnt>0 ? "프가 포함되어 있다.":"");
	    System.out.println();
	    
	    
	    //indexOf(int ch): 주어진 문자 ch가 문자열에 들어있는지 확인하고 그 문자의 위치를 리턴(못 찾으면 -1 리턴)
	    //String str2="Hello";
	    System.out.println("indexOf(int ch): "+str2.indexOf('o'));
	    System.out.println("indexOf(String str: "+str2.indexOf("o"));
	    System.out.println("indexOf(String str: "+str2.indexOf("llo"));
	    System.out.println("indexOf(int ch, int fromIndex: "+str2.indexOf('e', 0)); //0은 시작점 위치: 0번 자리부터 시작해서 찾아줘
	    System.out.println("indexOf(int ch, int fromIndex: "+str2.indexOf('e', 2)); //2번 위치부터 시작해서 찾아줘
	    
	    //lastIndexOf(): 위치를 찾을 때 오른쪽 끝에서부터 찾는다.
	    System.out.println("lastIndexOf(int ch): "+str2.lastIndexOf('o'));
	    
	    //str3 문자열에 '프'가 들어있는지 찾을 때 indexOf만 사용하기
	    //String str3="자바 프로그래밍프";
	    System.out.println(str3.indexOf('프') > -1 ? "프가 들어있음":"");
	    
	    //subString(): 범위에 해당하는 문자열을 얻을 수 있다.
	    String ssn="880515-1222012";
	    //subString(int beginIndex)
	    String result=ssn.substring(3);
	    System.out.println(result);
	    //subString(int beginIndex, int endIndex): endIndex 미포함
	    System.out.println("subString(int beginIndex, int endIndex) "+ssn.substring(3, 8)); //515-1
	    
	    //concat(String str): + 와 같은 역할을 한다.
	    String result2=str2.concat(" 안녕하세요:)");
	    System.out.println(result2);
	    
	    //startsWith(String prefix): 가로 안의 문자가 str4의 시작하는 문자이면 true, 아니면 false 출력
	    String str4="java.lang.Object";
	    System.out.println("startsWith(String prefix) "+str4.startsWith("game"));
	    System.out.println("startsWith(String prefix) "+str4.startsWith("java"));
	    System.out.println("startsWith(String prefix, int toOffset) "+str4.startsWith("java", 3));
	    
	    //endsWith(String suffix): suffix로 끝나느냐?
	    System.out.println("endsWith(String prefix) "+str4.endsWith("java"));
	    
	    //contains(CharSequence s): s 문자열이 포함되어있는지 검사한다.
	    System.out.println(str2.contains("Hello"));
	    
	    //replace(CharSequence target, CharSequence replacement): 원본 문자열에서 target을 찾아서 replacement로 변경해주세요.
	    String str5="자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
	    System.out.println(str5.replace("자바", "java")); //str5에서 '자바'라는 문자열을 찾아서 'java'로 변경해주세요. replace() 결과를 새로운 문자열로 리턴함.
	    System.out.println(str5); //그러나 String 클래스는 원본을 변경할 수 없기 때문에 str5의 내용은 그대로이다. 
	    //원본 문자열이 변경되길 원한다면 새로운 문자열에 리턴되는 값을 다시 담아줘야 한다. 
	    
	    //replaceFirst(String regex, String replacement): 해당하는 문자열이 여러 개여도 첫번째로 해당하는 문자열만 바꾼다.
	    System.out.println(str5.replaceFirst("자바", "java"));
	    System.out.println(str5.replaceAll("자바", "java"));
	    
	    //trim(): 양쪽 공백을 제거해준다.(중간 공백은 제거하지 못한다.)
	    String str6="     Hello World     ";
	    System.out.println(str6); //공백도 문자이기 때문에 공백까지 그대로 함께 출력된다.
	    System.out.println(str6.length()); //공백까지 합쳐서 문자열의 총 길이는 21.
	    System.out.println(str6.equals("Hello World")); //공백이 있기 때문에 다르다.
	    System.out.println("trim() "+str6.trim());
	    
	    //static 메소드 부르는 법: 클래스이름.메소드명, 클래스이름.상수
	    //valueOf(): static 메소드(static String valueOf()), 지정된 값을 문자열로 변환하여 반환
	    System.out.println(String.valueOf(true)); //"true"
	    System.out.println(String.valueOf('c')); //"c"
	    System.out.println(String.valueOf(100)); //"100" => Integer.parseInt("100")을 해주면 다시 100으로 돌아간다.
	    
	    //a를 문자열로 변경
	    int a=100;
	    String str7=a+""; //int+String을 해주면 그냥 전부 String이 된다. 
	    
	    //toLowerCase(): 모든 문자열을 소문자로 바꿔준다, toUpperCase(): 모든 문자열을 대문자로 바꿔준다.
	    System.out.println("toLowerCase() "+str2.toLowerCase());
	    System.out.println("toUpperCase() "+str2.toUpperCase());
	    
	    //split():
	    String animals="dog, cat, bear";
	    //regex: Regular expressing(정규 표현식)-특정한 규칙을 가진 문자열의 집합
	    String arr[]=animals.split(","); //문자열을 comma를 기준으로 나눠주세요.
	    System.out.println(arr); //toString 오버라이딩을 안해서 배열을 찍었는데 주소가 나오면 1. for문을 돌려주면 된다.
	    
	    System.out.println(Arrays.toString(arr)); //2. 배열 형식으로 찍어준다.(배열 구성 확인용)
	    
	    //for
	    for (int i = 0; i < arr.length; i++) { //잘 나누어졌는지 for문 돌려서 하나씩 출력 (for문 출력을 활용하면 좀 더 다양한 형태로 출력이 가능하다.)
			System.out.println(arr[i]);
		}
	    
	    //split(String regex, int limit): regex를 기준으로 문자열을 나누되, limit 개수의 그룹으로 나눠주세요.
	    arr=animals.split(",",2); //문자열을 comma를 기준으로 나누되, 2 그룹으로 출력해주세요.
	    System.out.println(Arrays.toString(arr));
	    for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	    
	    //compareTo(String str): 앞의 문자열과 str 문자열을 비교하겠다.(사전 순서) => 같으면 0, 첫 글자부터 비교를 시작하여 사전 순으로 이전이면 음수, 이후면 양수다.
	    System.out.println("compareTo() "+"aaa".compareTo("aaa")); //값은 int로 출력이 된다.
	    System.out.println("compareTo() "+"aaa".compareTo("bbb")); 
	    System.out.println("compareTo() "+"bbb".compareTo("aaa")); //bbb가 aaa보다 사전 순으로 이후이므로 양수 1이 출력된다.
	    System.out.println("compareTo() "+"aaa".compareTo("abc")); //첫 글자 a가 같으므로 두 번째 글자로 비교한다.
	    
	    //join(): static 메소드, 특정 문자열(구분자)로 결합이 되어서 출력된다. split()과 정반대의 개념.
	    arr=animals.split(",");
	    System.out.println(Arrays.toString(arr));
	    String str8=String.join("-",arr);
	    System.out.println("join() "+str8);
	    
	}
}