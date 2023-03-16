package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEx1 {

	public static void main(String[] args) {
		
		//input: 키보드로부터 입력값을 받아들인다.
		InputStream in=System.in; //=키보드에서 입력이 들어올거야(스캐너 같은 개념)
		
		//output: 화면으로부터 입력값을 받아들인다. 1 byte만 출력되는 input과는 달리, 입력한 값이 그대로 출력된다.
		OutputStream out=System.out;
		
		try {
			int input=0;
			while ((input=in.read())!=-1) {
				out.write(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//Close Stream
			try {
				in.close(); //input 닫기
				out.close(); //output 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
