<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // cookie2에서 사용자가 선택한 값(language)을 쿠키에 저장한 후 응답 헤더에 쿠키 붙여서 보내기
    Cookie cookie = new Cookie("language", request.getParameter("language"));
    // 쿠키 만료 시간(만료 시간을 지정하지 않으면 세션과 같은 개념이 된다.)
    cookie.setMaxAge(60*60*24);
    // 사용자한테 응답 시 쿠키를 붙여서 같이 전송
    response.addCookie(cookie);
    response.sendRedirect("cookie2.jsp");
%>