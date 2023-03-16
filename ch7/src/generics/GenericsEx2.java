package generics;

import java.util.ArrayList;
import java.util.List;

//클래스 파일 하나에 여러 개의 클래스를 작성하는 것이 가능하다.
//단, public 클래스는 하나만 존해해야 한다.
class Product{}
class Tv extends Product{}
class Audio extends Product{}

public class GenericsEx2 {

	public static void main(String[] args) {
		
		ArrayList<Product> productList=new ArrayList<>();
		ArrayList<Tv> tvList=new ArrayList<>();
		//<? extends Product>: Product와 그 자손들만 가능하다.
		ArrayList<? extends Product> tvList2=new ArrayList<>();
		List<Tv> tvList3=new ArrayList<>();
		
		//ArrayList<Product>: ArrayList에 Product 타입만 추가
		//부모-자식 관계의 객체들은 부모타입으로 선언된 상태여도 자식 객체를 담는 것이 가능하다.
		productList.add(new Product());
		productList.add(new Tv());
		productList.add(new Audio());
		
//		tvList.add(new Product()) //자식은 부모를 담을 수 없다.
//		tvList.add(new Audio()) //형제끼리도 담을 수 없다.
		
		printAll(productList);
	
	}
	
	static void printAll(ArrayList<Product> list) { //list라는 변수명은 내 마음대로
		for (Product product : list) {
			System.out.println(product);
		}
	}
	
}
