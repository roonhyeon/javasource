package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			
			con=DriverManager.getConnection(url, user, password);
			
			//부서번호가 55번인 DNAME을 WEB으로 변경
			String sql="UPDATE DEPT_TEMP SET DNAME='WEB' WHERE DEPTNO=55";
			pstmt=con.prepareStatement(sql);
			
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
