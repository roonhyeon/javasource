package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationEx1 {

	public static void main(String[] args) {
		
		//객체의 직렬화 => dat
		Person p1=new Person("김유신", "engineer");
		Person p2=new Person("이순신", "teacher"); //이 내용을 파일에 쓰고 싶다.
		
		try(FileOutputStream fos=new FileOutputStream("c:\\temp\\serial.dat");BufferedOutputStream bos=new BufferedOutputStream(fos);
				ObjectOutputStream oos=new ObjectOutputStream(bos)) { //객체를 파일에 저장하기 위해서는 ObjectOutputStream을 써야 한다. 보조 Stream의 일종이다.
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//직렬화된 dat를 역직렬화: 저장된 객체를 다시 불러오기
		try(FileInputStream fos=new FileInputStream("c:\\temp\\serial.dat");BufferedInputStream bos=new BufferedInputStream(fos);
				ObjectInputStream oos=new ObjectInputStream(bos)) {
			
			for (int i = 0; i < 2; i++) {
				Person p=(Person) oos.readObject();
				System.out.println(p);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
