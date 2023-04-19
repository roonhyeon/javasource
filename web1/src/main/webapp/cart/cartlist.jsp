<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cartlist.jsp</title>
</head>
<body>
<%
    // 장바구니에 담은 자동차 정보 보여주기
    
    // 다른 자동차를 선택할 수 있도록 cart.html로 이동할 수 있는 페이지 제공
    // 장바구니 목록 제거하기
    session.invalidate();
%>
<h3>장바구니 목록</h3>

<h4><a href="cart.html">상품 선택</a></h4>
<h4><a href="cartdel.jsp"></a>장바구니 비우기</h4>
</body>
</html>