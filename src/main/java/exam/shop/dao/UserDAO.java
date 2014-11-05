package exam.shop.dao;

import exam.shop.dto.Item;
import exam.shop.dto.User;

public interface UserDAO {
	
	// �α���
	User getUserByUserId(String userId, String userPwd);
	
	// ȸ������
	void registerUser(User user);
	
}
