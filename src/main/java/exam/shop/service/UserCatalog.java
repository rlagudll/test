package exam.shop.service;

import exam.shop.dto.User;

public interface UserCatalog {

	User getUserByUserId(String id, String pwd);
	void registerUser(User user);
	
}
