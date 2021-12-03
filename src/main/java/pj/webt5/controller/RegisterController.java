package pj.webt5.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pj.webt5.dao.RegisterDao;






@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/register" })
public class RegisterController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/view/register.jsp").forward(req, resp);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		
		RegisterDao rgdao = new RegisterDao();
		String alertMsg = "";
			
							
		if(rgdao.checkExitEmail(email)) {
			alertMsg="Email đã tồn tại";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/view/register.jsp").forward(req, resp);
		}
		if(rgdao.checkExitUsername(username)) {
			alertMsg="Tên đăng nhập đã tồn tại";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/view/register.jsp").forward(req, resp);
		}
		
		boolean isSuccess = rgdao.register( username, email, password);
		
		if(isSuccess) {
			alertMsg="Tạo thành công";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/view/register.jsp").forward(req, resp);
		}else {
			alertMsg="Hệ thống lỗi";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/view/register.jsp").forward(req, resp);
		}
	}

}
