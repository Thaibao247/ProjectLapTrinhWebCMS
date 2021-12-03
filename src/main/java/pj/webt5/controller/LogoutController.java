package pj.webt5.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/logout" })
public class LogoutController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.removeAttribute("account");
		session.removeAttribute("id");
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie ck : cookies) {
				if (ck.getName().equals("email")) {
					ck.setMaxAge(0);
					resp.addCookie(ck);
				}
				if (ck.getName().equals("password")) {
					ck.setMaxAge(0);
					resp.addCookie(ck);
				}
			}
		}
		req.getRequestDispatcher("/view/login.jsp").forward(req, resp);

	}
}
