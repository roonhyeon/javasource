<%@page import="user.persistence.UserDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("utf-8");

    // form 내용 가져오기
    // update usertbl set addr=?, mobile=? where no=?
    // update usertbl set addr=? where no=?
    // update usertbl set mobile=? where no=?
    // update 성공 시 페이지 이동 get.jsp?no=
    String addr=request.getParameter("newaddr");
    String mobile=request.getParameter("newmobile");
    int no=Integer.parseInt(request.getParameter("no"));

    UserDAO dao = new UserDAO();
    
        String path="";
        // update 성공 시 페이지 이동
        if(dao.update(addr, mobile, no)){
            path="getPro.jsp?no="+no;
        }else{
        	path="modifyPro.jsp?no="+no;
        }
        response.sendRedirect(path);
%>