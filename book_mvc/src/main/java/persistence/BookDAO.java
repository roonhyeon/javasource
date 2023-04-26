package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import domain.BookDTO;

public class BookDAO {

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
	
	//도서 목록 조회
	public List<BookDTO> getList(){
		List<BookDTO> list = new ArrayList<>();
		
		 try {
			con=getConnection();
			String sql="select code,title,writer,price from booktbl order by code desc";
			pstmt=con.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				// 이 코드가 오류가 나지 않으려면 BookDTO에 description을 제외한 생성자를 생성해주면 된다.
//				int code=rs.getInt("code");
//				String title=rs.getString("title");
//				String writer=rs.getString("writer");
//				int price=rs.getInt("price");
//				
//				list.add(new BookDTO(code, title, writer, price));

				BookDTO dto = new BookDTO();
				dto.setCode(rs.getInt("code"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setPrice(rs.getInt("price"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	// 도서 상세 조회
	public BookDTO getRow(int code) {
		BookDTO dto = null;
		try {
			con=getConnection();
			String sql="select * from booktbl where code=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, code);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				code=rs.getInt("code");
				String title=rs.getString("title");
				String writer=rs.getString("writer");
				int price=rs.getInt("price");
				String description=rs.getString("description");
				
				dto = new BookDTO(code, title, writer, price, description);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return dto;
	}
	
	// 도서 정보 입력
	// insert into booktbl(code, title, writer, price, description)
	// values(?,?,?,?,?);
	public boolean insert(BookDTO insertDto) {
		boolean flag=false;
			    
	    try {
	    	con=getConnection();
	    	
	    	String sql = "INSERT INTO BOOKTBL(CODE, TITLE, WRITER, PRICE, DESCRIPTION) ";
	    	sql += "VALUES(?,?,?,?,?)";
	    	pstmt = con.prepareStatement(sql);
	    	// ? 해결
	    	pstmt.setInt(1, insertDto.getCode());
	    	pstmt.setString(2, insertDto.getTitle());
	    	pstmt.setString(3, insertDto.getWriter());
	    	pstmt.setInt(4, insertDto.getPrice());
	    	pstmt.setString(5, insertDto.getDescription());
	    	
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
	
	// 도서 정보 수정(가격)
	// update booktbl set price = ? where code=?
	public boolean update(int price, int code) {
		boolean flag=false;
		try {
			con=getConnection();
			
			String sql="update booktbl set price = ? where code=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, price);
			pstmt.setInt(2, code);
		
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
	
	// 도서 정보 삭제
	// delete from booktbl where code=?
	public boolean delete(int code) {
		boolean flag=false;
		
		try {
			con=getConnection();
			
			String sql="delete from booktbl where code=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, code);
		
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


