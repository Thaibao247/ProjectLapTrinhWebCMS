package pj.webt5.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pj.webt5.dao.ContentDao;
import pj.webt5.dao.impl.ContentDaoImpl;
import pj.webt5.model.ContentModel;
import pj.webt5.model.UserModel;


@WebServlet(urlPatterns = {"/add-content"})
public class AddContentController extends HttpServlet{

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
	private ContentDao contentdao = new ContentDaoImpl();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    Date date = new Date();  
	long time = date.getTime();
	public void init() {
		contentdao = new ContentDaoImpl();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/htm");
		resp.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		HttpSession session = req.getSession();
		int obj = (int)session.getAttribute("id");
		String title = req.getParameter("title");
		String brief = req.getParameter("brief");
		String content = req.getParameter("content");
		UserModel users = new UserModel();
		users.setId(obj);
		
		
		ContentModel contentmodel = new ContentModel();
		contentmodel.setTittle(title);
		contentmodel.setBrief1(brief);
		contentmodel.setContent1(content);
		contentmodel.setCreatedate1(formatter.format(date));
		contentmodel.setUpdatetime1(formatter.format(date));
		contentmodel.setUserid(users.getId());
		contentdao.insert(contentmodel);
		resp.sendRedirect("home.tiles");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	}
	
}
