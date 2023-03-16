package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Map

public class MapEx1 {

	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<>();
		
		//put(): 요소 추가 => 키 값이 동일하다면 나중에 추가한 요소만 남게 된다.
		map.put("myID1", "1234");
		map.put("myID2", "4321");
		map.put("myID3", "1545");
		map.put("myID4", "1975");
		
		System.out.println(map);
		
		Scanner sc= new Scanner(System.in);
		while (true) {
			//key에 해당하는 id 입력받기
			System.out.println("아이디를 입력하세요: ");
			String id=sc.nextLine().trim(); //만약 실수로 아이디 뒤에 스페이스바를 두번 눌러주었다면?? => 공백을 제거하고 입력을 받아오기(trim() 사용)
			
			//존재하지 않는 경우에는 '입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요.' 메시지 출력 후 다시 id 입력받기
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요.");
				continue; //밑에 실행 안하고 다시 처음 실행
			}
			
			//value에 해당하는 password 입력받기
			System.out.println("비밀번호를 입력하세요: ");
			String pw=sc.nextLine().trim();
			
			//입력받은 비밀번호가 일치하는지 확인한 후 비밀번호가 일치하면 프로그램 종료, 일치하지 않는 경우 "다시 입력해 주세요"
			if(!map.get(id).equals(pw)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			}else {
				System.out.println("아이디와 비밀번호가 일치합니다. 로그인 성공!");
				break;
			}
		}

	}

}
