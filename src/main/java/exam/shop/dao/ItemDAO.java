package exam.shop.dao;

import java.util.*;

import exam.shop.dto.*;

public interface ItemDAO {
	// ��ǰ ����Ʈ 
	/**
	 * @return ��ǰ����Ʈ ��ȯ
	 */
	List<Item> findAll();
	
	// ��ǰ �󼼳���
	/**
	 * @param itemId ��ǰ�ڵ�
	 * @return ��ǰ ���� ��ȯ
	 */
	Item findByItemId(int itemId);
}
