package database2;

import java.util.ArrayList;
import java.util.Scanner;

//DeptDao를 실행하기 위한 main
public class DeptMain {

	public static void main(String[] args) {
		
		DeptDao dao=new DeptDao();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		while (flag) {
			System.out.println("================");
			System.out.println("1. 특정 부서 조회");
			System.out.println("2. 전체 부서 조회");
			System.out.println("3. 새 부서 추가");
			System.out.println("4. 부서 정보 수정");
			System.out.println("5. 부서 정보 삭제");
			System.out.println("6. 종료");
			System.out.println("================");
			
			System.out.print("메뉴를 입력하세요: ");
			int no=Integer.parseInt(sc.nextLine());
			
			switch (no) {
			case 1:
				//부서번호를 10번에 국한되지 않고 사용자로부터 입력을 받아서 출력
				System.out.println("부서번호를 입력하세요: ");
				int deptno=Integer.parseInt(sc.nextLine());
				
				//1. 하나만 조회
		        DeptDTO row=dao.getRow(deptno);
		        //DeptDTO 출력
		        System.out.println(row);
				break;
			case 2:
				//2. 전체 조회
				ArrayList<DeptDTO> list=dao.getRows();
				for (DeptDTO deptDTO : list) {
					System.out.print(deptDTO.getDeptno()+"\t");
					System.out.print(deptDTO.getDname()+"\t");
					System.out.print(deptDTO.getLoc()+"\n");
				}
				break;
			case 3:
				//3. 새 부서 추가
				//방법1
//				System.out.print("부서번호를 입력하세요: ");
//				deptno=Integer.parseInt(sc.nextLine());
//				System.out.print("부서명을 입력하세요: ");
//				String dname=sc.nextLine(); //중간의 공백까지 모두 읽어오기 위해 nextLine을 사용했다.
//				System.out.print("지역을 입력하세요: ");
//				String loc=sc.nextLine();
//				System.out.println(dao.insert(deptno, dname, loc)?"삽입 성공":"삽입 실패"); //insert가 실행되면 false나 true 중에 하나가 출력된다.
				
				//방법2: DTO는 사용자 입력 결과를 dao 클래스로 넘길 때도 사용한다.
				DeptDTO dto=new DeptDTO();
				System.out.print("부서번호를 입력하세요: ");
				dto.setDeptno(Integer.parseInt(sc.nextLine()));
				System.out.print("부서명을 입력하세요: ");
				dto.setDname(sc.nextLine()); //중간의 공백까지 모두 읽어오기 위해 nextLine을 사용했다.
				System.out.print("지역을 입력하세요: ");
				dto.setLoc(sc.nextLine());
				System.out.println(dao.insert(dto)?"삽입 성공":"삽입 실패");
				break;
			case 4:
				//4. 부서 정보 수정
				System.out.print("부서번호를 입력하세요: ");
				deptno=Integer.parseInt(sc.nextLine());
				
				System.out.print("원하는 번호 입력: 1) 부서명 수정 2) 위치 수정");
				int updateNo=Integer.parseInt(sc.nextLine());

				String value=null;
				if (updateNo==1) {
					//1 선택 시
					System.out.print("새 부서명을 입력하세요: ");
					value=sc.nextLine();
				}else if (updateNo==2) {
					//2 선택 시
					System.out.print("새 위치를 입력하세요: ");
					value=sc.nextLine();
				}
				System.out.println(dao.update(value, deptno, updateNo) ? "수정 성공":"수정 실패");
				break;
			case 5:
				System.out.print("삭제할 부서를 입력하세요: ");
				deptno=Integer.parseInt(sc.nextLine());
				System.out.println(dao.remove(deptno)?"삭제 성공":"삭제 실패");
				break;
			case 6:
				flag=false;
				break;
			default:
				System.out.println("번호를 다시 입력해주세요.");
				break;
			}
		}
		
	}

}
