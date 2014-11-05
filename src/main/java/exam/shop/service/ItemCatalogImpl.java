package exam.shop.service;

import java.util.*;

import exam.shop.dao.*;
import exam.shop.dto.*;

public class ItemCatalogImpl implements ItemCatalog {

	private ItemDAOImpl itemDAOImpl;
	
	public void setItemDAOImpl(ItemDAOImpl itemDAOImpl) {
		this.itemDAOImpl = itemDAOImpl;
	}

	@Override
	public List<Item> getItemList() {
		//List<Item> list = ;
		return itemDAOImpl.findAll();
	}

	@Override
	public Item getItemByItemId(int itemId) {
		return itemDAOImpl.findByItemId(itemId);
	}

}
