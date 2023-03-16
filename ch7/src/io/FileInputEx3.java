package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;

public class FileInputEx3 {

	public static void main(String[] args) {
		//FileInputEx1.java를 읽어서 화면 출력을 할 때 행 번호와 같이 출력(FileReader를 이용해서)
		
//		try(FileReader fis=new FileReader(".\\src\\io\\FileInputEx1.java");OutputStream out=System.out;) {
//				int data=0;
//				int line=1; //행번호
//				System.out.print(line+"   ");
//
//				while ((data=fis.read())!=-1) { //하나씩 출력
//					System.out.print((char)data);; //한글이 깨지는 것을 막기 위해 바로 밑에 거처럼 출력하는 대신에 이렇게 형변환하여 출력한다.
////					out.write(data);
//					
//					if(data=='\n') { //줄바꿈 기준으로 행번호 매겨지는 것을 표현
//						line++;
//						System.out.print(line+"   ");
//					}
//		        }
//	    } catch (Exception e) {
//			e.printStackTrace();
//	    }
		
		//FileReader, BufferedReader 쓰는 형태로 바꾸기
		try(FileReader fis=new FileReader(".\\src\\io\\FileInputEx2.java");BufferedReader br=new BufferedReader(fis);) {
			
			String str=null;
			int i=1;
			while((str=br.readLine())!=null) {
				System.out.println(i+" "+str);
				i++;

			}
        } catch (Exception e) {
		    e.printStackTrace();
        }
	}
	
}


