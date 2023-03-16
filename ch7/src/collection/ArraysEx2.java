package collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {

	public static void main(String[] args) {
		
		int arr[]= {37,21,56,99,88,58,62,15,39,78};
		String strArr[]={"cat","Dog","lion","tiger","","78"};
		
		//오름차순 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//사전 순으로 정렬(공백, 숫자, 대문자, 소문자 순으로 정렬된다.)
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		//내림차순 정렬
		//sort(T a[], Comparator<? super T> c)
		Arrays.sort(strArr, new DescComp());
		Arrays.sort(strArr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
//		Arrays.sort(arr,Comparator.reverseOrder()); //오류 남: 맨 위의 arr[]을 기본타입인 int가 아니라 Integer로 바꿔주어야 한다.
		
		

	}

}

//정렬 기준을 내 마음대로 새로 작성하고 싶을 때 이렇게 설정해주면 된다.(Comparator<? super T> c: Comparator를 구현한 특정 기준이 들어오면 됩니다.)
class DescComp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2)*-1;
	}
	
}