package ch5;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx6 {

	public static void main(String[] args) {
		
		//로또번호
		int[] ball=new int[45];
		
		for (int i = 0; i < ball.length; i++) {
			ball[i]=i+1;
		}
		
		System.out.println(Arrays.toString(ball));
		
		
		for (int i = 0; i < 6; i++) {
			//0~44 범위의 임의의 값 얻기
			int n=(int)(Math.random()*45);
			//앞 자리 6개와 교환
			int space= ball[i];
			ball[i]=ball[n];
			ball[n]=space;
		}
	    
	    //앞 자리 6개 출력
	    for (int i = 0; i < 6; i++) {
	    	System.out.println(ball[i]+" ");
	    }
	    		
		
		
		

	}
}
