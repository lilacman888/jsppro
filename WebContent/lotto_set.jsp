<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<%@ page import="java.util.TreeSet" %>

<!-- 
TreeSet
1. 중복된 데이터를 저장하지 못한다.
2. 오름차순으로 정렬 해준다.
 -->

<%
int n;
//Set s = new HashSet();
TreeSet s = new TreeSet();

Random r = new Random();		

while(true){
	n = r.nextInt(45)+1; 			// 1 ~ 45 난수 발생
	s.add(n);
	if(s.size() == 6){
		out.println(s);
		break;
	}
}

%>    