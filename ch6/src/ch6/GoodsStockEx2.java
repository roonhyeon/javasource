package ch6;

import java.util.Scanner;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		
		// 입력값으로 GoodsStock 인스턴스 생성
		Scanner sc=new Scanner(System.in);
		
		//입력
//		System.out.println("상품코드: ");
//		String code=sc.nextLine();
//		System.out.println("재고수량: ");
//		int stockNum=Integer.parseInt(sc.nextLine());
//		
//		GoodsStock gs=new GoodsStock(code,stockNum);
//		System.out.println(gs);
		
		
		//3개의 상품에 대해서 인스턴스를 생성??
		GoodsStock gss[]=new GoodsStock[3];
//		gss[0]=new GoodsStock("0111",100);
//		gss[1]=new GoodsStock("0112",200);
//		gss[2]=new GoodsStock("0113",300);
		
		//위 세 줄의 코드를 하나의 입력값으로 변경하고 싶다.
		for (int i = 0; i < gss.length; i++) {
			System.out.println("상품코드: ");
			String code=sc.nextLine();
			System.out.println("재고수량: ");
			int stockNum=Integer.parseInt(sc.nextLine());
			gss[i]=new GoodsStock(code, stockNum);
			System.out.println("-----------------------------------");
		}
		
//		//확인용
//		for (int i = 0; i < gss.length; i++) {
//			System.out.println(gss[i]);
//		}
		
		//향상된 for문
		for(GoodsStock goods:gss) {
			System.out.println(goods);
		}
	}
}