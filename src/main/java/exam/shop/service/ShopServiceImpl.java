package exam.shop.service;

import java.util.List;

import exam.shop.dto.Item;
import exam.shop.dto.User;

public class ShopServiceImpl implements ShopService {
	
	private ItemCatalog itemCatalog;
	private UserCatalog userCatalog;
	
	public void setItemCatalog(ItemCatalog itemCatalog) {
		this.itemCatalog = itemCatalog;
	}

	@Override
	public List<Item> getItemList() {
		//List<Item> list = itemCatalog.getItemList();
		return itemCatalog.getItemList();
	}

	@Override
	public Item getItemByItemId(int itemId) {
		return itemCatalog.getItemByItemId(itemId);
	}

	@Override
	public User getUserByUserId(String id, String pwd) {
		return userCatalog.getUserByUserId(id, pwd);
	}

	@Override
	public void registerUser(User user) {
		userCatalog.registerUser(user);
	}

}
