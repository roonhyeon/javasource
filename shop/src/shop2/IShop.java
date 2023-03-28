package shop2;

//인터페이스는 상수만 가질 수 있고, 모든 메서드는 추상 메서드
public interface IShop {
	//public static abstract 자동으로 앞에 들어가있다.
	void setTitle(String title);
	void genUser();
	void genProduct();
	void start();

}
