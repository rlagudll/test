package exam.shop.dao;

import exam.shop.dto.Item;
import exam.shop.dto.User;

public interface UserDAO {
	
	// 로그인
	User getUserByUserId(String userId, String userPwd);
	
	// 회원가입
	void registerUser(User user);
	
}
