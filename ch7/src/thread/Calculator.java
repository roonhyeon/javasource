package thread;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { 
		this.memory = memory;
		
		try {
			Thread.sleep(2000); //setMemory 담고 2초 잠
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
	
}
