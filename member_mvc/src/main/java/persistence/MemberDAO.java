package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import domain.MemberDTO;

public class MemberDAO {
	
	    // 드라이버 로드
		private Connection con;
		private PreparedStatement pstmt;
		private ResultSet rs;
		
		// DB 서버 연결
		public Connection getConnection() {
			try {
			   Context ctx=new InitialContext();
			   DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/myoracle");
			   Connection con = ds.getConnection();
			   con.setAutoCommit(false); // DML 실행 시 트랜잭션 관리를 직접 하겠다.
			   return con;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		// 자원 해제
		public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void close(Connection con, PreparedStatement pstmt) {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void commit(Connection con) {
			try {
				con.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public void rollback(Connection con) {
			try {
				con.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		// 로그인
		// 아이디와 비밀번호가 일치하면 아이디와 이름만 추출
		// select userid, name from membertbl where userid=? and password=? 둘 중에 하나라도 일치하지 않으면 조회되지 않는다. 한 명만 조회
		public MemberDTO islogin(String userid, String password) {
			MemberDTO dto=null; // 로그인 정보가 일치하지 않는다면 null 리턴
			
			try {
				con=getConnection();
				String sql="select userid, name from membertbl where userid=? and password=?";
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, userid);
				pstmt.setString(2, password);
				rs=pstmt.executeQuery();
				
				if(rs.next()) {
					dto = new MemberDTO();
					dto.setUserid(rs.getString("userid"));
					dto.setName(rs.getString("name"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(con, pstmt, rs);
			}
			return dto;
		}
		
		// 회원가입
		public boolean isregister(MemberDTO registerDto) {
			boolean flag=false;
		    
		    try {
		    	con=getConnection();
		    	
		    	String sql = "INSERT INTO MEMBERTBL(USERID, PASSWORD, NAME, GENDER, EMAIL) ";
		    	sql += "VALUES(?,?,?,?,?)";
		    	pstmt = con.prepareStatement(sql);
		    	// ? 해결
		    	pstmt.setString(1, registerDto.getUserid());
		    	pstmt.setString(2, registerDto.getPassword());
		    	pstmt.setString(3, registerDto.getName());
		    	pstmt.setString(4, registerDto.getGender());
		    	pstmt.setString(5, registerDto.getEmail());
		    	
				int result = pstmt.executeUpdate();
				if(result>0) {
					flag=true;
					commit(con);
				}
			} catch (SQLException e) {
				rollback(con);
				e.printStackTrace();
			} finally {
				close(con, pstmt);
			}
			return flag;
		}
		


}
