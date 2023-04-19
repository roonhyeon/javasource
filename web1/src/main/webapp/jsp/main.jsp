<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
    <!-- include 지시어 -->
    <%@ include file="header.jsp" %>
    <main>
        <%
            // int age = 10; // 변수명 중복으로 500 에러 발생
            // out.print(age);
        %>
        <h3>main 영역</h3>
    </main>
    <%@ include file="footer.jsp" %>
</body>
</html>