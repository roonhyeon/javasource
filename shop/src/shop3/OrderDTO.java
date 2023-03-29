package shop3;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class OrderDTO {
	
	private int orderId;
	private int userId;
	private int productId;
	private Date orderDate;
	
	//orderDAO에서 2번을 실행해주기 위해 선언
	//포함관계
	private UserDTO userDTO;
	private ProductDTO productDTO;

}
