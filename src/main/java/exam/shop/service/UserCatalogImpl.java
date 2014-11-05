package exam.shop.service;

import exam.shop.dao.UserDAOImpl;
import exam.shop.dto.User;

public class UserCatalogImpl implements UserCatalog {

	private UserDAOImpl userDAOImpl;
	
	@Override
	public User getUserByUserId(String id, String pwd) {
		return userDAOImpl.getUserByUserId(id, pwd);
	}

	@Override
	public void registerUser(User user) {
		userDAOImpl.registerUser(user);
	}

}
