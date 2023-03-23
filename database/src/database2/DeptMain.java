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
			System.out.println("6. 종료");
			System.out.println("================");
			
			System.out.print("메뉴를 입력하세요: ");
			int no=sc.nextInt();
			
			switch (no) {
			case 1:
				//부서번호를 10번에 국한되지 않고 사용자로부터 입력을 받아서 출력
				System.out.println("부서번호를 입력하세요: ");
				int deptno=sc.nextInt();
				
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
