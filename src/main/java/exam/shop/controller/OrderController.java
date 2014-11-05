package exam.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {
	
	// �ֹ� ���� ������
	@RequestMapping(value="/orderItems.shop")
	public ModelAndView orderItems(@RequestParam("itemId") int itemId, ModelAndView mav) {
		
		mav.setViewName("order");
		mav.addObject("itemId", itemId);
		
		return mav;
	}

}