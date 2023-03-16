package ch6;

import java.util.Arrays;

public class TvEx2 {

	public static void main(String[] args) {
		//객체 배열: 많은 수의 객체를 다뤄야 할 때 배열로 처리
		//타입[] 배열명=new 타입[개수];
		int[] arr=new int[3];
		System.out.println(Arrays.toString(arr)); //주소 말고 변수가 갖고 있는 고유의 값 출력해주기 위해 toString 사용
		
		//초기화
		arr[0]=15; //int여서 값을 int로 담음.@
		arr[1]=25;
		arr[2]=35;
		System.out.println(Arrays.toString(arr));
		
		int arr2[]= {45,55,65};
		System.out.println(Arrays.toString(arr2));
		
		//객체배열
		//참조타입[] 배열명=new 타입[개수];
		Tv[] tvArr=new Tv[3]; //tvArr에 Tv를 담을 수 있는 공간 3개가 있다. 객체를 생성하지 않았다. 객체를 다루기 위한 공간만 설정한 것이다.
		System.out.println(tvArr[0]); //null
		System.out.println(tvArr[1]); //null
		System.out.println(tvArr[2]); //null
		
		//초기화
		tvArr[0]=new Tv(); //객체 생성됨. tvArr[] 각 공간에 상응하는 heap에 Tv값이 설정됨. 객체를 생성해주었기 때문에 값도 객체로 받음.@
		tvArr[1]=new Tv();
		tvArr[2]=new Tv();
		System.out.println(tvArr[0].channel); //0
		System.out.println(tvArr[1].channel); //0
		System.out.println(tvArr[2].channel); //0
		
		
		//int arr2[]={25,35,45}
		Tv tvArr2[]= {new Tv(),new Tv(),new Tv()}; //15,25,35에 해당하는 것이 new Tv()이기 때문에 이렇게 써 줄 수도 있다.
		
	}
}
