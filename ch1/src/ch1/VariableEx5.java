package ch1;

import java.util.Scanner;

/*키보드에서 입력받기
 * 
 */

public class VariableEx5 {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 // System.in : 키보드
	 // sc.nextLine() : 문자로 인식(입력) 받기 = 쌍따옴표와 동일
	 // Integer.parseInt() : 괄호 안에 들어있는 문자 숫자를 숫자로 변환 : 문자열을 숫자로 변환  // integer : 정수
	 // paseInt() : 문자/문자열을 분석하여 그 안에 있는 '숫자'를 숫자(number)로 변환
	 // Integer.parseInt("78") : 78
	 
	 // int num = Integer.parseInt(sc.nextLine());
	 // 아래와 같이 풀어 적을 수 있다
	 
	 System.out.print("두자리 정수를 입력해 주세요 ");
	 String input = sc.nextLine();
	 int num = Integer.parseInt(input);
	 
	 System.out.printf("입력숫자 : %d",num);
	 
	 
	
	 
	
	 
	 
	 			}

	 		}


