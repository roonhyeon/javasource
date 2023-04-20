<%@page import="user.domain.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
<% 
    String userId = request.getParameter("userid");
    String password = request.getParameter("password");
    
    // session에 값을 담을 때 1. 개별로 담는 형태
    // session.setAttribute("id", userId);
    // session.setAttribute("pwd", password);
    
    // 2. DTO 객체를 사용해서 담는 형태: 여러 개를 같이 돌려야 하면 이 방법이 한꺼번에 담을 수 있어서 더 편리하다.
    // LoginDTO loginDTO = new LoginDTO(userId, password);
    // session.setAttribute("loginDTO", loginDTO);
    
    session.setAttribute("loginDTO", new LoginDTO(userId, password)); // 한줄로 작성하는 방법
%>
<h4>아이디: <%=userId %></h4>
<h4>비밀번호: <%=password %></h4>
<h4><a href="request2.jsp">이동</a></h4>
</body>
</html>