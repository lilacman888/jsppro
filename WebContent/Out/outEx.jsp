<%@ page contentType="text/html;charset=euc-kr" buffer="8kb"%>

<%
	int totalBuffer = out.getBufferSize();
	int remainBuffer = out.getRemaining();
	int useBuffer = totalBuffer - remainBuffer;
%>

��� Buffer�� ��ü ũ�� : <%=totalBuffer%>byte<p>
���� Buffer�� ��뷮 : <%=useBuffer%>byte<p>
���� Buffer�� ũ�� : <%=remainBuffer%>byte<p>