package ch6;

public class StudentEx2 {

	public static void main(String[] args) {
		
		//Student2 객체 배열
		Student2 stuArr[]=new Student2[5];
		
		//기본값 확인: null
		System.out.println(stuArr[0]);
		
		//초기화
		stuArr[0]=new Student2("홍",1,1,45,50,60);
		stuArr[1]=new Student2("길",1,2,25,20,10);
		stuArr[2]=new Student2("동",1,3,35,30,20);
		stuArr[3]=new Student2("까",1,4,55,40,30);
		stuArr[4]=new Student2("꿍",1,5,65,60,40);
		
		//홍 학생의 정보 출력
//		System.out.println("이름: "+stuArr[0].name);
//		System.out.println("반: "+stuArr[0].ban);
//		System.out.println("번호: "+stuArr[0].num);
//		System.out.println("국어: "+stuArr[0].kor);
//		System.out.println("영어: "+stuArr[0].eng);
//		System.out.println("수학: "+stuArr[0].math);
		
		//전체 학생의 정보 출력 by for문
		for (int i = 0; i < stuArr.length; i++) {
			System.out.println("이름: "+stuArr[i].name);
			System.out.println("반: "+stuArr[i].ban);
			System.out.println("번호: "+stuArr[i].num);
			System.out.println("국어: "+stuArr[i].kor);
			System.out.println("영어: "+stuArr[i].eng);
			System.out.println("수학: "+stuArr[i].math);
			System.out.println("총점: "+stuArr[i].getTotal());
			System.out.println("평균: "+stuArr[i].getAverage());
		}
		
		
		
	}
}
