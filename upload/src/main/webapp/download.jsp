<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // 사용자가 다운로드 받기를 원하는 파일명
    String fileName=request.getParameter("fileName");

    // 서버 폴더에 가서 사용자가 요청한 해당 파일 가져오기
    // 자바 File 처리했던 개념(ch7-FileInputEx6)
    FileInputStream fis=new FileInputStream("c:\\upload\\"+fileName);
    BufferedInputStream bis=new BufferedInputStream(fis);
    
    out.clear();
    out=pageContext.pushBody();
    
    // 브라우저에 파일 붙여서 보내기
    // uuid 값 제거: 고유값_파일명에서 _앞쪽으로 잘라내주기
    fileName=fileName.substring(fileName.indexOf("_")+1);
    // 인코딩: te st.jpg => te\\+st.jpg
    fileName=URLEncoder.encode(fileName,"utf-8").replaceAll("\\+","%20"); // 특수문자는 인식 안하는 것을 보완해주기 위해서(%20은 공백이라는 의미)
    response.setContentType("application/octet-stream"); // MIME: 이진데이터 전송방식
    response.setHeader("Content-Disposition", "attachment;filename="+fileName);
    
    BufferedOutputStream buf=new BufferedOutputStream(response.getOutputStream());
    
    int numRead=0;
    byte[] b=new byte[4896];
    while((numRead=bis.read(b))!=-1){
    	buf.write(b,0,numRead);
    }
    
    buf.flush();
    buf.close();
    bis.close();

%>