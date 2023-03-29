package shop3;

import static shop3.JdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//JdbcUtil 클래스: 드라이버로드, 커넥션, 자원해제 하나의 클래스에 정의

public class OrderDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//C(insert)R(select)U(update)D(delete) 메서드 작성
	//1. 장바구니에 상품 추가 => sorder 사용
	public boolean insert(int userId, int productId) {
		boolean status=false;
		
		try {
			con=getConnection();
		
			String sql="INSERT INTO sorder(order_id, user_id, product_id, order_date) VALUES(order_seq.nextval, ?, ?, sysdate)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setInt(2, productId);
			
			int result=pstmt.executeUpdate();
			
			if(result>0) status=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return status;
	}
	
	//2. 장바구니 조회-특정 회원
	public List<OrderDTO> carts(int userId){
		List<OrderDTO> list=new ArrayList<>();
		
		try {
			con=getConnection();
			
			String sql="SELECT O.USER_ID, S.NAME, T.INFO, P.PRODUCT_ID, P.PNAME, P.PRICE, P.CONTENT, O.ORDER_DATE "
					+ "FROM SORDER O, SUSER S, PAYTYPE T, PRODUCT P "
					+ "WHERE O.USER_ID=S.USER_ID AND O.PRODUCT_ID=P.PRODUCT_ID AND S.PAY_NO=T.PAY_NO AND O.USER_ID=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			rs=pstmt.executeQuery();
			
			//ResultSet의 결과값: user_id, name, info, product_id, pname, price, content, order_date => OrderDTO에 담기
			//UserDTO: user_id, name, info
			//Product: product_id, pname, price, content
			//         order_date
			while(rs.next()) {
				UserDTO userDTO=new UserDTO();
			    userDTO.setUserId(rs.getInt(1));
			    userDTO.setName(rs.getString(2));
			    userDTO.setType(rs.getString(3));
			    
			    ProductDTO productDTO=new ProductDTO();
			    productDTO.setProductId(rs.getInt(4));
			    productDTO.setPname(rs.getString(5));
			    productDTO.setPrice(rs.getInt(6));
			    productDTO.setContent(rs.getString(7));
			    
			    OrderDTO orderDTO=new OrderDTO();
			    orderDTO.setUserDTO(userDTO);
			    orderDTO.setProductDTO(productDTO);
			    orderDTO.setOrderDate(rs.getDate(8));
			    
			    list.add(orderDTO);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}

}
