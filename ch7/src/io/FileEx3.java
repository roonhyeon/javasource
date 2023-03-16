package io;

import java.io.File;

public class FileEx3 {
	static int deletedFiles=0; //삭제된 파일의 개수를 저장하는 변수
	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("사용법: java FileEx3 디렉토리명");
			System.exit(0);
		}
		
		String currDir=System.getProperty("user.dir"); //user.dir: User's current working directory //현재 작업 중인 디렉토리 가져오기(ch7)
//		System.out.println(currDir);
		File dir=new File(currDir);
		String ext="."+args[0]; //확장자명 앞에 . 을 붙임
		
		delete(dir,ext);
		System.out.println(deletedFiles+"개의 파일이 삭제되었습니다.");
	}

	public static void delete(File dir, String ext) {
		File[] files=dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				delete(files[i],ext); //재귀호출: 자기 자신의 메소드를 호출 (delete가 해야하는 일을 호출) => if문에 걸린 디렉토리라면 '.settings'가 파일 경로명에 추가된다. 
			}else {
				String fileName=files[i].getAbsolutePath();
				
				if (fileName.endsWith(ext)) {
					System.out.print(fileName);
					if (files[i].delete()) { //delete(): 파일을 삭제해주는 메소드
						System.out.println(" - 삭제 성공");
						deletedFiles++; //삭제된 파일 하나씩 증가
					}else {
						System.out.println(" - 삭제 실패");
					}
				}
			}
		}
		
	}
	
}
