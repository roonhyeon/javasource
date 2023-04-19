<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response1.jsp</title>
</head>
<body>
    <%-- 
         내장 객체
         1. HttpServletRequest request; (요청 처리)
         2. HttpServletResponse response; (응답 처리)
            response.sendRedirect("이동할 페이지명"): 페이지를 이동시킨다.
            
            http://localhost:8080/jsp/response1.jsp 요청 => http://localhost:8080/jsp/response2.jsp 응답
    --%>
    <h1>response1</h1> <!-- 이런 애들 보여지지도 않는다. -->
    <%
        response.sendRedirect("response2.jsp");
    %>
    <h1>response1</h1>
</body>
</html>