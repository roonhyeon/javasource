<%@page import="book.domain.BookDTO"%>
<%@page import="java.util.List"%>
<%@page import="book.persistence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- ~~Pro면 사용자에게는 보여지지 않는 페이지 -->
<%
    // DAO 객체 생성
    BookDAO dao = new BookDAO();
    
    // 메서드 실행 후 결과 받기
    List<BookDTO> list = dao.getList();
    
    // 받은 결과를 공유
    request.setAttribute("list", list);
    pageContext.forward("list.jsp");
%>