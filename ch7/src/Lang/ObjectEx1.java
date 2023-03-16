package Lang;

public class ObjectEx1 {

	public static void main(String[] args) {
		//equals(): 
		
		Object obj1=new Object();
		Object obj2=new Object();
		
		//equals(): obj1와 obj2가 같은 객체냐?
		if(obj1.equals(obj2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		System.out.println(obj1==obj2 ? "같음":"다름"); //각각의 stack에 각각의 주소로 저장된 0X100과 0X200이 같니?
		
		//Object의 toString 메소드
		System.out.println("obj1 toString"+obj1.toString()); //java.lang.Object@4926097b: 패키지명.클래스명@숫자
		System.out.println("obj2 toString"+obj2.toString()); //java.lang.Object@762efe5d
		
		//Value의 부모: 말 안해도 Object 클래스
		Value v1=new Value(10); //각각의 stack에서 나온 각각의 heap에 10이 각각 저장되었지만, equals로 비교하는 것은 역시 부모가 넘겨준 주소 비교다: 0X100과 0X200이 같니?
		Value v2=new Value(10);
		System.out.println(v1.equals(v2) ? "v1==v2 같음":"v1!=v2 다름"); //equals를 실행하면 boolean equals(Object obj) 호출 => Object obj=v2
		System.out.println("v1 toString "+v1.toString()); //Lang.Value@41a4555e: Object가 toString을 어떻게 만들어주었나 알려줌
		
		//equals를 했을 때 부모가 넘겨준 주소 비교가 아니라 Value 값을 비교하고 싶으면 오버라이딩(부모 메소드를 자식 메소드에서 재정의)을 한다.
		
		
		
		Person p1=new Person(80110581222L);
		Person p2=new Person(80110581222L);
		System.out.println(p1.equals(p2) ? "p1과 p2는 같은 사람":"p1과 p2는 다른 사람"); //역시나 equals는 Object가 넘겨주었다. 그리고 주소 비교로 넘겨주었다.
	    
		//toString이 오버라이딩 되어 있다면 참조변수명만 사용해도 된다.
		System.out.println(p1); //p1==p1.toString()
	    System.out.println(p1.toString());
	    
	    
	    
	    Card card1=new Card();
	    Card card2=new Card("HEART",10);	
	    System.out.println(card1);
	    System.out.println(card2);
	}

}
