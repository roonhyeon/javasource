package ch1;

//주석 : 상세설명

/* 리터럴
 * 대입되는 값(상수)
 * 
 * 정수형 : long
 * 
 * 
 */

public class VariableEx4 {

	public static void main(String[] args) {
		
	// 접미사 : l, f, d, ...
	 long big = 100_000_000_000L;  // l은 접미사로 필수 (_는 콤마 개념)
	 float f = 0.14159f;
	 double d = 0.141592d;  // d는 필수 아님
	 		
	 		
	 // 접두사 : 0(8진수), 0x(16진수), 0b(2진수)  -- 잘 쓰는 일은 없겠지만 이런 접미사도 있다는 점 알아두기*
	 int octNum = 010;  //8진수 10 ==> 10진수로 출력
	 int hexNum = 0x10;  //16진수 10
	 int binNum = 0b10;  //2진수 10
	 System.out.println(octNum);
	 System.out.println(hexNum);
	 System.out.println(binNum);
	 
	 
	 // 타입이 달라도 저장범위가 넓은 타입에 좁은 타입의 값을 저장하는 것은 허용됨(크기)
	 // 'A' " 2byte  --문자는 2byte임
	 // int : 4byte
	 int i = 'A';
	 System.out.println(i);
	 
	 
	 // "" : 문자열
	 // String : **참조타입(not 기본타입)
	 String name = "hong";
	 
	 // 1) name 값 가져오기
	 // 2) 문자 77을 연결하기
	 // 3) 연결한 값을 name 에 담기
	 name = name + " 77";
	 System.out.println(name);
	 
	 
	 String num = 7+7+"7";  // 7+7(연산) + (연결)"7"이므로 14+7 = 147이 나옴
	 System.out.println(num);
	 
	 
	 //printf() : 형식화된 출력, enter 없음(그래서 뒤에 \n을 입력해야 함)
	 // %d : 10진 정수의 형식 출력
	 // %c : 문자
	 // %s : 문자열
	 // %f : 부동소수점(실수)
	 int age = 25;
	 System.out.println("age="+age);
	 System.out.printf("age=%d\n",age);  // 정수가 들어갈 자리에 %d로 잡아두는 방법(\n을 붙여서 줄나눔)
	 
	 char ch1='a';  //문자 %c
	 String str1 = "abcd";  // 문자열 %s
	 double d1 = 3.141592;  // 부동소수점  %f
	 System.out.printf("ch1=%c\n", ch1);  // \n을 입력해서 줄 나눔 효과 부여
	 System.out.printf("str1=%s\n", str1);
	 System.out.printf("str1=%10s\n", str1);  // 우측 정렬로 좌측에 빈칸 10 부여
	 System.out.printf("str1=%-10s\n", str1); // 좌측 정렬로 우측에 빈칸 10 부여
	 
	 // println으로는 소숫점 자리 지정을 못하지만 printf로는 가능하다.
	 System.out.printf("d1=%10.3f\n", d1);  // % 뒤에 .3을 넣으면 소숫점 3자리까지만 표시됨
	
	 
	 
	 
	 
	 
	 			}

	 		}


