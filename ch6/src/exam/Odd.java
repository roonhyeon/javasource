package exam;

public class Odd extends OddDetector {
	
	public Odd(int n) {
		super(n);
	}

	@Override
	public boolean isOdd() {
		if (getN()%2!=0) {
			return true;
		}
		return false;
	}

}
