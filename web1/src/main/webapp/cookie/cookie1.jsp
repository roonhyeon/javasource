<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie1.jsp</title>
</head>
<body>
<%-- 
    <세션과 쿠키>
    1. 세션: 서버 쪽에 저장(객체 상태로 저장 가능)
    2. 쿠키: 클라이언트 쪽에 저장(객체로 저장 불가), 하나의 서버 당 저장할 수 있는 용량이 한정되어 있다.
    
    <웹 스토리지: 브라우저에 저장(자바스크립트에서 할 수 있다.), 영구 저장이 가능, 쿠키보다는 더 큰 데이터를 저장 가능>
    1. 로컬 스토리지
    2. 세션 스토리지
 --%>
 <%  // 서버에서 클라이언트에게 응답할 때 특정 값을 붙여서 보낸다.
     response.addCookie(new Cookie("name","John"));
     response.addCookie(new Cookie("gender","Male"));
     response.addCookie(new Cookie("age","30"));
     response.addCookie(new Cookie("addr","Seoul"));
 %>
 <h3>쿠키 데이터가 저장되었습니다.</h3>
 <a href="getCookie1.jsp">쿠키 확인하러 가기</a>
</body>
</html>