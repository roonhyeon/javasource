package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<>();
		
		for (int i = 0; set.size() < 6; i++) { //i값은 의미가 없다. set.size()<6 가 중요하다.
			int num=(int)(Math.random()*45)+1; //로또처럼 중복 숫자 없이 돌리기
			set.add(num); 
		}
		
		System.out.println(set); 
		
//		sort(List<T> list): 가로 안에는 List 인터페이스가 처리할 수 있는 객체가 넘어와야 한다. => ArrayList, LinkedList, Stack, Queue, Vector
//		Collections.sort(set); //그러나 가로 안에 저 객체 중에 없는 set을 넣어주어서 오류남. 
//      set을 list로 변경해주자! 상호 왔다갔다가 가능하다!
		List<Integer> list=new ArrayList<>(set);
		Collections.sort(list);
		System.out.println(list);
	
	}

}
