package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class ChangeDTO {
	private String userid;
	private String currentPassword;
	private String newPassword;
	private String confirmPassword;

}
