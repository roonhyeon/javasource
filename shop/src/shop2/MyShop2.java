package shop2;

import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop{
	
	Scanner sc=new Scanner(System.in);
	
	//쇼핑몰 이름
	private String title;
	//user 정보 저장 배열
	UserDTO[] users=new UserDTO[2];
	//product 정보 저장 배열
	Product[] products=new Product[4];
	//구매한 제품을 저장 배열(cart)
	Product carts[]=new Product[10];
	//선택된 user 저장할 변수 선언
	private int selUser;
	
	//UserDAO 객체 생성
	UserDAO userDAO=new UserDAO();
	
	//ProductDAO 객체 생성
	ProductDAO productDAO=new ProductDAO();
	
	@Override
	public void setTitle(String title) {
		this.title=title;
	}

	@Override
	public void genUser() {
		//user 정보를 입력받아서 suser 테이블에 저장
		System.out.println("****** User 입력 ******");
		
		//userId, name, payNo 입력받기
		System.out.println("userId를 입력하세요: ");
		int userId=Integer.parseInt(sc.nextLine());
		System.out.println("name를 입력하세요: ");
		String name=sc.nextLine();
		System.out.println("payNo를 입력하세요: ");
		int payNo=Integer.parseInt(sc.nextLine());
		
		System.out.println(userDAO.insert(userId, name, payNo)?"user 추가 성공":"user 추가 실패");
	}
	
	public void userList() {
		System.out.println("****** User 목록 ******");
		List<UserDTO> list=userDAO.getList();
		
		System.out.println();
		if (list.isEmpty()) {
			System.out.println("user가 존재하지 않습니다.");
		}else {
			System.out.println("userId\tname\tpayNo");
		    System.out.println("=========================");
		    for(UserDTO userDTO:list) {
		    	System.out.print(userDTO.getUserId()+"\t");
			    System.out.print(userDTO.getName()+"\t");
			    System.out.println(userDTO.getPayNo()+"\n");
		   }
		}
	}

	@Override
	public void genProduct() {
		ProductDTO dto=new ProductDTO();
		//상품 정보 입력받아서 테이블에 저장
		System.out.println("****** 상품 입력 ******");
		//상품 정보 입력받기 => ProductDTO에 담기
		System.out.println("productId를 입력하세요: ");
		dto.setProductId(Integer.parseInt(sc.nextLine()));
		System.out.println("pname를 입력하세요: ");
		dto.setPname(sc.nextLine());
		System.out.println("price를 입력하세요: ");
		dto.setPrice(Integer.parseInt(sc.nextLine()));
		System.out.println("content를 입력하세요: ");
		dto.setContent(sc.nextLine());
		System.out.println(productDAO.insert(dto)?"상품 추가 성공":"상품 추가 실패");
	}

	@Override
	public void start() {
		System.out.println(title+" : 메인화면 - 계정 선택");
		System.out.println("====================================");
		for (int i = 0; i < users.length; i++) {
//			System.out.printf("[%d] %s(%s)\n",i,users[i].getName(),users[i].getPayType());
		}
		System.out.println("[X] 종       료");
		System.out.println("선택 : ");
		String sel=sc.nextLine();
		System.out.println("## "+sel+" 선택 ##");
		System.out.println();
		
		//0,1 입력 시=> productList() 호출
		//다른 걸 입력 시 => 메뉴를 확인해주세요 출력
		switch (sel) {
		case "x": case "X": //왼쪽 거나 오른쪽 거 라는 의미
			System.exit(0); //X를 누르면 프로그램 종료
			break;
		case "0": case "1":
			selUser=Integer.parseInt(sel);
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해주세요.\n");
			start();
			break;
		}		
	}
	
	public void productList() {
		System.out.println();
		System.out.println(title+" 상품 목록 - 상품 선택");
		System.out.println("====================================");
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d] ",i);
			products[i].printDetail();
			products[i].printExtra();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.println("선택 : ");
		String sel=sc.nextLine();
		
		//상품 선택 시 0-3 => cart에 제품 추가하고 또 다시 productList() 호출
		//h 입력 시 start 메소드 호출, c일 때는 checkOut() 호출
	    switch (sel) {
		case "h":
			start(); 
			break;
		case "c":
			checkOut();
			break;
		case "0": case "1": case "2": case "3":
			for (int i = 0; i < carts.length; i++) {
				if (carts[i]==null) {
					//Integer.parseInt("0") => 0
					carts[i]=products[Integer.parseInt(sel)]; //장바구니에 물건 하나씩 추가하는 개념보다는 빈 공간 마다(null)에 제품을 하나씩 대입하는 개념
					break;
				}
			}
			productList();
			break;
		default:
			System.out.println("입력값을 확인해주세요.\n");
			productList();
			break;
		}		
	}
	public void checkOut() {
		System.out.println();
		System.out.println(title+": 체크아웃");
		System.out.println("====================================");
	
		int sum=0;
		for (int i = 0; i < carts.length; i++) {
			if (carts[i]!=null) {
				System.out.printf("[%d] %s(%d)\n",i,carts[i].getName(),carts[i].getPrice()); //상품목록 출력
				sum+=carts[i].getPrice();
			}
		}
		
		System.out.println("====================================");
//		System.out.println("결제방법: "+users[selUser].getPayType()); //제일 상위 메소드에 새롭게 변수 선언하고 start 메소드에 정의해서 불러온다.
		System.out.println("결제금액: "+sum);
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.println("선택 : ");
		String sel=sc.nextLine();
		
		//p일 때 productList 호출
		//q일 때 결제가 완료되었습니다. 프로그램 종료
		switch (sel) {
		case "q": case "Q":
			System.out.println("결제가 완료되었습니다.");
			System.exit(0);
			break;
		case "p": case "P":
			productList();
			break;
		default:
			checkOut();
			break;
		}
	
	}
}
