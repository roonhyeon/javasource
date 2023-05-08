package board.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import board.domain.BoardDTO;
import board.domain.PageDTO;

public class BoardDAO {
	
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
		
		// 게시글 등록
		// insertArticle(BoardDTO boardDTO)
		// re_ref: bno와 동일한 값, re_lev: 0, re_seq: 0
		public boolean insertArticle(BoardDTO boardDto) {
			boolean flag=false;
		    
		    try {
		    	con=getConnection();
		    	
		    	String sql = "INSERT INTO BOARD(BNO, NAME, PASSWORD, TITLE, CONTENT, ATTACH, RE_REF, RE_LEV, RE_SEQ) ";
		    	sql += "VALUES(board_seq.nextval,?,?,?,?,?,board_seq.currval,?,?)";
		    	pstmt = con.prepareStatement(sql);
		    	// ? 해결
		    	pstmt.setString(1, boardDto.getName());
		    	pstmt.setString(2, boardDto.getPassword());
		    	pstmt.setString(3, boardDto.getTitle());
		    	pstmt.setString(4, boardDto.getContent());
		    	pstmt.setString(5, boardDto.getAttach());
		    	pstmt.setInt(6, 0);
		    	pstmt.setInt(7, 0);
		    	
				int result = pstmt.executeUpdate();
				if(result>0) {
					flag=true;
					commit(con);
				}
			} catch (Exception e) {
				rollback(con);
				e.printStackTrace();
			} finally {
				close(con, pstmt);
			}
			return flag;
		}
		
