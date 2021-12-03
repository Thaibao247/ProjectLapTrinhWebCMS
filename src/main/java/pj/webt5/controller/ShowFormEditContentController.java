package pj.webt5.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pj.webt5.model.ContentModel;
import pj.webt5.service.ContentService;
import pj.webt5.service.impl.ContentServiceImpl;

@WebServlet(urlPatterns = {"/showeditcontent"})
public class ShowFormEditContentController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("cid"));
		ContentService service = new ContentServiceImpl();
		ContentModel content = service.getbyid(id);
		RequestDispatcher dispatcher = req.getRequestDispatcher("editcontent.tiles");
		req.setAttribute("content", content);
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}
	
}
