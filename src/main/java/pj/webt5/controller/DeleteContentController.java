package pj.webt5.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pj.webt5.service.ContentService;
import pj.webt5.service.impl.ContentServiceImpl;

@WebServlet(urlPatterns = {"/deletecontent"})
public class DeleteContentController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("cid"));
		ContentService sv = new ContentServiceImpl();
		sv.delete(id);
		resp.sendRedirect("content");
	}

}
