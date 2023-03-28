package shop2;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		
//		IShop shop=new MyShop2(); //다형성: MyShop2(자식)에 오버라이딩이 되어있으면 shop(부모)이 MyShop2(자식)에 접근할 수 있게 된다.
		MyShop2 shop=new MyShop2();
		
		//shop 이름 지정
		shop.setTitle("MyShop");
		
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		while(flag) {
			System.out.println("-------------------------");
			System.out.println("1. user 생성");
			System.out.println("2. product 생성");
			System.out.println("3. 상점 open");
			System.out.println("4. 전체 user 조회");
			System.out.println("5. 종료");
			System.out.println("-------------------------");
			
			System.out.print("선택 >> ");
			int no=Integer.parseInt(sc.nextLine());
			
			switch (no) {
			case 1: //user 생성
				shop.genUser();
				break;
			case 2: //product 생성
				shop.genProduct();
				break;
			case 3: //shop 시작
				shop.start();
				break;
			case 4: //user 전체 조회
				shop.userList();
				break;
			case 5: //종료
				flag=false;
				break;
			default:
				break;
			}
		}
		//user 생성
		shop.genUser();
		//product 생성
		shop.genProduct();
		//shop 시작
		shop.start();
	}
	
}
