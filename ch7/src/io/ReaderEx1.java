package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx1 {

	public static void main(String[] args) {
		//reader, writer: 문자 기반
	
		Reader reader=null;
		Writer writer=null;
		try {
			reader=new FileReader("c:\\temp\\file1.txt");
//			reader=new FileReader("c:\\temp\\file1.txt",Charset.forName("ms949")); //윈도우용 깨짐 방지 코드
			
			//append: true => 기존 파일에 덧붙이기 똑같은 텍스트가 2개 나온다. 
			writer=new FileWriter("c:\\temp\\output1.txt",true);
			
			//파일 출력
			int data=0;
			while ((data=reader.read())!=-1) {
				writer.write(data);
			}
			
			//화면 출력
//			int data=0;
//			while ((data=reader.read())!=-1) {
//				System.out.print((char)data);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
