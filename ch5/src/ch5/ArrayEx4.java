package ch5;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		int score[]= {79,88,91,33,100,55,95};
		//최대값과 최소값 구하기
		int max=score[0]; //max 변수 안에 이미 79를 담고 시작한다. 
		int min=score[0]; //min 변수 안에 이미 79를 담고 시작한다.
		 
		for (int i = 1; i < score.length; i++) {
			
			if (max>score[i]) continue;
			max=score[i]; 
			
			//if(score[i]>max) {
			    //max=score[i];
			//}else if (score[i]<min) {
			    //min=score[i]
			//}
		}
		System.out.println("최대값: "+max);
		
		for (int i = 1; i < score.length; i++) {
			if (min<score[i]) continue;
		    min=score[i];
		}
		System.out.println("최소값: "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
