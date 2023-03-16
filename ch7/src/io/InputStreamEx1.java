package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {
		
//		//input: 키보드에서 받아들인다.
//		InputStream in=System.in; //=키보드에서 입력이 들어올거야(스캐너 같은 개념)
//		
//		//키보드에서 입력이 들어오면 읽어오기
//		try {
//			//read(): Even there are any other bytes, Read only 1 byte. 한글은 깨짐(한글=3 byte)
////			int input=in.read(); 
//			//입력한 값들 모두 읽어오게 하고 싶으면 반복문 처리를 하면 된다.
//			int input=0;
//			while ((input=in.read())!=-1) { //끝까지 돌리기 위해 -1까지로 잡았다. (read가 더이상 읽어올 byte가 없으면 return -1인 것을 이용하였다.)
//				System.out.println((char)input); //문자 값으로 출력되도록 형변환도 가능
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			//Close Stream
//			try {
//				in.close(); //input 닫기
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	
		//try-with-resource: Closable을 구현한 클래스여야 한다. (implements Closable)
		//try()의 ()안에 생성된 객체는 알아서 닫아준다. => 따로 close() 선언 안 해줘도 된다.
		try(InputStream in=System.in) {
			int input=0;
			while ((input=in.read())!=-1) {
				System.out.println((char)input);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
