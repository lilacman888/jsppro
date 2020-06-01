<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.sql.Timestamp" %>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.*, java.sql.*" %>

<%
	// 날짜 시간 관련 클래스
	//1. Date 클래스
 	Date d = new Date();
//	java.util.Date d = new java.util.Date();

    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");

	// 2. Timestamp 클래스
	Timestamp  t = new Timestamp(System.currentTimeMillis());

    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>   
현재시간1 : <%=d %> <br> 
현재시간2 : <%=sd.format(d) %>요일 <br> 
현재시간3 : <%=t %> <br> 
현재시간4 : <%=sf.format(t) %> <br> 




