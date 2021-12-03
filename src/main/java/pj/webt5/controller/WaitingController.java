package pj.webt5.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pj.webt5.model.UserModel;

@WebServlet(urlPatterns = { "/waiting" })
public class WaitingController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if (session != null && session.getAttribute("account") != null) {
			UserModel user = (UserModel) session.getAttribute("account");
			int id = (int)session.getAttribute("id");
			if (user.getFirstname() != null) {
				resp.sendRedirect("content");
			} else {
				resp.sendRedirect("editprofile?usid="+id);
				
			}
		}
	}

}