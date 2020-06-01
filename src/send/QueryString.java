package send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QueryString
 */
@WebServlet("/QueryString")
public class QueryString extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter  out = response.getWriter();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String vclass = request.getParameter("class");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		
		out.println("<html><head></head><body>");
		out.println("당신이 입력한 정보(get방식)입니다.<br>");
		out.println("아이디 :" + id +"<br>");
		out.println("비번 : " + pw + "<br>");
		out.println("이름 : " + name + "<br>");
		out.println("회원 구분 :" + vclass + "<br>");
		out.println("전화번호 : "+phone1+"-"+phone2+"-"+phone3+"<br><br>");
		
		out.println("<a href='javascript:history.go(-1)'>이전</a>");
		
		out.println("</body></html>");
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		
		request.setCharacterEncoding("utf-8");
		
		PrintWriter  out = response.getWriter();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String vclass = request.getParameter("class");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
//		System.out.println("name:"+name);
		
		out.println("<html><head></head><body>");
		out.println("당신이 입력한 정보(post방식)입니다.<br>");
		out.println("아이디 :" + id +"<br>");
		out.println("비번 : " + pw + "<br>");
		out.println("이름 : " + name + "<br>");
		out.println("회원 구분 :" + vclass + "<br>");
		out.println("전화번호 : "+phone1+"-"+phone2+"-"+phone3+"<br><br>");
		
		out.println("<a href='javascript:history.go(-1)'>이전</a>");
		
		out.println("</body></html>");
		
		QueryDTO member = new QueryDTO();
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		member.setVclass(vclass);
		member.setPhone(phone1+"-"+phone2+"-"+phone3);
		
		QueryDAO dao = QueryDAO.getInstance();
		int result = dao.insert(member);
		
		if(result == 1) {
			out.println("회원가입 성공");
		}
		
		out.close();
	}
	
	
	

}
