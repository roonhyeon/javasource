package Lang;

public class Value { //자식 클래스
	
	int value;

	public Value(int value) {
		super();
		this.value = value;
	}
	
	//Object가 equals()를 주소 비교로 넘겨줬기 때문에 equals를 계속 쓰면서도 값 비교로 바꾸고 싶은 상황 => 오버라이드
	@Override
		public boolean equals(Object obj) { 
		    //Object 타입의 obj를 Value 타입으로 형변환할 수 있는지 여부를 확인하는 연산
		    if (obj instanceof Value) { //instanceof: 특정 객체의 인스턴스인지 확인하는 것 => obj가 Value 객체의 인스턴스냐?
		    	Value v=(Value) obj; //Object 타입의 obj를 Value 타입으로 형변환한다. Value v=obj
				
		    	if (this.value==v.value) { //10==10 ?? //여기까지 한줄로 return this.value == ((Value)obj).value;
					return true; 
				}
			}
			return false;
		}
	
	//toString (): Object는 패키지명.클래스명@hasCode값으로 나오지만, 자손 toString(): 인스턴스에 대한 정보(멤버변수에 할당된 값)를 문자열로 제공하는 목적으로 사용한다.
	//따라서 toString은 꼭 오버라이딩을 해준다.
	@Override
	public String toString() { //String으로 넘겨주기만 하면 된다.
		return "Value [value=" + value + "]";
	}
	
	
	
	
}
