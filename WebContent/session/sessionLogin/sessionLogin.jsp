<%@ page contentType = "text/html; charset=utf-8" %>

<%
	request.setCharacterEncoding("utf-8");

    String id = request.getParameter("id").trim();
    String password = request.getParameter("password").trim();
    System.out.println("password:"+password);
    
    if (id.equals(password)) {				// ID, 비밀번호가 일치되면 로그인 성공
        session.setAttribute("MEMBERID", id); // 세션 설정
%>

		<html>
			<head><title>로그인성공</title></head>
			<body>

				로그인에 성공했습니다. <br>
				
				<a href="sessionLoginCheck.jsp">회원정보 확인</a> <br>
				
				<a href="sessionLogout.jsp">로그아웃</a> <br>					

			</body>
		</html>

<%
    } else { // 로그인 실패시
%>

		<script>
			alert("로그인에 실패하였습니다.");
			history.back();
/* 			history.go(-1); */
		</script>
<%
    }
%>
