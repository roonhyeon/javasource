package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileInputEx4 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("c:\\temp\\output2.txt"); BufferedOutputStream bos=new BufferedOutputStream(fos)) {
			
			for(int i='1'; i<='9'; i++) {
				bos.write(i); //이 값을 FileOutputStream 통로를 통해 output2로 넘겼다. 문자를 묶어서 한 번에 전달하므로 전송시간이 적게 걸려 성능이 향상된다.
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
