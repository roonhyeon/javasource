package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {

	public static void main(String[] args) {
		
//		//input: 키보드에서 받아들인다.
//		InputStream in=System.in;
//		
//		//입력이 들어오면 읽어오기
//		try {
//			//read(byte[] b): byte 배열에 담긴 만큼 읽어온다.
//			byte[] b=new byte[100];
//			
//			System.out.print("이름: ");
//			//읽어 온 byte 개수
//			int nameByte=in.read(b); //읽어 온 내용은 b에 담겨있다.
//			//String 생성자를 이용해서 nameByte를 String으로 생성하기
//			//enter: carriage return+line feed => 엔터값을 빼주기 위해 2 byte 차감
//			String name=new String(b,0,nameByte-2);
//			
//			System.out.print("하고 싶은 말: ");
//			int commentByte=in.read(b);
//			//String 생성자를 이용해서 commentByte를 String으로 생성하기
//			String comment=new String(b,0,commentByte-2);
//			
//			//생성한 String 출력
//			System.out.println("입력한 이름: "+name);
//			System.out.println("입력 하고 싶은 말: "+comment);
//			
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
	
		try(InputStream in=System.in;) {
            byte[] b=new byte[100];
			
			System.out.print("이름: ");
			int nameByte=in.read(b); 
			String name=new String(b,0,nameByte-2);
			
			System.out.print("하고 싶은 말: ");
			int commentByte=in.read(b);
			String comment=new String(b,0,commentByte-2);
			
			System.out.println("입력한 이름: "+name);
			System.out.println("입력 하고 싶은 말: "+comment);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
