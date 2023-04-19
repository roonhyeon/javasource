<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%> <!-- 에러가 나면 error.jsp로 가거라 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>directive2.jsp</title>
</head>
<body>
<%
    int a=1, b=0;
%>
<p>a+b = <%=a+b %></p>
<p>a-b = <%=a-b %></p>
<p>a*b = <%=a*b %></p>
<p>a/b = <%=a/b %></p>
</body>
</html>