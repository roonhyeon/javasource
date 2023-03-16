package ch2;

public class OperatorEx1 {

	public static void main(String[] args) {
//		int i=5;
//		i++; //i=i+1;
//		System.out.println(i);
//
//		i=5;
//		++i;
//		System.out.println(i);
		
		
		int i=5, j=0;
		j=i++; //1) j=i; 2) i=i+1; 우선순위로 인해 대입연산자=부터 실행된다.
		System.out.println("j=i++실행 후 i="+i+", j="+j);
		
		
		i=5;
		j=0;
		j=++i; //2) j=i; 1) i=i+1;
		System.out.println("j=i++실행 후 i="+i+", j="+j);
				
		
		
		boolean play=true;
		System.out.println("play="+play);
		System.out.println("!play="+!play);
		
		
		
		
		
	}

}
