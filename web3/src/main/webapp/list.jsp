<%@ page import="user.domain.UserDTO"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/include/header.jsp"%>
<h1>User List</h1>
<%
    // List<UserDTO> list=(List<UserDTO>)request.getAttribute("list"); // object로 값이 담기기 때문에 형변환을 해준다.
%>
<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">이름</th>
      <th scope="col">태어난 해</th>
      <th scope="col">주소</th>
      <th scope="col">핸드폰</th>
    </tr>
  </thead>
  <tbody>
<%    
    // for(UserDTO dto: list){
%>
    <%-- <tr>
      <th scope="row"><%=dto.getNo() %></th>
      <td><a href="getPro.jsp?no=<%=dto.getNo() %> "><%=dto.getUserName() %></a></td> <!-- 얘도 마찬가지로 getAttribute가 정의되어 있는 get.jsp로 경로를 설정해주면 오류난다. -->
      <td><%=dto.getBirthYear() %></td>
      <td><%=dto.getAddr() %></td>
      <td><%=dto.getMobile() %></td>
    </tr> --%>
<%
    // }
%>
<c:forEach var="dto" items="${list}">
    <tr>
      <th scope="row">${dto.no}</th>
      <td><a href="getPro.jsp?no=${dto.no}">${dto.userName}</a></td> <!-- 얘도 마찬가지로 getAttribute가 정의되어 있는 get.jsp로 경로를 설정해주면 오류난다. -->
      <td>${dto.birthYear}</td>
      <td>${dto.addr}</td>
      <td>${dto.mobile}</td>
    </tr>
</c:forEach>
  </tbody>
</table>
<%@ include file="/include/footer.jsp"%>