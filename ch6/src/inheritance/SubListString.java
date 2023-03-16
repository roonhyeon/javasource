package inheritance;

public class SubListString extends ListString {
	
	String name="전우치";
	
	@Override //오버라이딩
	public void list() {
		super.list(); //부모의 list 호출 가능
		System.out.println(name+"하위 클래스 이름"); //부모 꺼에서 내가 원하는 기능 추가	
	}
	
	public void writer() {
		System.out.println("하위 클래스 name 값"+name);
		System.out.println("상위 클래스 name 값"+super.name);
	    //list() 호출: SubListString, ListString
		list(); //=this.list();
		super.list(); //필요시 부모 메소드 호출
	} 	
}
