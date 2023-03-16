package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {

	public static void main(String[] args) {
		
//		//input: 키보드에서 받아들인다.
//		InputStream in=System.in;
//		
//		OutputStream out=System.out;
//		
//		//입력이 들어오면 읽어오기
//		try {
//			//read(byte[] b): byte 배열에 담긴 만큼 읽어온다.
//			byte[] b=new byte[100];
//			while (in.read(b)!=-1) { //끝까지 돌리기 위해 -1까지로 잡았다. (read가 더이상 읽어올 byte가 없으면 return -1인 것을 이용하였다.)
//				out.write(b);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			//Close Stream
//			try {
//				in.close(); //input 닫기
//				out.close(); //output 닫기
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	    
		//알아서 닫아준다.
		try(InputStream in=System.in;OutputStream out=System.out) {
			byte[] b=new byte[100];
			while (in.read(b)!=-1) {
				out.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
