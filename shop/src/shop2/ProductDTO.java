package shop2;

import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
//@NoArgsConstructor //기본 생성자 필요하면 넣어주기
//@AllArgsConstructor
//@Data //이거 하나로 getter, setter, equals, canEqual, hashCode, toString, 기본 생성자 모두를 한꺼번에 만들어준다.
public class ProductDTO {
	
	private int productId;
	private String pname;
	private int price;
	private String content;

}
