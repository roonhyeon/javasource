package ch5;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEx9 {

	public static void main(String[] args) {
		
		int score[][]= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}

		};
		
		//과목별 총점
		int korTotal=0, engTotal=0, mathTotal=0;
	    
	    System.out.println("번호     국어      영어      수학     총점     평균");
	    System.out.println("==============================================");
	    
	   
	    for (int i = 0; i < score.length; i++) {
	    	
	    	System.out.printf("%3d",i+1); //번호
	    	
	    	int sum=0; 
	    	for (int j = 0; j < score[i].length; j++) {
	    		sum+=score[i][j]; //개인별 총점
				
	    		System.out.printf("%8d",score[i][j]);
			} //과목별 점수
	    	
	    	//국어점수 총점
	        //score[0][0]+score[1][0]+score[2][0]+score[3][0]+score[4][0]; //각각 100,20,30,40,50
			korTotal+=score[i][0];
			
	    	//영어점수 총점
	        //score[0][1]+score[1]{1]+score[2][1]+score[3][1]+score[4][1]; 
	        engTotal+=score[i][1];
			
	    	
	    	//수학점수 총점
	        //score[0][2]+score[1][2]+score[2][2]+score[3][2]+score[4][2]; 
	    	mathTotal+=score[i][2];
	    	
	    	
	    	float avg=sum/(float)score[i].length; //개인별 평균=sum/3.0
	    	
	    	System.out.printf("%8d %8.1f\n",sum,avg); //개인별 총점과 개인별 평균 산출
	    } 	
	    	
	    	
	    System.out.println("=================================");	
	    System.out.printf("총점: %3d %4d %4d\n",korTotal,engTotal,mathTotal); 	
	    
	
	
	
		
		
		
	}
}
