package ch5;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx7 {

	public static void main(String[] args) {
		
		System.out.println(args[0]); //run-configurations-argument에서 abc 123을 작성해주고 run. => abc 산출
		
		//int ball[]=new int[45]; 와 같은 구조
		String name[]=new String[3];
	    		
//		System.out.println(name[0]); //null
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		} //null, null, null
		
		//초기화
		name[0]="Kim";
		name[1]="Park";
		name[2]="Lee";
		
		System.out.println(name[0]);
		System.out.println(name[0].charAt(1));
	
		
        String str="ABCDE";
        
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        
        //문자열(String) 비교 시에는 ==을 사용하지 않는다.
	    System.out.println(str.equals("abcde"));
	    System.out.println(str.equalsIgnoreCase("abcde"));
	
	    System.out.println(str.equals("abcde")?"일치함":"일치하지 않음");
	
	    if(str.equals("abcde")) {
	    	System.out.println("일치함");
	    }else {
			System.out.println("일치하지 않음");
		}
	    
	    
	    
	}
	
}
