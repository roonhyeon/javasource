package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//드라이버로드, 커넥션, select+DML 정의
	//드라이버로드
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//커넥션
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
	
	//자원닫기
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
	
	//select-many: return 타입은 무조건 ArrayList
	public ArrayList<EmpDTO> getList(String ename){
		ArrayList<EmpDTO> list=new ArrayList<>();
		
		try {
			con=getConnection();
			//ename이 홍길동인 사람 조회(empno, ename, job, hiredate)
			String sql="select empno, ename, job, hiredate from emp_temp where ename=?"; //동명이인 가능성 => 2개 이상 나올 거 같으면 무조건 ArrayList로
			pstmt=con.prepareStatement(sql);
			//? 해결
			pstmt.setString(1, ename);
			
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				EmpDTO empDTO=new EmpDTO();
				empDTO.setEmpno(rs.getInt(1)); //출력할 순서대로 가로 안에 숫자를 넣어준다.
				empDTO.setEname(rs.getString(2));
				empDTO.setJob(rs.getString(3));
				empDTO.setHiredate(rs.getDate(4));
				
				list.add(empDTO); //empno, ename, job, hiredate 순서로 한 행을 empDTO에 담았고 이것을 리스트에 담아서 리턴 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	//select-one: return 타입은 DTO
	public EmpDTO getRow(int empno) { //?를 int로 받아라
		EmpDTO empDTO=null;
		
		try {
			con=getConnection();
			
			//where 절에 pk(primary key-기본키: 중복 불가, null 불가)가 조건으로 들어오는 경우 무조건 하나의 행이 나온다.
			//pk example: empno, deptno
			String sql="select empno, ename, job, sal, comm, deptno from emp_temp where empno=?";
			pstmt=con.prepareStatement(sql);
			
			pstmt.setInt(1, empno);
			
			rs=pstmt.executeQuery();
			
			if (rs.next()) {
				empDTO=new EmpDTO();
				empDTO.setEmpno(rs.getInt(1));
				empDTO.setEname(rs.getString(2));
				empDTO.setJob(rs.getString(3));
				empDTO.setSal(rs.getInt(4));
				empDTO.setComm(rs.getInt(5));
				empDTO.setDeptno(rs.getInt(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return empDTO;
	}
	
	//급여 수정
	public boolean update(int sal, int empno) {
		boolean status=false;
		try {
			con=getConnection();
			
			//사번이 일치하면 급여 수정
			String sql="update emp_temp set sal=? where empno=?";
			pstmt=con.prepareStatement(sql);
			
			pstmt.setInt(1, sal);
			pstmt.setInt(2, empno);
			
			int result=pstmt.executeUpdate();
			
			if(result>0) status=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return status;
	}
	
	
	
	
	
	
	

}
