package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx6 {
	
	public static void main(String[] args) {
		
		
		try(FileInputStream fis=new FileInputStream("C:\\temp\\iu.mp4");FileOutputStream fos=new FileOutputStream("C:\\temp\\iucopy.mp4")) {
			int data=0;
			
			long start=System.currentTimeMillis(); //복사 시작시간(ms)
			
			while ((data=fis.read())!=-1) {
			}
			
			long end=System.currentTimeMillis(); //복사 종료시간(ms)
			System.out.println("InputStream/OutputStream 걸린 시간 "+(end-start)+"ms");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\temp\\iu.mp4")); => 이렇게 한 줄도 가능(( ) 안에서부터 해석)
		try(FileInputStream fis=new FileInputStream("C:\\temp\\iu.mp4");BufferedInputStream bis=new BufferedInputStream(fis);
				FileOutputStream fos=new FileOutputStream("C:\\temp\\iucopy.mp4");BufferedOutputStream bos=new BufferedOutputStream(fos)) {
			int data=0;
			
			byte b[]=new byte[8192];
			
			long start=System.currentTimeMillis(); //복사 시작시간(ms)
			
			while ((data=fis.read(b))!=-1) {
				bos.write(b);
			}
			
			long end=System.currentTimeMillis(); //복사 종료시간(ms)
			System.out.println("InputStream+Buffered+byte/OutputStream+Buffered+byte 걸린 시간 "+(end-start)+"ms");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} //파일이 크면 Buffered를 쓰자. 읽어오는 시간 차이가 너무 많이 난다.
}
