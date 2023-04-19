<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%> <!-- 여기는 에러가 발생했을 때만 실행되는 페이지얌 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error.jsp</title>
</head>
<body>
    <p>에러가 발생했습니다. 잠시 후 접속해주세요.</p>
    <!-- e.printStackTrace() or e.getMessage()와 같은 개념. 이건 exception으로 변수명이 정해져 있다. -->
    <p><%=exception.getMessage() %></p>
</body>
</html>