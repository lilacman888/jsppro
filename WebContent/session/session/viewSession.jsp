<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="java.util.*" %>

<html>
	<head><title>���� ��� ����</title></head>
	<body>

<%
	// Enumeration attr = "id" , "passwd"
	/* Enumeration attr = session.getAttributeNames();

	while(	attr.hasMoreElements()	){
		String attrName = (String)attr.nextElement();
		String attrValue = (String)session.getAttribute(attrName);
		out.println("������ �Ӽ����� " + attrName + " �̰� ");
		out.println("������ �Ӽ����� " + attrValue + "�̴�.<br><br>");
	}  */
%>

id �Ӽ��� : <%=session.getAttribute("id") %> <br>
passwd �Ӽ��� : <%=session.getAttribute("passwd") %> <br>

	</body>
</html>
