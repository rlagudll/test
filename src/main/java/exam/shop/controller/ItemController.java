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
	
	// 상품 전체 목록
	@RequestMapping(value="/listItem.shop")
	public ModelAndView listItem(ModelAndView mav, HttpServletRequest req) {
		
	
		 String payload = req.getParameter("payload");
		System.out.println(payload);
		mav.setViewName("listItem");
		mav.addObject("listItem", payload);
		
		return mav;
	}
	
	// 상품 상세 페이지
	@RequestMapping(value="/detailItem.shop")
	public ModelAndView detailItem(@RequestParam("itemId") int itemId, ModelAndView mav) {
		
		mav.setViewName("detailItem");
		mav.addObject("detailItem", shopService.getItemByItemId(itemId));
		return mav;
	}
}
