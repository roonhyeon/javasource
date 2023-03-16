package exam;

public abstract class Calc {
	
	int a,b;
	
	abstract int calculate();
	
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
}
