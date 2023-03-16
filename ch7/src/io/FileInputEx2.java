package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx2 {
	public static void main(String[] args) {
		//copy (C:\\temp\\file1.txt => C:\\temp\\file2.txt로 바꾸고 싶다.)
		//원본 파일 읽기
		//읽어온 내용을 새로운 파일에 쓰기
//		FileInputStream fis=null;
//		FileOutputStream fos=null;
//		
//		try {
////			fis=new FileInputStream("C:\\temp\\file1.txt");
////			fos=new FileOutputStream("C:\\temp\\file2.txt"); //파일
//			
////			fis=new FileInputStream("C:\\temp\\image.jpg");
////			fos=new FileOutputStream("C:\\temp\\copy.jpg"); //이미지
//			
//			fis=new FileInputStream("C:\\temp\\iu.mp4");
//			fos=new FileOutputStream("C:\\temp\\copy.mp4"); //동영상, 파일 크기가 크면 클수록 카피하는데 오래 걸린다.
//			
//			int data=0;
//			while ((data=fis.read())!=-1) { //읽을 때는 read
//				fos.write(data); //쓸 때는 write
//			}	
//		} catch (IOException e) { //FileNotFoundException은 IOException이 처리할 수 있다.
//			e.printStackTrace();
//		} finally {
//				try {
//					fis.close();
//					fos.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				
//		}
		
		try(FileInputStream fis=new FileInputStream("C:\\temp\\iu.mp4");FileOutputStream fos=new FileOutputStream("C:\\temp\\copy.mp4");) {
			int data=0;
			while ((data=fis.read())!=-1) {
				fos.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
