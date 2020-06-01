<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String str = "jsptest";

	request.setAttribute("strname", str);
%> 

str1 = <%=str %> <br>        <!-- str1 = jsptest -->
 
str2 = ${str } <br>          <!-- str2 =  -->

str3 = ${strname } <br>      <!-- str3 = jsptest -->