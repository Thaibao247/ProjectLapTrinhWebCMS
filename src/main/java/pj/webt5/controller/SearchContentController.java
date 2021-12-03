package pj.webt5.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pj.webt5.model.ContentModel;
import pj.webt5.service.ContentService;
import pj.webt5.service.impl.ContentServiceImpl;


@WebServlet(urlPatterns = {"/search"})
public class SearchContentController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		ContentService service = new ContentServiceImpl();
		
		HttpSession session = req.getSession();
		int authorId=(int)session.getAttribute("id");
		String title = req.getParameter("title");
		List<ContentModel> list  = service.search(authorId,title);
		req.setAttribute("listcontent", list);
		RequestDispatcher rq = req.getRequestDispatcher("viewcontent.tiles");
		rq.forward(req, resp);
	}
	
}
