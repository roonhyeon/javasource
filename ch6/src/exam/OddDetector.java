package exam;

public abstract class OddDetector {
	
	private int n; //멤버변수
	
	public OddDetector(int n) {
		super();
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
	
	public abstract boolean isOdd(); //추상메소드

}
