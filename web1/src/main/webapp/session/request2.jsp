<%@ page import="user.domain.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request2.jsp</title>
</head>
<body>
    <h2>request2</h2>
    <%=session.getAttribute("name") %> <!-- request1.jsp에서 session을 정의해준 덕분에 name.html에서 입력한 name 값이 여기까지 잘 날라오고 있다. -->
    <%-- request1.jsp이 받은 name을 사용하고 싶다: HttpSession 객체 사용 
         => 값을 담아올 수 있는 곳에서 이걸 정의해주어야 한다. 즉 여기가 아니라 request1.jsp에서 정의해야 한다.
         1) 사용할 값을 담는다: setAttribute("키", 담아놓을 값)
         2) 필요한 페이지에서 꺼내쓴다: getAttribute("키")
    --%>
    <%
        // LoginDTO loginDTO = (LoginDTO)session.getAttribute("loginDTO");
    
        // EL(Expression Language): jsp에서 데이터를 추출하는 표현식, setAttribute()에 담아놓은 값을 쉽게 찾아다 쓸 수 있다. => ${이름.변수명}
    %>
    
    <h3>로그인 정보</h3>
    <ul>
       <!-- <li>아이디: <%-- <%=session.getAttribute("id") %> --%> </li> 
       <li>비밀번호: <%-- <%=session.getAttribute("pwd") %> --%> </li> -->
       <%-- <li>아이디: <%=loginDTO.getUserId() %></li>
       <li>비밀번호: <%=loginDTO.getPassword() %></li> --%>
       <li>아이디: ${loginDTO.userId}</li>
       <li>비밀번호: ${loginDTO.password}</li>
    </ul>
    
</body>
</html>