package ch6;

public class StudentEx {

	public static void main(String[] args) {
		Student stu=new Student("홍길동",1,1,100,60,79);
		
		String msg=stu.info(); //stu.info를 String으로 실행해주세요.
		System.out.println(msg);
		//msg 출력 시: 홍길동,1,1,100,60,79,점수합계,평균
		System.out.println(stu); //stu는 어떤 특정한 heap 메모리 공간의 주소를 나타낸다. 그 주소가 출력된다.
		
		//Student2 객체 생성
		System.out.println();
		Student2 stu2=new Student2("성춘향",2,1,78,89,90);
		System.out.println("이름: "+stu2.name);
		System.out.println("총점: "+stu2.getTotal());
		System.out.println("평균: "+stu2.getAverage());
		//총점:236
		//평균:78.xxxx
		System.out.println(stu2);

	}
}
