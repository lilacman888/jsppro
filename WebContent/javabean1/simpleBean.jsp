<%@ page contentType="text/html; charset=utf-8" %>
<% request.setCharacterEncoding("utf-8");%>

<%@ page import="javaBean.SimpleBean" %>
<%
//	SimpleBean sb1 = new SimpleBean();
//	sb1.msg = "hi";
%>
<!-- 자바빈 클래스(SimpleBean)로  객체를 생성하는 역할 -->
<jsp:useBean id="sb" class="javaBean.SimpleBean" />


<%
//	sb.setMsg(request.getParameter("msg"));
%>
<!-- 폼에서 넘어온 값을 setMsg()메소드의 매개변수로 msg 프로퍼티에 값을 전달하는 역할  -->
<%-- <jsp:setProperty name="sb" property="msg" />
<jsp:setProperty property="name" name="sb"/> --%>
<jsp:setProperty property="*" name="sb"/>

<html>
	<body>

	<h1>간단한 자바빈 프로그래밍</h1>
	<br>
       이름 : <%=sb.getName() %> <br>
	메세지 : <%=sb.getMsg() %>
	<%-- 이름: <jsp:getProperty name="sb1" property="name" /> --%> <br>
	<%-- 메시지: <jsp:getProperty name="sb1" property="msg" /> --%>

	</body>
</html>


