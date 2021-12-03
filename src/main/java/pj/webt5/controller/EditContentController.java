package pj.webt5.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pj.webt5.model.ContentModel;
import pj.webt5.service.ContentService;
import pj.webt5.service.impl.ContentServiceImpl;

@WebServlet(urlPatterns = {"/savecontent"})
public class EditContentController extends HttpServlet{

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
		int id = Integer.parseInt(req.getParameter("uid"));
		String title = req.getParameter("title");
		String brief = req.getParameter("brief");
		String content = req.getParameter("content");
		
		ContentModel con = new ContentModel(id ,title, brief, content, formatter.format(date));
		ContentService service = new ContentServiceImpl();
		service.update(con);
		resp.sendRedirect("content");
	}

}
