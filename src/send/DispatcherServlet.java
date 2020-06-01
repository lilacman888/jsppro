package send;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// request 객체로 공유 설정
		request.setAttribute("request","requestValue");
		
		// Dispatcher방식 포워딩
		// 1. 포워딩된 페이지에서는  request 객체로 공유한 값을 사용할 수 있다.
		// 2. 포워딩이 되더라도 URL주소가 변경되지 않는다.
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("./servlet/ex777/dispatcher.jsp");
		dispatcher.forward(request, response);
	
	}

}
