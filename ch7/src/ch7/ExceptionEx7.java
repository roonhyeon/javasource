package ch7;

public class ExceptionEx7 {

	public static void main(String[] args) {
				
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException | MemoryException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			deleteTempFiles();
		}

	}
	
	static void startInstall() throws SpaceException, MemoryException { //날리기
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다."); //Exception을 상속받았기 때문에 날리기 안하면 오류가 뜬다.
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return true;
	}
	static void copyFiles() {}
	static void deleteTempFiles() {}

}
