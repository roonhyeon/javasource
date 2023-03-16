package generics;

class Fruit{
	@Override
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	@Override
	public String toString() {
		return "Grape";
	}
}
class Toy{
	@Override
	public String toString() {
		return "Toy";
	}
}

//T extends Fruit: Fruit의 자손만 타입으로 FruitBox에 담을 수 있다. T 타입에 제한을 두고 싶다.
class FruitBox<T extends Fruit> extends Box3<T>{}


public class GenericsEx4 {

	public static void main(String[] args) {
		
		FruitBox<Fruit> fruitBox=new FruitBox<>();
		FruitBox<Apple> appleBox=new FruitBox<>();
		FruitBox<Grape> grapeBox=new FruitBox<>();
//		FruitBox<Toy> toyBox=new FruitBox<>(); //Fruit를 상속받지 않았으니, Toy는 들어올 수 없다.
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
		
	}

}
