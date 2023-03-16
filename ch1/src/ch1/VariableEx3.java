package ch1;

//주석 : 상세설명

/*변수명
 * 대소문자 구별, 길이에 제한 없음
 * 예약어 사용 불가  ex)int true; int short;
 * 숫자로 시작하면 안 됨   ex) int 7d;
 * 특수문자는 _, $ 만 허용됨
 * 변수의 첫글자는 항상 소문자로 입력   ex)int, boolean, ...etc
 * 여러 단어로 이루어진 이름은 단어의 첫글자를 대문자로 입력   ex)lastIndexOf
 * 
 */

public class VariableEx3 {

	public static void main(String[] args) {
	// 기본타입 (소문자로 시작)  -- 참조타입 등 기본 외 타입은 전부 대문자로 시작
	 		// 문자 char
	 		// 숫자 byte, short, int, long -- float, double
	 		// 논리 boolean
	 			    
	 	    //두 변수의 값 교환
	 		int x=10, y=20;
	 		
	 		// 빈 공간 작성 
	 		int temp=0;
	 				
	 		// 둘 중 하나의 값 옮기기 
	 		temp=x;   // x의 값을 temp라는 공간에 담아둔다는 의미
	 		
	 		// 나머지 값 옮기기
	 		x=y;
	 		y=temp;
	 		
	 		// 출력
	 		System.out.println("x = "+ x + ", y = "+y);
	 		
	 		// 풀어쓰면 아래와 같다
	 		System.out.print("x = " + x);
	 		System.out.println(", y = " +y);

	 		
	 		
	 		
	 			}

	 		}


