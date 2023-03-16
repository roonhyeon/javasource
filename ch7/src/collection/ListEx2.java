package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx2 {

	public static void main(String[] args) {
		
		//ArrayList에 Member1 객체를 추가해보자
		ArrayList<Member1> list=new ArrayList<>(); //<>: 담고자 하는 클래스명을 넣으면 된다.
		
		list.add(new Member1("홍길동")); //배열과 비슷하다. members[0]=new Member1("");
		list.add(new Member1("전우치"));
		list.add(new Member1("원빈"));
		list.add(new Member1("현빈"));
		
		//배열이었다면?
		//Member1[] members=new Member1[10];
		//members[0]=new Member1("");
		
		System.out.println(list);
		
		//Member2를 담는 ArrayList 생성
		ArrayList<Member2> list2=new ArrayList<>();
		list2.add(new Member2("홍길동","hong", "123"));
		list2.add(new Member2("전우치","dosa", "456"));
		list2.add(new Member2("원빈","one", "789"));
		list2.add(new Member2("현빈","bean", "012"));
		
		System.out.println(list2); //오버라이딩된 toString() 출력됨 ==> 리스트에 요소가 잘 담겼는지 확인용
		System.out.println("size() "+list2.size());
		
		for (int i = 0; i < list2.size(); i++) { //리스트에 맞춘 조건
			Member2 member=list2.get(i); 
			System.out.println("id: "+member.getId()+", password: "+member.getPassword()+", name: "+member.getName());
		}
		
		//Interface Iterator: List, Set, Map 구조에서 요소에 접근하는 방법에 대한 통일성을 제공한다.(어떤 인터페이스에서든 쓸 수 있도록 표준화)
		//hasNext(): 다음 요소가 존재하는 경우 true 존재하지 않으면 false
		//Iterator iterator = list2.iterator( ); : 초기화
		//iterator.hasNext( ); : 조건
		//next( ): Member2의 다음 요소 가져오기
		System.out.println();
		System.out.println("id    password  name");
		System.out.println("=====================");
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
			Member2 member2 = (Member2) iterator.next();
			System.out.println(member2.getId()+"\t"+member2.getPassword()+"\t"+member2.getName());
		}
		
		System.out.println();
		for (Member2 member2 : list2) { //이게 더 간단해서 이걸 제일 많이 쓴다.
			System.out.println(member2.getId()+"\t"+member2.getPassword()+"\t"+member2.getName());
		}
		
    }

}
