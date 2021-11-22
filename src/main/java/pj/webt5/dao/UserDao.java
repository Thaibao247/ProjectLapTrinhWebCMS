package pj.webt5.dao;

import pj.webt5.model.UserModel;

public interface UserDao {
	void insert(UserModel user);
	
	void delete(int id);
	
	UserModel getEmail(String email);
	
	UserModel getbyid(int id);
	
	int getUserid(String email, String password);
	
}
