package inheritance.code;

import modifier.Account;

//패키지가 다른 경우

//패키지가 같은 경우

public class Modifier1 {
//	String str=new String("Hello"); //탐조타입의 기본값은 null로 세팅된다.
//	String str="Hello";
	Account acc=new Account();
	
	int age;
	
	private void print() {
		System.out.println(acc.getAno());
//		System.out.println(str.length());
		System.out.println(age);
		
		//Account가 가지고 있는 ano에 접근하고 싶다면?
		String ano=acc.getAno();
		System.out.println("ano: "+ano);
		
		acc.setAno("111-22");
		System.out.println("ano: "+acc.getAno());
	}
	
	public static void main(String[] args) {
		//static 메소드에서 non-static 메소드 호출하기
		//1. 같은 static으로 만들기
		//2. 객체 생성 후 접근
		Modifier1 modifier1=new Modifier1();
		modifier1.print();
	} 

}
