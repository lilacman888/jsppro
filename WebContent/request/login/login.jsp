<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// post방식으로 한글값이 value값으로 전송될때 한글 인코딩 시켜주는 역할
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");

%>    
    
ID : <%=id %> <br>
비밀번호 : <%=passwd %>    