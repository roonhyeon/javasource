package thread;

import java.util.Iterator;

public class NumPrint implements Runnable{
	
	@Override
	public void run() {
		
		for (int i = 1; i < 6; i++) {
			System.out.print(i);
		}
		
	}

}
