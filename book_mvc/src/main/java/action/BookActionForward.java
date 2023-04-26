package action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class BookActionForward {
	// 이동 방식, 페이지 지정
	private boolean isRedirect;
	private String path;

}
