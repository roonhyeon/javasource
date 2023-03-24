package database2;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @ToString
@Getter @Setter @NoArgsConstructor//lombok이 간단하게 getter,setter, 생성자를 만들어준다. 더이상 우클릭하고 생성 일일히 안해줘도 된다.
public class EmpDTO {
	
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
}
