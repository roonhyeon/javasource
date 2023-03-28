package shop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//생성자, get/set, toString => use lombok(build path로 프로젝트에 포함하는 과정이 필요하다.)
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class UserDTO {
	
	private int userId;
	private String name;
	private int payNo;
	
}
