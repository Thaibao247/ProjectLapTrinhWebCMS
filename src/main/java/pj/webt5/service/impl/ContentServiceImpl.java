package pj.webt5.service.impl;

import java.util.List;

import pj.webt5.dao.ContentDao;
import pj.webt5.dao.impl.ContentDaoImpl;
import pj.webt5.model.ContentModel;
import pj.webt5.service.ContentService;

public class ContentServiceImpl implements ContentService{
	ContentDao contentdao = new ContentDaoImpl();


	@Override
	public void insert(ContentModel content) {
		contentdao.insert(content);
		
	}

	@Override
	public void delete(int id) {
		contentdao.delete(id);
		
	}

	@Override
	public List<ContentModel> getallbyid(int id) {
		// TODO Auto-generated method stub
		return contentdao.getallbyid(id);
	}

	@Override
	public List<ContentModel> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalContent() {
		// TODO Auto-generated method stub
		return contentdao.getTotalContent();
	}

	@Override
	public void update(ContentModel content) {
		contentdao.update(content);	
	}

	@Override
	public ContentModel getbyid(int id) {
		// TODO Auto-generated method stub
		return contentdao.getbyid(id);
	}

	@Override
	public List<ContentModel> search(int id, String title) {
		return contentdao.search(id, title);
	}

}
