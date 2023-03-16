package ch5;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx5 {

	public static void main(String[] args) {
		
		int[] numArr= {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < 10; i++) {
			//0~9 사이의 임의의 값 구하기
//			numArr[i]=(int)(Math.random()*10); //내 방식
			int n=(int)(Math.random()*10);
			//구한 자리와 0요소랑 값을 교환하기
			int space=numArr[0]; //numArr[0]의 값을 space 변수에 담기 (항상 오른쪽에 있는 것을 왼쪽에 담아야 함)
			numArr[0]=numArr[n]; //numArr[n]의 값을 numArr[0]에 담기
			numArr[n]=space; //space에 있는 값은 다시 numArr[n]에 담기
		}
		System.out.println(Arrays.toString(numArr));
		
		
		
		
		
		
		
		
		
		

	}
}
