<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
    jsp 지시어: <%@ ~~~~~ %>
    1. page
    1) language 2) contentType 3) pageEncoding 4) import 
    5) isErrorPage/errorPage 
    => isErrorPage="false"로 설정되어 있음: 에러가 났을 때 보여줄 페이지로 설정하려면 "true"로 변경,
       errorPage="에러가 났을 때 보여줄 페이지 지정" => 이 둘은 짝꿍이다.
    2. include: 페이지를 따로 생성한 후 하나로 합쳐서 서비스한다. 페이지를 모두 합친 후에 컴파일을 한다. 
                =>_jspService() 메소드 안에 선언이 되기 때문에 중복된 변수명은 사용할 수 없다.
    3. taglib
    
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>directive1.jsp</title>
</head>
<body>
<%
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date d = new Date();
%>
<%=sdf.format(d) %>
</body>
</html>