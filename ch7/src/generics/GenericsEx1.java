package generics;

import java.util.ArrayList;

public class GenericsEx1 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>(); //ArrayList 안에는 String 타입만 추가할 수 있다는 의미.
		list.add("1"); //그래서 String이 아닌 것은 입력할 수도 없다.
		
		
		Box1 box1=new Box1();
		
		box1.setItem("홍길동");
		String item=(String) box1.getItem(); //Object를 String으로 형변환.
		System.out.println(item);
		
		box1.setItem(1);
		Integer i=(Integer) box1.getItem(); //Object를 Integer로 형변환.
		System.out.println(i);
		
		
		//이렇듯 일일이 형변환해주는 불편함을 피하기 위해 generics를 사용해준다.
		Box2<String> box2=new Box2<>(); //String 담을 꺼라고 아예 처음부터 선언
		box2.setItem("성춘향");
		item=box2.getItem(); //이제는 더 이상 형변환을 해주지 않아도 오류가 나지 않는다.
		System.out.println("generics 적용 후 "+item);
		
		Box2<Integer> box3=new Box2<>();
		box3.setItem(23);
		i=box3.getItem();
		System.out.println("generics 적용 후 "+i);
	
	}

}
