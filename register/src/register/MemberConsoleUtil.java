package register;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberConsoleUtil {

	public Member getNewMember(Scanner sc) {
		//새로운 Member 정보 입력받기
		System.out.println("아이디를 입력해주세요: ");
		String id=sc.nextLine();
		System.out.println("이름을 입력해주세요: ");
		String name=sc.nextLine();
		System.out.println("주소를 입력해주세요: ");
		String address=sc.nextLine();
		System.out.println("이메일을 입력해주세요: ");
		String email=sc.nextLine();
		System.out.println("나이를 입력해주세요: ");
		int age=Integer.parseInt(sc.nextLine());
		Member member=new Member(id,name,address,email,age);
		return member;
		
//		return new Member(id,name,address,email,age);
	}
	
	public void printAddSucessMessage(Member member) {
		//홍길동님 회원 정보 추가 성공 메세지 출력
		System.out.println(member.getName()+"님 회원 정보 추가 성공!");
	}

	public void printMemberList(ArrayList<Member> list) {
		//list에 들어있는 member 출력
		System.out.println("아이디   이름     주소        이메일          나이");
		for (Member member : list) {
			System.out.printf("%2s",member.getId());
			System.out.printf("%5s",member.getName());
			System.out.printf("%8s",member.getAddress());
			System.out.printf("%13s",member.getEmail());
			System.out.printf("%5d",member.getAge());
			System.out.println();
			
			//한 줄 짜리
//			System.out.printf("%5s %6s %8s %10s %5d\n",member.getId(),member.getName(),member.getAddress(),member.getEmail(),member.getAge());   
		}	
	}
	
	public Member updateMember(Scanner sc, ArrayList<Member> list) {
		//수정할 회원의 아이디를 입력받기
		System.out.println("수정할 아이디를 입력하세요: ");
		String id=sc.nextLine();
		
		// ## 방법1 ##
//		//list에서 입력된 회원의 아이디랑 일치하는 회원 찾기
//		Iterator<Member> it=list.iterator(); //list -> Iterator로 변경
//		while (it.hasNext()) { //Iterator에서 Member를 알아서 하나씩 가져온다.
//			Member member = (Member) it.next(); //첫 번째 member 정보 가져온다.
//			
//			if (member.getId().equals(id)) { //가져온 그 member의 id가 입력받은 id와 같은지 비교한다.
//				//회원이 존재한다면 변경할 주소를 입력받기
//				System.out.println("변경할 주소를 입력하세요: ");
//			    String address=sc.nextLine();
//			    //주소를 변경
//			    member.setAddress(address);
//			    //수정된 회원을 리턴
//		        return member;
//			}
//		}
		
		// ## 방법2 ##
//		//list에서 입력된 회원의 아이디랑 일치하는 회원 찾기
//		for (int i = 0; i < list.size(); i++) {
//			Member member=list.get(i);
//		
//			if (member.getId().equals(id)) { //가져온 그 member의 id가 입력받은 id와 같은지 비교한다.
//				//회원이 존재한다면 변경할 주소를 입력받기
//				System.out.println("변경할 주소를 입력하세요: ");
//			    String address=sc.nextLine();
//			    //주소를 변경
//			    member.setAddress(address);
//			    //수정된 회원을 리턴
//		        return member;
//			}
//		}
		
		// ## 방법3 ##-내가 선택한 방법
		//list에서 입력된 회원의 아이디랑 일치하는 회원 찾기
		for (Member member : list) {
			if (member.getId().equals(id)) { //가져온 그 member의 id가 입력받은 id와 같은지 비교한다.
				//회원이 존재한다면 변경할 주소를 입력받기
				System.out.println("변경할 주소를 입력하세요: ");
			    String address=sc.nextLine();
				//주소를 변경
				member.setAddress(address);
				//수정된 회원을 리턴
				return member;
			}
		}
		//일치하는 회원이 없다면
		return null;
	}

	public void printUpdateSucessMessage(Member member) {
		//홍길동님 회원 정보 수정 성공 메세지 출력
		System.out.println(member.getName()+"님 회원 정보 수정 성공!");
	}

	public void printUpdateFailMessage() {
		//회원 정보 수정에 실패하셨습니다.
		System.out.println("회원 정보 수정에 실패하셨습니다.");
	}

	public Member removeMember(Scanner sc, ArrayList<Member> list) {
		//삭제할 회원 아이디 입력받기
		System.out.println("삭제할 아이디를 입력하세요: ");
		String id=sc.nextLine();
		
		//삭제할 회원 아이디가 존재하는지 확인하기
		for (Member member : list) {
			if (member.getId().equals(id)) {
			//존재한다면 삭제하고
		    list.remove(member);
		    //삭제된 회원 리턴
			return member;
			}
		}
		//삭제할 회원 아이디가 존재하지 않는다면 null 리턴
	    return null;
	}

	public void printRemoveSucessMessage(Member member) {
		System.out.println(member.getName()+"님 회원 정보 삭제 성공!");
	}

	public void printRemoveFailMessage() {
		System.out.println("회원 정보 삭제에 실패하셨습니다.");
	}

}
