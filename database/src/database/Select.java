package database;

//Java에서 DB 서버에 접속하기
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null; //sql 전달
		ResultSet rs=null; //sql(select)  결과 저장		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			
			con= DriverManager.getConnection(url,user,password); //con에 연결 던져준다.
			
			if (con!=null) {
				System.out.println("연결되었습니다.");
			}
			
			//emp 테이블에 있는 내용 가져오기(sql developer의 select * from emp; 구문 말하는 거 맞음)
//			String sql="select * from emp"; //전체 다 불러오기
			String sql="select * from emp where deptno=20"; //부서번호 20번만 불러오기
			
			pstmt=con.prepareStatement(sql); //서버로 sql 구문 전송
			rs=pstmt.executeQuery(); //전송된 sql 구문 실행 후 결과를 ResultSet 객체(테이블 형태)에 담는다.
			
			//ResultSet 객체 안에 반복문을 통해 한 행씩 읽어오면서 화면 출력
			//rs.next(): ResultSet 객체 안에 읽어올 내용이 존재한다면 true를 돌려주는 것이고, 없으면 false로 알아서 반복문이 종료된다.
			while (rs.next()) {
				//불러오는 타입은 String은 모든 타입을 불러올 수 있고, Int는 Int만 가져올 수 있다.
				System.out.print(rs.getInt(1)+"\t"); //1번에 empno가 있어서 number 타입이므로 Integer 타입으로 불러온다. getInt(열번호) 또는 getInt(열이름)
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getInt("mgr")+"\t");
				System.out.print(rs.getDate(5)+"\t"); //Date를 불러올 때는 getDate(), getString() 모두 사용이 가능하지만 getDate()를 쓰면 시, 분, 초가 사라진다.
				System.out.print(rs.getInt(6)+"\t");
				System.out.print(rs.getInt(7)+"\t");
				System.out.println(rs.getInt("deptno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
