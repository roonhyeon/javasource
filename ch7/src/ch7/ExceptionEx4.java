package ch7;

//런타임 체크 exception: NullPointerException

public class ExceptionEx4 {

	public static void main(String[] args) {
		
		//참조형 초기화
		//null: 아직 값이 할당되지 않았음 
		String data=null; //String data="Hello"; //값을 할당
		Account account=null; //Account account=new Account(); //값을 할당
		int[] arr=null; //int arr[]=new int[5]; //값을 할당
		
		//참조변수의 값 출력
		System.out.println(data);
		System.out.println(account);
		System.out.println(arr);
		
		//java.lang.NullPointerException: 참조변수가 가리키고 있는 곳을 접근하기 시작하면 값을 할당해주지 않았기 때문에 오류가 난다. ex) data 변수 다음에 = 뭘 안해줬구나!
		System.out.println(arr[0]);
		System.out.println(data.length()); //점(.) 찍기 시작하면 접근하는 것
		
		
	}
}
