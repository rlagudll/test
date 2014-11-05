package exam.shop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import exam.shop.service.ShopService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ItemController {
	
	@Autowired
	private ShopService shopService;
	
	public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}
	
	// ��ǰ ��ü ���
	@RequestMapping(value="/listItem.shop")
	public ModelAndView listItem(ModelAndView mav, HttpServletRequest req) {
		
		String eventType = req.getHeader("X-GitHub-Event");

		
		mav.setViewName("listItem");
		mav.addObject("listItem", shopService.getItemList());
		
		return mav;
	}
	
	// ��ǰ �� ������
	@RequestMapping(value="/detailItem.shop")
	public ModelAndView detailItem(@RequestParam("itemId") int itemId, ModelAndView mav) {
		
		mav.setViewName("detailItem");
		mav.addObject("detailItem", shopService.getItemByItemId(itemId));
		return mav;
	}
}
