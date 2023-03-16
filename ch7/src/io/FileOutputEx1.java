package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOutputEx1 {

	public static void main(String[] args) {
		//키보드에서 입력을 받아들여 파일에 쓰기
		//조건: 키보드에서 q가 입력되기 전까지 계속 받아들이도록 한다. Scanner, FileWriter/BufferedWriter 사용
		String text=null; //사용자 입력 변수
		try (Scanner sc=new Scanner(System.in);FileWriter fw=new FileWriter("c:\\temp\\test1.txt");BufferedWriter bw=new BufferedWriter(fw)){
			
			System.out.println("파일에 저장할 데이터를 입력해주세요: ");
			System.out.println("입력을 중단하려면 q를 입력해주세요: ");
			
			do {
				System.out.println(">> ");
				text=sc.nextLine();
				
				if (!text.equals("q")) {
					bw.write(text);
				    bw.newLine();
				}
			}while (!text.equals("q")); //text=q이면 반복문 종료
			 
		} catch (Exception e) {
			 e.printStackTrace();
		}

	}

}
