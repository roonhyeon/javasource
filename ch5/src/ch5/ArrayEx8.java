package ch5;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx8 {

	public static void main(String[] args) {
		
		//2차원 배열. if도 중첩(이중)으로 돌려야 한다.
		int [][] score=new int [4][3]; //4행 3열짜리 배열
		int[] score2[]=new int [2][3]; //2행 3열
		int score3[][]=new int [5][2]; //5행 2열
		
		//[행번호][열번호]
		System.out.println(score2[0][0]);
		System.out.println(score2[1][2]);
		
		//2차원 길이=행 길이
		System.out.println("행 길이 "+score2.length);
		System.out.println("열 길이 "+score2[0].length);
		
		
		for (int i = 0; i < score2.length; i++) {
			for (int j = 0; j < score2[i].length; j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.println();	
		}
		
		
		//<여기서부터 위에 꺼 간단화 단계>
	    //2차원 배열 선언, 생성, 초기화까지 한번에-!
	    int[] score4[]= {
	    		{10,11,12},
	    		{20,21,22}
	    }; //투입할 값이 이미 정해져 있다면 {}를 사용하여 값을 직접 넣어주면 된다.
	    
	    //향상된 for 2차원 배열 접근
	    for (int arr[]:score4) {
			for(int j:arr) { //10,11,12를 가지고 돌리겠다. 다 돌리면 그 다름에는 20,21,22를 가지고 돌리겠다.
				System.out.printf("%d\t",j); //알아서 하나씩 꺼내서 입력된다.
			}
			System.out.println(); //enter
		}
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	
		
		
		
	}
}
