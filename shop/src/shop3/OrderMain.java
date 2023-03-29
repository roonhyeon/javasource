package shop3;

public class OrderMain {

	public static void main(String[] args) {
		
		//OrderDTO 사용하기
	    OrderDTO dto=new OrderDTO();
	    
	    //property(멤버변수: orderId, userId, productId, orderDate)of OrderDTO에 값 세팅하는 법: 1. 생성자 사용, 2. setter 메서드 사용
	    dto.setOrderId(1000);
	    
	    //포함관계일 때 세팅하는 법
	    //방법 1
	    dto.setUserDTO(new UserDTO(100, "hong",1,"card")); //가로 내부 요소는 원래 UserDTO에 맞게 순서대로 넣어주어야 한다.
	    //방법 2
	    UserDTO userDTO=new UserDTO();
	    userDTO.setUserId(100);
	    userDTO.setName("hong");
	    userDTO.setPayNo(1);
	    userDTO.setType("card");
	    dto.setUserDTO(userDTO);
	    
	    
	    //property 값 조회
	    System.out.println(dto.getOrderId());
	    
	    //포함관계일 때 조회하는 법
	    //방법 1
	    System.out.println(dto.getUserDTO().getName()); //위에서 객체 생성을 해주고 이렇게 한번 더 타고 들어오면 "hong"을 불러낼 수 있다.
	    //방법 2
	    UserDTO getUser=dto.getUserDTO();
	    System.out.println(getUser.getName());
	    System.out.println(getUser.getType());
	    
	    
	    
	    
	}

}
