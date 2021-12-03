package pj.webt5.dao;

import java.util.List;

import pj.webt5.model.ContentModel;

public interface ContentDao {
	void insert(ContentModel content);
	
	void delete(int id);
	
	void update(ContentModel content);
	
	ContentModel getbyid(int id);
	
	List<ContentModel> getallbyid(int id) ;
	
	int getTotalContent();
	List<ContentModel> search(int id, String title);
}
