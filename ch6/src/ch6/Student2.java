package ch6;

public class Student2 {
	
	//학생이름 name ex)홍길동
	String name;
	//반 ban ex)1
	int ban;
	//번호 num ex)1
    int num;
	//국어점수 kor ex)78
	int kor;
	//영어점수 eng ex)65
	int eng;
	//수학점수 math ex)89
	int math;

	public Student2(String name, int ban, int num, int kor, int eng, int math) {
		super();
		this.name = name; //this.name: 여기서 말하는 name은 '맨 위에 설정된 String name의 그 name을 말하는 거야!' 라는 의미. 지역변수랑 정확하게 구분하고 싶을 때.
		this.ban = ban;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		//점수총계
		return kor+eng+math;
	}
	
	double getAverage(){
		//평균
		return getTotal()/3.0;
	} //방식2

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", ban=" + ban + ", num=" + num + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
//	String info() {
//		int sum=kor+eng+math;
//		double avg=(kor+eng+math)/3.0;
//		
//		return name+","+this.ban+","+this.num+","+this.kor+","+this.eng+","+this.math+","+sum+","+avg;
//	} //방식1
	
}

