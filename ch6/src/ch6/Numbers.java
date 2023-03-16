package ch6;

public class Numbers {
	
	int num[];
	
	public Numbers(int[] num) {
		super();
		this.num=num;
	}
	
	//배열 총합
	int getTotal() {
		int sum=0;
		for (int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}
	
	//배열 평균
	int getAverage() {
		//총합/배열 길이
//		int sum=0;
//		for (int i = 0; i < num.length; i++) {
//			sum+=num[i];
//		}
//		return sum/num.length;
		return getTotal()/num.length; //getAverage에서 getTotal 호출: 같은 클래스 안에서 다른 메소드 호출
	}

}
