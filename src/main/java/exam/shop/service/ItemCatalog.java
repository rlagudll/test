package exam.shop.service;

import java.util.*;

import exam.shop.dto.*;

public interface ItemCatalog {

	// ��ǰ ��ü ���
	List<Item> getItemList();
	
	// ��ǰ �� ����
	Item getItemByItemId(int itemId);
}
