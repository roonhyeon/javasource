package shop2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {
	
	    //드라이버 로드, 커넥션 얻기, 자원해제같이 중복되는 메서드를 이곳에 한꺼번에 작성
	    //드라이버 로드
		static {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		//연결 문자열을 이용해서 커넥션 얻어오기
		public static Connection getConnection() {
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="javadb";
			String password="12345";
			
			try {
				return DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		//자원해제
		public static void close(Connection con, PreparedStatement pstmt) {
			try {
				con.close();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
			try {
				rs.close();
				con.close();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
