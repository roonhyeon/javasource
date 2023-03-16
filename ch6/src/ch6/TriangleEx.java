package ch6;

public class TriangleEx {

	public static void main(String[] args) {
        
		Triangle triangle=new Triangle(15,7); //기본 생성자만 부르면 결과값은 0=>초기화 해주기
		
		//메소드 호출
		System.out.println("삼각형 넓이="+triangle.getArea()); 

	}
}
