package ch5;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int score[]=new int[5]; //배열의 선언과 생성, 아직 값을 할당하지 않음.
		//주소 생성
		
		for (int i = 0; i < score.length; i++) {
			score[i]=i*10;
		} //값이 정해져 있지 않은 i라는 곳의 각각의 공간에 값을 담음.
		
		System.out.println(score); //주소만 산출
		System.out.println(Arrays.toString(score)); //주소에 해당하는 값 확인용
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		} //출력을 통해 입력된 값들 확인
		
		System.out.println();
		for(int i:score) {
			System.out.println(i);
		} //출력을 통해 입력된 값들 확인2(위에 꺼보다 훨씬 더 간단하다.), 향상된 for문
		
		
		
		
		int iArr2[]=new int[10];
		//1~10 사이의 임의의 숫자를 생성해서 배열에 저장
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i]=(int)(Math.random()*10)+1;
		}
		//출력
		System.out.println(Arrays.toString(iArr2));
		
		
		
		
		
		char chArr[]= {'가','나','다','라','마'};
		System.out.println(chArr); //char는 값이 산출되고(예외상황)
		
		String strArr[]= {"abc","efg"};
		System.out.println(strArr); //String은 주소가 산출된다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
