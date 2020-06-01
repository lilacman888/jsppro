package send;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mutliPara
 */
@WebServlet("/multiPara")
public class multiPara extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post");
		
		response.setContentType("text/html;charset=utf-8"); 
		
		// post방식으로 한글값이 전달될때 utf-8로 인코딩 시켜주는 역할
		request.setCharacterEncoding("utf-8");
		
		// 출력 스트림 객체(out) 생성
		PrintWriter out = response.getWriter();
		
		String[] item = request.getParameterValues("item");
		
		out.println("선택된 항목<br>");
		
		for(int i=0; i<item.length; i++) {
			out.println(item[i]+"\t");
		}
		
	}

}
