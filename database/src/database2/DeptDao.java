package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// ~Dao: Database 작업을 담당하는 클래스
public class DeptDao {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs; //rs에서 테이블을 받아온다. 그리고 DeptDTO는 행별로 담기 때문에 행별로 만들어야 한다. => 그렇기 때문에 ArrayList를 통해 DeptDTO를 출력해준다.
	
	//커넥션을 위한 '드라이버 로드'
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//커넥션을 '리턴'하는 메소드
	public Connection getConnection() {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="TIGER";
		
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	//close(): 자원 닫기
	//select
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//DML
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//1. select 하나만 나오는 상황
	public DeptDTO getRow(int deptno) { //DeptMain에서 선언한 case1을 실행해주기 위해서
		//커넥션 가져오기
		con=getConnection();
		
		//sql 구문 작성하기
		String sql="select* from dept_temp where deptno=?";
		DeptDTO dto=null; //만약 바로 밑의 if문에서 읽어올 것이 없다면 null이 출력될 것이다.
		
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			rs=pstmt.executeQuery();
			
			if (rs.next()) {
//				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)); //이 출력문을 DTO에 담아서 Main에서 출력하기 => Dao를 only 작업 공간으로 만들기 위해 출력하는 문을 다 빼버리기 위해서		

				//rs에 있는 것을 DTO에 담기
				//방법1
//				deptno=rs.getInt(1);
//				String dname=rs.getString(2);
//				String loc=rs.getString(3);
//				
//				dto=new DeptDTO(deptno, dname, loc);
				
				//방법2
//				return new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3)); //위 4줄을 한줄로 축약
				
				//방법3
				dto=new DeptDTO();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return dto;
	}
	
	//2. select를 모두 가져오는 상황
	public ArrayList<DeptDTO> getRows() {
		ArrayList<DeptDTO> list=new ArrayList<>();
		
		try {
			con=getConnection();
			String sql="select* from dept_temp";
			
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
//				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)); //이 출력문을 DTO에 담아서 Main에서 출력하기
				
				//첫 번째 행을 DeptDTO로 불러오기
				//방법1
//				int deptno=rs.getInt(1);
//				String dname=rs.getString(2);
//				String loc=rs.getString(3);
//				DeptDTO dto=new DeptDTO(deptno, dname, loc);
//				list.add(dto); //만든 첫번째 객체 dto를 리스트에 추가해준다. => 최종적으로 리스트가 실행되면서 main에서 전체를 불러올 수 있게 된다.
				
				//방법2
//				list.add(new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3))); //위 5줄을 1줄로 축약
				
				//방법3
				DeptDTO dto=new DeptDTO();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}

}
