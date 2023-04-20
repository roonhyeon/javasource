<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cartadd.jsp</title>
</head>
<body>
<%
    // cart.html에서 사용자가 선택한 자동차 가져오기
    String product=request.getParameter("product");

    // session에 ArrayList 사용
    // 자동차를 추가하기 전에 이미 생성된 List session이 존재하는지 확인
    ArrayList<String> products = (ArrayList<String>)session.getAttribute("products");
    
    // 존재하지 않는다면 새로운 List를 만들어서 session에 추가
    if(products == null){
    	products = new ArrayList<>();
    	products.add(product);
    	session.setAttribute("products", products);
    }else{
    	// 존재한다면 해당 session에 선택한 자동차 추가
    	products.add(product);
    }
    
    // 가져온 자동차 정보를 session에 저장 => 장바구니
    // session.setAttribute("product", product);
%>
    <h3>장바구니 저장</h3>
    <h4><a href="cartlist.jsp">장바구니 보기</a></h4>
</body>
</html>