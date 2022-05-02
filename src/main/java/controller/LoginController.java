package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.LoginDTO;
import domain.LoginVO;
import service.LoginServiceImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/Login")
//홈페이지 상단에 주소창. 중복되면 서버는 실행되지 않는다.
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//페이지를 띄워주는 것 
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 한글 깨짐 방지

		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");

		LoginDTO dto = new LoginDTO();
		dto.setUid(uid);
		dto.setUpw(upw);

		LoginServiceImpl service = new LoginServiceImpl();
		LoginVO vo = service.read(dto);

		if (vo != null) {
			// true이면 세션생성 및 마이페이지로 이동
			HttpSession session = request.getSession();
			
			session.setAttribute("sessId", vo.getUid());
			session.setAttribute("sessName", vo.getUname());
			session.setAttribute("sessSchName", vo.getSchoolname());
			
			response.sendRedirect("Mypage");
			
		} else {
			// false이면 로그인 페이지로 이동
			response.sendRedirect("Login");
		}
	}

}
