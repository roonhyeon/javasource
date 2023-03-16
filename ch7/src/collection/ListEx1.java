package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Collection framework: Interface List

public class ListEx1 { 

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>(); //<E>, <T>, <K,V>: 지네릭스(Generics) 개념, '타입을 지정해라' ex) E: element 타입(참조타입만 가능)을 지정해라 => wrapper 타입으로만 담을 수 있다.
		ArrayList<String> list2=new ArrayList<>(); //배열과 다른 점이라면, 배열은 중간에 공간이 막혀 있으면 처리하지 못하지만 ArrayList는 알아서 처리하고 넘어가서 다음 공간에 데이터를 저장한다.
		
		System.out.println("size(): "+list.size()); //=배열의 length()
		System.out.println("isEmpty(): "+list.isEmpty()); //공간이 비어있으면 true 출력

		//공간에 요소를 추가하려면 add() 사용
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
     	list2.add("자바");
		list2.add("html");
		list2.add("css");
		list2.add("script");
		
		System.out.println(list);
		System.out.println(list2);
		
		String fruits[]= {"사과","포도","메론","딸기","바나나"};
		//배열 => 리스트로 변환(추가할 내용이 없다면)
		List<String> list3=Arrays.asList(fruits);
		System.out.println(list3);
		
		//배열 => 리스트로 변환(추가할 내용이 있다면)
		List<String> list4=new ArrayList<>(Arrays.asList(fruits)); //새롭게 ArrayList로 만들어서 바꾸면 된다.
		list4.add("참외");
		System.out.println(list4);
		
		//add(int index, 요소)
		list.add(3,6);
		System.out.println("특정 위치에 추가 후 "+list);
		
		//set()
		list.set(3,7);
		System.out.println("특정 위치에 요소 변경 "+list);
		
		//remove(int index)
		list2.remove(2);
		System.out.println("특정 위치 요소 제거 후 "+list2);
		
		//remove(Object o)
		list4.remove("바나나");
		System.out.println("특정 요소 제거 후 "+list4);
		
		//get(int index)
		System.out.println("특정 위치에 있는 요소 가져오기: "+list2.get(0));
		
		//indexOf(Object o)
		System.out.println("특정 요소의 위치 가져오기 "+list2.indexOf("html"));
		
		//Collections.sort(): 오름차순이 기본, 내림차순을 원할 때는 기준을 제공한다.
		Collections.sort(list4); //return 타입이 void이므로 호출만 한다. 오름차순
		System.out.println("정렬 후 "+list4);
		
		//Comparator.naturalOrder(): 오름차순, Comparator.reverseOrder(): 내림차순
		list.sort(Comparator.reverseOrder()); //내림차순 방법 중 하나
		System.out.println("정렬 후 "+list);
	}

}
