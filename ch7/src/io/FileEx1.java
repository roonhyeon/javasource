package io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {

	public static void main(String[] args) throws IOException {
		
		//자바에서 파일 다루기
		//File(String pathname)
		// \는 escape 문자로, 역 슬래시를 하면 \t, \n, \b로 인식하기 때문에 정말 역 슬래시 자체로 인식시키고 싶으면 두 번 사용하면 된다.(\\)
		File file1=new File("c:\\temp\\test1.txt"); //저장하고 싶은 파일 경로를 String으로 설정해준다.
		
		//File(String parent, String child)
		File file2=new File("c:\\temp","test1.txt");
		
		//File(File parent, String child)
		File dir=new File("c:\\temp");
		File file3=new File(dir,"test1.txt");
		
		//File(URI uri)
		
		
		//주요 메소드
		//getName(): 파일명 가져오기
		String fileName=file1.getName();
		
		//.위치 찾기, substring 써서 test1 추출
		int onlyName=fileName.indexOf(".");
		System.out.println("파일명: "+fileName);
		System.out.println("확장자를 제외한 파일명: "+fileName.substring(0,onlyName));
		System.out.println("확장자: "+fileName.substring(onlyName+1));
		
		//getPath(): 파일명을 포함한 파일의 전체 경로를 가져온다.
		System.out.println("파일명을 포함한 파일의 전체 경로: "+file1.getPath());
		
		//getAbsolutePath(): 파일의 절대 경로를 가져온다, getCanonicalPath(): 파일의 정규 경로를 가져온다. (c드라이브를 대문자로 가져온다.) 
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getCanonicalPath());
		
		//getParent()
		System.out.println("파일이 속해 있는 디렉토리: "+file1.getParent());
		
		System.out.println(File.pathSeparator); // ;
		System.out.println(File.pathSeparatorChar); // ;
		System.out.println(File.separator); // \
		System.out.println(File.separatorChar);// \
	}

}
