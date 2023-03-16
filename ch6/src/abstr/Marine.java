package abstr;

public class Marine extends Unit{
	
//	int x,y; //공통사항 Unit에서 설정
//	void move(int x,int y) {} //공통사항 Unit에서 설정
//	void stop() {} //공통사항 Unit에서 설정
	void stimPack() {}

	@Override
	void move(int x, int y) {
		System.out.println("Marine[x="+x+", y="+y+"]");		
	}
	
}

class Tank extends Unit{
	
//	int x,y;
//	void move(int x,int y) {}
//	void stop() {}
	void changeMode() {}

    @Override
    void move(int x, int y) {
    	System.out.println("Tank[x="+x+", y="+y+"]");
    }
	
}

class DropShip extends Unit{

//	int x,y;
//	void move(int x,int y) {}
//	void stop() {}
	void load() {}
	void unload() {}
	
	@Override
	void move(int x, int y) {
		System.out.println("DropShip[x="+x+", y="+y+"]");
	}
	
}

//모두 동일하게 출력할 거면 굳이 자식으로 강제 오버라이딩 안 하고 부모 클래스에서 구현하면 된다.