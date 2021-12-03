package pj.webt5.service;

import pj.webt5.model.UserModel;

public interface UserService {
	void insert(UserModel user);
	
	void delete(int id);
	
	void update(UserModel user);
	
	UserModel login(String email, String password);
	
	UserModel getbyid(int id);
	
	int getUserid(String email, String password);

	
}
