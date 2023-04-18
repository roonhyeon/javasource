<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello.jsp</title>
</head>
<body>
<!-- JSP: Java Server Page => html 작성하기 편하게 되어있다. 자바 코드를 사용할 수 있다. 
          http://localhost:8080/web1/basic/hello.html
          http://localhost:8080 : 도메인명 
          localhost == 내 컴퓨터 
          8080 포트번호는 변경 가능
          /web1: 프로젝트 명
          /basic: webapp 폴더 아래에 생성한 폴더 명 
          hello.html: 실제 파일 명 
          
          프로젝트 명 제거: http://localhost:8080/basic/hello.html -->
 <%
    // 자바 코드 작성하기
    // HttpServletRequest request: 사용자의 요청 가져오기
    // form method를 post로 하면 데이터를 가져올 때 한글은 깨진다. 그러나 get으로 하면 안 깨진다. 그리고 입력값이 주소줄을 따라가서 주소창에 나타난다.
    request.setCharacterEncoding("utf-8"); // post로 해도 이렇게 데이터를 가져오기 전에 제일 먼저 코딩해주면 한글이 안 깨진다.
 %>
 <h3>이름</h3>
 <%=request.getParameter("name") %>
 <%=request.getParameter("age") %>
 
</body>
</html>