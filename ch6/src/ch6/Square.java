package ch6;

public class Square {
	//정사각형 넓이 구하기
	//속성: 변 길이=>정수
    int line;
	
    
	
	public Square(int line) {
		super();
		this.line = line;
	}



	//기능: 넓이 구하기
    double result() {
    	return line*line;
    }

}
