<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // 사용자를 위한 페이지가 아니다 => 개발자를 위한 페이지
    // 백엔드 작업
    
    request.setCharacterEncoding("utf-8");
    
    // form에서 데이터 가져오기
    String name = request.getParameter("name");
    String birthYear = request.getParameter("birthYear");
    String addr = request.getParameter("addr");
    String mobile = request.getParameter("mobile");
    
    // DB에 insert 작업
    Class.forName("oracle.jdbc.OracleDriver");
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "javadb";
    String password = "12345";
    Connection con = DriverManager.getConnection(url, user, password);
    
    String sql = "INSERT INTO USERTBL(NO, USERNAME, BIRTHYEAR, ADDR, MOBILE) ";
    sql += "VALUES(USER_SEQ.NEXTVAL, ?,?,?,?)";
    PreparedStatement pstmt = con.prepareStatement(sql);
    
    // ? 해결
    pstmt.setString(1, name);
    pstmt.setInt(2, Integer.parseInt(birthYear));
    pstmt.setString(3, addr);
    pstmt.setString(4, mobile);
    
    // executeUpdate(): insert, update, delete와 같은 DML 구문 실행
    int count = pstmt.executeUpdate();
    
    // 페이지 이동(사용자가 볼 수 있는 페이지로 이동)
    String path = "";
    if(count > 0){
    	path = "list.jsp"; // insert 성공 시
    }else{
    	path = "insert.jsp"; // insert 실패 시
    }
    response.sendRedirect(path);
%>