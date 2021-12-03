package pj.webt5.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pj.webt5.model.UserModel;
import pj.webt5.service.UserService;
import pj.webt5.service.impl.UserServiceImpl;

@WebServlet(urlPatterns = {"/editprofile"})
public class ShowEditProfileController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("usid"));
		UserService sv = new UserServiceImpl();
		UserModel user = sv.getbyid(id);
		RequestDispatcher dispatcher = req.getRequestDispatcher("editprofile.tiles");
		req.setAttribute("user", user);
		dispatcher.forward(req, resp);
	}
	
	
}
