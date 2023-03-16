package Lang;

public class Person {
	
	long id;

	public Person(long id) {
		super();
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			return this.id==((Person)obj).id; //Value에서 길게 썼던 조건을 한줄로 간단하게 표현
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Person [id=" + id + "]";
	}

}
