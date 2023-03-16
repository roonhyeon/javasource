package ch6;

public class Student {
	
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

	public Student(String name, int ban, int num, int kor, int eng, int math) {
		super();
		this.name = name; //this.name: 여기서 말하는 name은 '맨 위에 설정된 String name의 그 name을 말하는 거야!' 라는 의미. 지역변수랑 정확하게 구분하고 싶을 때.
		this.ban = ban;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	
	String info() {
		int sum=kor+eng+math;
		double avg=(kor+eng+math)/3.0;
		
		return name+","+this.ban+","+this.num+","+this.kor+","+this.eng+","+this.math+","+sum+","+avg;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", num=" + num + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	} //객체변수를 찍어내면 주소를 출력하지 말고 걔가 갖고 있는 값을 출력해주세요.
	
	
}

