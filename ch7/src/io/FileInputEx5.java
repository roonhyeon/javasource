package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileInputEx5 {

	public static void main(String[] args) {
		
		//버퍼를 사용해서 파일에서 문자 단위로(by Reader) 읽어오기, 버퍼를 사용하여 읽어온 내용을 파일에 문자 단위로(by Writer) 쓰기 => 텍스트를 읽어오고 쓰려고 할 때 제일 이상적인 방법
		try(FileReader fr=new FileReader("c:\\temp\\file1.txt");BufferedReader br=new BufferedReader(fr);
				FileWriter fw=new FileWriter("c:\\temp\\output3.txt");BufferedWriter bw=new BufferedWriter(fw)) {
			
			String str=null;
			while((str=br.readLine())!=null) { //readLine(): 줄 단위로 읽어오기, 더이상 읽어올 행이 없다면 null 출력
				bw.write(str); //줄 단위로 읽어온 것을 String으로 출력
				bw.newLine(); //엔터를 넣어서 file1과는 달리 일렬로 죽 출력되는 output3의 내용을 줄바꿈을 해준다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
