package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			set.add(String.valueOf(i)); //i라는 int 값을 String 값으로 반환해줌. 따라서 여기서 출력된 0,1,2....얘네들은 String이다.
		}
		
		set.add("9"); //이미 9가 있는데 또 9를 추가?? 그러나 출력문에는 9는 하나만 담겨있다. => 중복 불가능(지가 알아서 담지 않았다.)
		
		System.out.println(set);
		
		//for  /  while
		Iterator<String> it=set.iterator(); //접근하는 방법에 대한 통일성 => 어디에 담겨 있든 이 공식을 쓰면 통용된다.
		while (it.hasNext()) { //다음 요소가 존재하지 않으면 false가 되면서 while문 종료
			System.out.println(it.next());
		}
		
	}

}
