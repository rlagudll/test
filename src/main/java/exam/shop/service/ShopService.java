package exam.shop.service;

import java.util.*;

import exam.shop.dto.*;

public interface ShopService {
	List<Item> getItemList();
	Item getItemByItemId(int itemId);
	
	User getUserByUserId(String id, String pwd);
	void registerUser(User User);
}
