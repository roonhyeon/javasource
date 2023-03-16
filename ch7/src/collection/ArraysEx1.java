package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Arrays 클래스

public class ArraysEx1 {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		//toString
		System.out.println(arr); //주소 출력
		System.out.println(Arrays.toString(arr)); //값 출력
		
		
		int arr2[][]= {{11,12},{21,22}};

		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2)); //이번에는 얘도 주소 출력
		
		System.out.println(Arrays.deepToString(arr2)); //[[11,12],[21,22]]
		
		//equals()
		String[] str1= {"aaa","bbb"};
		String[] str2= {"AAA","BBB"};
		System.out.println(Arrays.equals(str1, str2));
		
		
		String[][] str2D= {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2= {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int arr3[]=new int[5];
		//arr 배열을 arr3로 복사하고 싶다.
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
		
        System.out.println(Arrays.toString(arr3));
		
        //copyOf(원본 배열, 복사할 요소의 개수), copyOfRange()
        int arr4[]=Arrays.copyOf(arr, arr.length); //난 5개 다 복사할거야!
        System.out.println(Arrays.toString(arr4));
        
        int arr5[]=Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(arr5));
        
        int arr6[]=Arrays.copyOfRange(arr, 2, 4); //4는 포함하지 않는다.
        System.out.println(Arrays.toString(arr6));
        
        //fill(): 5로만 배열 5칸을 채우기.
        int arr7[]=new int[5];
        Arrays.fill(arr7,5); //리턴 타입: void, 리턴값 없음, 메소드 호출만 함.
        System.out.println("arr7 "+Arrays.toString(arr7));
        
        //sort(): 오름차순 정렬
        int arr8[]= {3,2,0,1,4};
        Arrays.sort(arr8);
        System.out.println("arr8 "+Arrays.toString(arr8));
        
        //binarySearch(): 이진검색, 정렬 우선 필수
        System.out.println(Arrays.binarySearch(arr8, 4));
        System.out.println(Arrays.binarySearch(arr8, 5));
        
        //asList(): 배열을 List로 변환해준다.
//      List<Integer> list= Arrays.asList(arr8); //오류 난다.
        List<Integer> list= Arrays.asList(1,2,3,4,6,8);
        
        Integer[] arr9={15,16,17,18};
        List<Integer> list2=Arrays.asList(arr9); //참조 타입으로 arr9를 선언해주면 오류가 나지 않는다.
        System.out.println(list);
//      list.add(19);
        //list 크기 변경을 원한다면 add만 쓰지 말고 새로 생성한 다음 추가. => ListEx1 참고
        list=new ArrayList<>(Arrays.asList(arr9));
        
	}

}
