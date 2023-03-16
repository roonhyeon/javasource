package ch1;

//변수의 종류
//지역변수, 인스턴스 변수, 
//모든 변수는 유효 범위를 갖는다

public class VariableEx9 {
	public static void main(String[] args) {
     int i =4;
     System.out.println(i);
     //메인 메소드 중괄호 범위 안에서만 유효함
     {
    	 int j =4;
    	 System.out.println(j);
    	 
    	 //메인 메소드 안에 있는 다른 중괄호 범위 안에서만 유효함
     }
   
   
	 			}

	 		}