		// board 전체 내용 가져오기
		// bno, title, name, regdate, cnt
		public List<BoardDTO> getRows(PageDTO pageDto){
			List<BoardDTO> list=new ArrayList<>();
			int start=pageDto.getPage()*pageDto.getAmount();
			int end=(pageDto.getPage()-1)*pageDto.getAmount();
			
			try {
				con=getConnection();
				
				String sql=null;
				if(pageDto.getKeyword().isEmpty() && pageDto.getCriteria().isEmpty()) {
					// 전체 리스트 조회
//					sql="select bno, title, name, regdate, cnt, re_lev from board order by re_ref desc, re_seq asc";
					
					// 페이지 나누기
					sql="SELECT * ";
					sql+="FROM (SELECT ROWNUM rnum, BNO, TITLE, name, regdate, cnt, re_lev ";
					sql+="FROM (SELECT BNO, TITLE, name, regdate, cnt, re_lev ";
					sql+="FROM BOARD ORDER BY RE_REF DESC, RE_SEQ ASC) ";
					sql+="WHERE ROWNUM <= ?) ";
					sql+="WHERE rnum > ?";
					pstmt=con.prepareStatement(sql);
					
					// ? 해결
					// ROWNUM 값: 페이지번호*한 페이지에 보여줄 목록 개수
					// RNUM 값: (페이지번호-1)*한 페이지에 보여줄 목록 개수
					
					pstmt.setInt(1, start);
					pstmt.setInt(2, end);
				}else {
					// 특정 검색어 리스트 조회
					// sql="select bno, title, name, regdate, cnt, re_lev from board ";
				    // sql+="where "+pageDto.getCriteria()+" like ? order by re_ref desc, re_seq asc";
					sql="SELECT * ";
					sql+="FROM (SELECT ROWNUM rnum, BNO, TITLE, name, regdate, cnt, re_lev ";
					sql+="FROM (SELECT BNO, TITLE, name, regdate, cnt, re_lev ";
					sql+="FROM BOARD where "+pageDto.getCriteria()+" like ? ";
					sql+="ORDER BY RE_REF DESC, RE_SEQ ASC) ";
					sql+="WHERE ROWNUM <= ?) ";
					sql+="WHERE rnum > ?";
					
					pstmt=con.prepareStatement(sql);
					pstmt.setString(1, "%"+pageDto.getKeyword()+"%");
					pstmt.setInt(2, start);
					pstmt.setInt(3, end);
				}
				
				rs=pstmt.executeQuery();				
				while(rs.next()) {
					BoardDTO dto = new BoardDTO();
					dto.setBno(rs.getInt("bno"));
					dto.setTitle(rs.getString("title"));
					dto.setName(rs.getString("name"));
					dto.setRegDate(rs.getDate("regdate"));
					dto.setCnt(rs.getInt("cnt"));
					dto.setReLev(rs.getInt("re_lev"));
					
					list.add(dto);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(con, pstmt, rs);
			}
			return list;
		}
		
		// 전체 게시물 개수 세기
		// select count(*) from board;
		public int totalRows(PageDTO pageDto) {
			int total=0;
		
			try {
				con=getConnection();
				String sql="";
				
				if (pageDto.getKeyword().isEmpty() && pageDto.getCriteria().isEmpty()) {
					sql="select count(*) from board";
					pstmt=con.prepareStatement(sql);
				} else {
					sql="select count(*) from board where "+ pageDto.getCriteria() +" like ?";
					pstmt=con.prepareStatement(sql);
					pstmt.setString(1, "%"+pageDto.getKeyword()+"%");
				}
				rs=pstmt.executeQuery();
				if(rs.next()) {
					total=rs.getInt(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(con, pstmt, rs);
			}
			return total;
		}
		
		// 게시글 하나 조회
		public BoardDTO getRow(int bno) {
			BoardDTO dto=null;
			
			try {
				con=getConnection();
				String sql="select bno, name, title, content, attach, re_ref, re_lev, re_seq from board where bno=?";
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1, bno);
				rs=pstmt.executeQuery();
				
				if(rs.next()) {
					dto=new BoardDTO();
					dto.setBno(rs.getInt("bno"));
					dto.setName(rs.getString("name"));
					dto.setTitle(rs.getString("title"));
					dto.setContent(rs.getString("content"));
					dto.setAttach(rs.getString("attach"));
					dto.setReRef(rs.getInt("re_ref"));
					dto.setReLev(rs.getInt("re_lev"));
					dto.setReSeq(rs.getInt("re_seq"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(con, pstmt, rs);
			}
			return dto;
		}
		
		// 조회수 증가
		public boolean readCnt(int bno) {
			boolean flag=false;
			try {
				con=getConnection();
				
				String sql="update board set cnt=cnt+1 where bno=?";
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1, bno);
			
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
		
		// 수정 업데이트: title, content, attach(옵션)
		public boolean updateArticle(BoardDTO updateDto) {
			boolean flag=false;
			String sql=null;
			
			try {
				con=getConnection();
				if(updateDto.getAttach()==null) {
					sql = "update board set title = ?, content = ? where bno=? and password=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, updateDto.getTitle());
					pstmt.setString(2, updateDto.getContent());
					pstmt.setInt(3, updateDto.getBno());
					pstmt.setString(4, updateDto.getPassword());
				} else {
					sql = "update board set title = ?, content = ?, attach = ? where bno=? and password=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, updateDto.getTitle());
					pstmt.setString(2, updateDto.getContent());
					pstmt.setString(3, updateDto.getAttach());
					pstmt.setInt(4, updateDto.getBno());
					pstmt.setString(5, updateDto.getPassword());
				}
			
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
		
		// 삭제
		public boolean deleteArticle(int bno, String password) {
			boolean flag=false;
			
			try {
				con=getConnection();
				String sql = "delete from board where bno=? and password=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, bno);
				pstmt.setString(2, password);
	
				int result = pstmt.executeUpdate();
				
				if(result>0) {
					flag=true;
					commit(con);
				}
			} catch (Exception e) {
				rollback(con);
				e.printStackTrace();
			} finally {
				close(con, pstmt);
			}
			return flag;
		}
		
		// 답변
		public boolean reply(BoardDTO updateDto) {
			boolean flag = false;
			
			try {
				con=getConnection();
//				String sql = "UPDATE BOARD SET RE_SEQ=RE_SEQ+1 WHERE RE_REF=부모의 re_ref AND RE_SEQ>부모의 re_seq;";
				String sql = "UPDATE BOARD SET RE_SEQ=RE_SEQ+1 WHERE RE_REF=? AND RE_SEQ>?";
				// 부모값 가져오기
				int reRef=updateDto.getReRef();
				int reLev=updateDto.getReLev();
				int reSeq=updateDto.getReSeq();
				
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, reRef);
				pstmt.setInt(2, reSeq);
	
				pstmt.executeUpdate();
				
				sql="INSERT INTO BOARD(BNO, NAME, PASSWORD, TITLE, CONTENT, ATTACH, RE_REF, RE_LEV, RE_SEQ) ";
				sql+="VALUES(board_seq.nextval,?,?,?,?,?,?,?,?)";
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, updateDto.getName());
				pstmt.setString(2, updateDto.getPassword());
				pstmt.setString(3, updateDto.getTitle());
				pstmt.setString(4, updateDto.getContent());
				pstmt.setString(5, updateDto.getAttach());
				pstmt.setInt(6, reRef);
				pstmt.setInt(7, reLev+1);
				pstmt.setInt(8, reSeq+1);
				
				int result=pstmt.executeUpdate();
				if(result>0) {
					flag=true;
					commit(con);
				}
			} catch (Exception e) {
				rollback(con);
				e.printStackTrace();
			} finally {
				close(con, pstmt);
			}
			return flag;
		}
		
		// 검색
		public List<BoardDTO> searchRows(String criteria, String keyword) {
			List<BoardDTO> list=new ArrayList<>();
			
			try {
				con=getConnection();
				
				String sql="select bno, title, name, regdate, cnt, re_lev from board ";
			    sql+="where "+criteria+" like ? order by re_ref desc, re_seq asc";
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, "%"+keyword+"%");
	
				rs=pstmt.executeQuery();
				while(rs.next()) {
					BoardDTO dto=new BoardDTO();
					dto.setBno(rs.getInt("bno"));
					dto.setTitle(rs.getString("title"));
					dto.setName(rs.getString("name"));
					dto.setRegDate(rs.getDate("regdate"));
					dto.setCnt(rs.getInt("cnt"));
					dto.setReLev(rs.getInt("re_lev"));
					
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
