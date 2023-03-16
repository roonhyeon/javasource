package generics;

//지네릭스 선언 후

public class Box2<T> { //generics
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
