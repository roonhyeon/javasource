package ch6;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p=new Person(); //Person 인스턴스가 생성됨 => Person을 가지고 있는 인스턴스 변수와 메소드 사용 가능. 다른 클래스에서 부르려면 무조건 new 생성
		p.setName(""); 
		p.print(); //불러낼 때 그냥 print 해주면 안된다. 어떤 것의 print인지 꼭 명시해주어야 한다. p를 print 해준다는 의미.
        //print랑 setName이랑 모두 같은 Person 클래스에 있다.
		
		Person.print2(); //static 클래스에 있는 print2를 불러오는 방법
	}
}
