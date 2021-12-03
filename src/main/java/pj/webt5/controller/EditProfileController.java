package pj.webt5.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pj.webt5.model.UserModel;
import pj.webt5.service.UserService;
import pj.webt5.service.impl.UserServiceImpl;

@WebServlet(urlPatterns = {"/saveprofile"})
public class EditProfileController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    Date date = new Date();  
	long time = date.getTime();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("pid"));
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String createdate = req.getParameter("createdate");
		String phone = req.getParameter("phone");
		String des = req.getParameter("description");
		
		UserModel con = new UserModel(id, firstname, lastname,username,password, phone, email, des, createdate, formatter.format(date));
		UserService service = new UserServiceImpl();
		service.update(con);
		resp.sendRedirect("content");
	}

}
