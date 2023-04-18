<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>animal.jsp</title>
</head>
<body>
<%-- jsp 주석 --%>
<!-- html 주석 => f12 누르면 얘만 보임-->
<%
    request.setCharacterEncoding("utf-8");
    // String animals = request.getParameter("animal"); => getParameter는 값을 1개만 가져온다.
    String animals[] = request.getParameterValues("animal");
    
    out.print("<h3>"+Arrays.toString(animals)+"</h3>"); // 이렇게 쓰면 Arrays.toString(animals)랑 같은 역할을 하며 f12,브라우저에 출력된다.
%>
<h3><%=Arrays.toString(animals) %></h3>
</body>
</html>