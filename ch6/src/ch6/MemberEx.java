package ch6;

public class MemberEx {

	public static void main(String[] args) {
		
		Member member1=new Member("hong123","honghong","honghong","01012341234");
		Member member2=new Member("hong123","honghong","honghong","01012341234","서울 종로구");
		
		//true라면 '비밀번호가 일치합니다.' false라면 '비밀번호를 확인해주세요' 메세지 출력.
		//문자열 비교 시 == 사용하면 안된다.=>equals() 사용
		if(member1.passwordAndConfirmPasswordEquals()) {
		
	    	System.out.println("비밀번호가 일치합니다.");
	    }else {
			System.out.println("비밀번호를 확인해주세요.");
		}
		System.out.println(member2.passwordAndConfirmPasswordEquals()?"비밀번호가 일치합니다.":"비밀번호를 확인해주세요.");
	   
		//member1과 member2 내용 출력하기
		memberInfo(member1);
		memberInfo(member2); //요소 불러오기
		
	}
	
	    //main을 벗어난 얘를 편의를 위해 공통변수는 static으로 뺐다.
	    static void memberInfo(Member member) { //memberInfo는 여기서 설정(main에 선언된 member1,2는 범위를 넘어서므로 여기서 사용 못한다.
	    	                                    //그래서 memberInfo(Member)같이 타입 Member를 넣어서 main의 두 변수를 끌어오는 것이다.)
		//출력결과
		System.out.println("아이디: "+member.userid);//아이디: 초기값 출력
		System.out.println("비밀번호: "+member.password);//비밀번호: 초기값 출력
		System.out.println("전화번호: "+member.hp);//전화번호: 초기값 출력
		System.out.println("주소: "+member.address);//주소: 초기값 출력

	}
}
