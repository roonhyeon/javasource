package shop3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static shop3.JdbcUtil.*;

//JdbcUtil 메서드 호출하는 방법
//1. static 메서드이므로 클래스이름. 메서드명(),
//2. JdbcUtil 클래스 안 메서드가 모두 static이라면 import static JdbcUtil.* => 메서드명()만 사용해도 된다.

public class UserDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//회원가입
	public boolean insert(int userId, String name, int payNo) {
		boolean status=false;
		
		try {
			con=JdbcUtil.getConnection();
			
			//suser insert
			String sql="insert into suser(user_id, name, pay_no) values(?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setString(2, name);
			pstmt.setInt(3, payNo);
			
			int result=pstmt.executeUpdate();
			
			if(result>0) status=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(con, pstmt);	
		}
		return status;
	}
	
	//전체 조회: select all
	public List<UserDTO> getList() {
		List<UserDTO> list=new ArrayList<>();
		
		try {
			con=getConnection();
			
			//suser 전체 조회
//			String sql="select * from suser";
			String sql="SELECT S.USER_ID, S.NAME, P.PAY_NO, P.INFO FROM SUSER S, PAYTYPE P "
					+ "WHERE S.PAY_NO=P.PAY_NO";
			
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				//방법1
//				UserDTO dto=new UserDTO(rs.getInt(1), rs.getString(2), rs.getInt(3));
//				list.add(dto);
				
				//방법2
				list.add(new UserDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
}
