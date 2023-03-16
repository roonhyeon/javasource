package ch6;

import java.util.Scanner;

public class CarEx4 {

	public static void main(String[] args) {
		
		//입력받은 값으로 Car3 인스턴스 생성
		Scanner sc =new Scanner(System.in);
		
		//입력
//		System.out.println("회사명 >> ");
//		String company=sc.nextLine();
//		System.out.println("모델명 >> ");
//		String model=sc.nextLine();
//		System.out.println("색상명 >> ");
//		String color=sc.nextLine();
//		System.out.println("최대속소 >> ");
//		int maxSpeed=Integer.parseInt(sc.nextLine());
//		
//		//입력 값으로 인스턴스 생성
//		Car3 car=new Car3(company,model,color,maxSpeed);
//		//확인용
//		System.out.println(car);
		
		
		//입력 값으로 Car3 인스턴스 3개 생성
		Car3 ccc[]=new Car3[3];
		//초기화 by 입력 값
		for (int i = 0; i < ccc.length; i++) {
			System.out.println("회사명 >> ");
			String company=sc.nextLine();
			System.out.println("모델명 >> ");
			String model=sc.nextLine();
			System.out.println("색상명 >> ");
			String color=sc.nextLine();
			System.out.println("최대속소 >> ");
			int maxSpeed=Integer.parseInt(sc.nextLine());
			//입력 값으로 인스턴스 생성
			ccc[i]=new Car3(company,model,color,maxSpeed);
		}
		
		//확인용
//		for (int i = 0; i < ccc.length; i++) {
//			System.out.println(ccc[i]);
//      }
		
		//확인용 향상된 for문
	    for(Car3 car:ccc) {
	    System.out.println(car);		
	}
}
}
