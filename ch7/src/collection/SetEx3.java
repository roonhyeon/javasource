package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		
		//Person 객체를 Set 구조에 담기
		Set<Person> set=new HashSet<>(); //뒤에 <> 칸은 생략 가능
		
		set.add(new Person("David", 10)); //사용자 정의 객체에 대한 중복된 내용은 걸러지지 못하고 중복 저장이 된다. 그래서 허용하지 않으려면 약간의 장치가 필요하다.
		set.add(new Person("David", 10));
		
		System.out.println(set);
	
	}

}