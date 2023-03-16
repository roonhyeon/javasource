package ch5;

public class ArrayEx1 {

	public static void main(String[] args) {
		//배열
		int score[]=new int[30]; //배열선언과 생성
	    System.out.println(score[0]); //0~29까지의 인덱스로 접근
		System.out.println(score[15]); 
		
		//새로운 값 할당
		score[0]=98; 
		score[1]=88;
		
		//배열 선언, 생성, 초기화까지 내 마음대로
		//10명에 대한 점수를 배열로 다루기
		int score2[]= {98,88,78,68,50,46,36,29,17,65}; //값이 이미 정해져있다면 간소화
		
		System.out.println("5번째 학생 점수 "+score2[4]);

		double score3[]= {98.1,88.2,78.3,68.4,50.5,46.6,36.7,29.8,17.9,65.0};
//		System.out.println("1번째 학생 점수 "+score3[0]);
//		System.out.println("2번째 학생 점수 "+score3[1]);
//		System.out.println("3번째 학생 점수 "+score3[2]);
//		System.out.println("4번째 학생 점수 "+score3[3]);
//		System.out.println("5번째 학생 점수 "+score3[4]);
//		System.out.println("6번째 학생 점수 "+score3[5]);
//		System.out.println("7번째 학생 점수 "+score3[6]);
//		System.out.println("8번째 학생 점수 "+score3[7]);
//		System.out.println("9번째 학생 점수 "+score3[8]);
//		System.out.println("10번째 학생 점수 "+score3[9]);
		
		System.out.println("score3 길이 "+score3.length); //=10
		
		for (int i = 0; i < score3.length; i++) {
			System.out.println((i+1)+"번째 학생 점수 "+score3[i]);
		}
		
		
		//char 5개를 담는 배열
		char chArr[]= {'가','나','다','라','마'};
		
		//byte, char, short, int, long, float, double, boolean => 배열 타입 가능
		String strArr[]= {"abc","efg"};
		
		System.out.println(strArr[1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
