package ch1;

// 형변환  : 강제형변환(큰 값>작은 타입=casting) / 자동형변환(작은 값>큰 타입=promotion)
// boolean 을 제외한 나머지 7개 기본타입은 서로 형변환 가능
// 정수형 ==> 실수형 변환
// 실수형 ==> 정수형 변환
// **type 크기 순서 : byte => short, char => int => long => float => double

public class VariableEx8 {
	public static void main(String[] args) {
	
   int i = 91234567;
   float f = (float)i;
   // 큰 타입을 작은 타입에 담는 경우 -> 오류 발생  ex)int i2 = f;
   // 변경 타입을 앞에 꼭 괄호로 표기해야 한다. = casting --> *손실의 위험성 존재
   int i2 = (int)f;
   System.out.printf("i=%d\n",i);
   System.out.printf("f=%f\ni2=%d\n",f, i2);   //큰 값을 작은 타입에 담아서 값이 일부 손실됨(끝자리)=명확한 값이 출력되지 않는다.
	
   //자동형변환 : 변경타입 기재 생략 가능
   byte byteValue = 10;
   int intVal = byteValue;
   System.out.printf("intVal = %d\n", intVal);
   
   char charVal = 'a';
   intVal = charVal;
   System.out.printf("intVal = %d\n", intVal);
   System.out.printf("charVal = %c\n", charVal);
		 
   double d = 5.5;
   double result = intVal + d;
   System.out.printf("result=%f\n", result);
   
   // \n : enter
   // \t : tap
   // \\ : reversed slash
   System.out.println("abc\tdef");
   System.out.println("abc\\def");
   System.out.println("c:\\");
   
   
   
	 			}

	 		}


