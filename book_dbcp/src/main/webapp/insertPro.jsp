<%@ page import="book.domain.BookDTO"%>
<%@ page import="book.persistence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("utf-8");    

    // insert.jsp에서 사용자 입력값 가져오기
    int code=Integer.parseInt(request.getParameter("code"));
    String title=request.getParameter("title");
    String writer=request.getParameter("writer");
    int price=Integer.parseInt(request.getParameter("price"));
    String description=request.getParameter("description");
    
    BookDTO insertDto=new BookDTO(code,title,writer,price,description);
    
    // insertDto.setTitle(request.getParameter("title")); => 이런 식으로 쭉 작성해줘도 된다.
    
    // db 작업
    BookDAO dao=new BookDAO();
    // 페이지 이동 => 목록
    if(dao.insert(insertDto)){
    	response.sendRedirect("listPro.jsp");
    }else{
    	response.sendRedirect("insert.jsp");
    }
%>