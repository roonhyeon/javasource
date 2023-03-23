package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update2 {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			
			con=DriverManager.getConnection(url, user, password);
			
			//sc.nextLine(): 줄 단위로 읽기(엔터 포함), sc.next(): 엔터 직전까지만 읽기 => 둘 다 String으로 입력을 처리한다.
			//sc.nextInt(): 엔터 직전까지만 읽기
			
			
			System.out.println("부서번호를 입력하세요: ");
			int deptno=sc.nextInt(); //int deptno=Integer.parseInt(sc.nextLine())
			
			System.out.println("변경할 부서명을 입력하세요: ");
			String dname=sc.next(); //그래서 sc.nextLine()을 쓰고 싶으면 sc.nextInt()가 아니라 Integer.parseInt(sc.nextLine())와 함께 써야 한다.
			
			//특정 부서의 부서명 변경
			String sql="UPDATE DEPT_TEMP SET DNAME=? WHERE DEPTNO=?";
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, dname);
			pstmt.setInt(2, deptno);
			
			int result=pstmt.executeUpdate();
			
			if (result>0) {
				System.out.println("업데이트 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
