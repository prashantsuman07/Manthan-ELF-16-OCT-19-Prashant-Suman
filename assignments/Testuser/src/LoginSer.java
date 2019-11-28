import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginSer extends HttpServlet {
	Testdao dao=new Testdaoimpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("uname");
		String pswd=req.getParameter("pswd");
		
		TestBean testBean=dao.login(username, pswd);
		if (testBean != null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("testbean",testBean);
			req.getRequestDispatcher("./homepage").forward(req, resp);
			
		}
		else {
			req.setAttribute("msg", "Invalid Credentials!!!!");
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}
	}
}
