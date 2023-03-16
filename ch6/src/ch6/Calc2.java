package ch6;

public class Calc2 {
	
	int add(int a, int b) {
		return a+b;
	}
	
//	long add(int num1, int num2) {
//		return num1+num2;
//	} //()안의 것이 int, int로 위에 것과 같기 때문에 오류 남.
	
	long add(int num1, long num2) {
		return num1+num2;
	}
	
	int add(int[] arr) {
		int result=0;
		for (int i = 0; i < arr.length; i++) {
			result +=arr[i];
		}
		return result;
	}
	
	float add(int a, float b) {
		return a+b;
	}

}
