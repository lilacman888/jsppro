<%@ page contentType="text/html;charset=euc-kr" %>

<%@ page import="beans.LoginBean"%>
<%
	LoginBean login0 = new LoginBean();
%>
<jsp:useBean id="login" class="beans.LoginBean" />

<jsp:setProperty name="login" property="*" />

<HTML>
	<HEAD><TITLE> �α��� ���� </TITLE></HEAD>
<BODY>
<center>
<H2>�α��� ����</H2>
<HR>

<% 
	if(!login.checkUser()) {
		out.println("�α��� ���� !!");	
	}else {
		out.println("�α��� ���� !!");
	}
%>

<HR>
����� ���̵� : <jsp:getProperty name="login"  property="userid" /><BR>
����� �н����� : <jsp:getProperty name="login" property="passwd" />
</BODY>
</HTML>


