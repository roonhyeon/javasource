package ch5;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		int score[]= {100, 88, 100, 100, 90}; // int[] score도 되고 int score[]도 된다.
		
		//배열의 총합과 평균
		int sum=0;
		float average=0f;
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		//
	    average=sum/(float)score.length; //단순히 95점에서만 끝나는 것이 아니라 .6까지 더해주기 위해서 float를 사용
		
	    System.out.println("총합: "+sum);
		System.out.println("평균: "+average);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
