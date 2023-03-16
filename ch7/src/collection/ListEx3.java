package collection;

import java.util.LinkedList;

//LinkedList

public class ListEx3 {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		
		list.add("사과");
		list.add("자두");
		list.add("수박");
		list.add("딸기");
		list.add("참외");
		list.add("배");
		list.add("메론");
		list.add("바나나");
		
		for (String fruit : list) {
			System.out.println(fruit);
		}
		
	}

}
