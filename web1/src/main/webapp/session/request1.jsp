<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request1.jsp</title>
</head>
<body>
    <% 
       request.setCharacterEncoding("utf-8");
       String name = request.getParameter("name");
       
       // 다른 페이지(request2.jsp)에서 사용할 수 있도록 name 값을 'session'에 담는다.
       // HttpSession session을 이미 내장 객체로 가지고 있기 때문에
       // session.setAttribute(String name, Object value); => 앞에 name은 마음대로 지정 가능
       session.setAttribute("name", name);
    %>
    <ul>
        <li>사용자 이름: <%=request.getParameter("name") %></li> <!-- getParameter는 action에 써준 페이지까지만 입력값을 가져올 수 있다. -->
    </ul>
    <a href="request2.jsp">이동</a>
</body>
</html>