package pj.webt5.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pj.webt5.model.UserModel;
import pj.webt5.service.UserService;
import pj.webt5.service.impl.UserServiceImpl;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/login" })
public class LoginController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session != null && session.getAttribute("account") != null) {
			resp.sendRedirect(req.getContextPath()+"/waiting");
			return;
		}
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("email")) {
					session = req.getSession(true);
					session.setAttribute("email", cookie.getValue());
					resp.sendRedirect(req.getContextPath()+"/waiting");
					return;
				}
				if(cookie.getName().equals("password")) {
					session = req.getSession(true);
					session.setAttribute("password", cookie.getValue());
					resp.sendRedirect(req.getContextPath()+"/waiting");
					return;
				}
			}
		}
		req.getRequestDispatcher("/view/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		UserService service = new UserServiceImpl();
		UserModel account =service.login(email, password);
		String alertMsg ="";
		boolean isRememberMe = false;
		if(req.getParameter("remember") != null) {
			isRememberMe = true;
		}
		if(account != null) {
			HttpSession session = req.getSession();
			int id = service.getUserid(email, password);
			session.setAttribute("id", id);
			session.setAttribute("account", account);
			
			if(isRememberMe == true) {
				Cookie c = new Cookie("email", email);
				Cookie c1 = new Cookie("password", password);
				c.setMaxAge(60*60*24);
				c1.setMaxAge(60*60*24);
				resp.addCookie(c);
				resp.addCookie(c1);
			}
			resp.sendRedirect("waiting");
		}else {
			alertMsg ="Email or password is wrong";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/view/login.jsp").forward(req, resp);
		}
		
	}
	
}
