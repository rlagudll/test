package exam.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import exam.shop.service.ShopService;

@Controller
public class UserController {
	
	@Autowired
	private ShopService shopService;
	

	
	// �α��� �� ������
	@RequestMapping(value="/loginUser.shop", method=RequestMethod.GET)
	public ModelAndView loginUserView(ModelAndView mav) {
		
		mav.setViewName("loginUser");
		
		return mav;
	}

	// �α��� ���� ������
	@RequestMapping(value="/loginUser.shop", method=RequestMethod.POST)
	public ModelAndView loginUserSubmit(ModelAndView mav) {
		
		mav.setViewName("listItem");
		mav.addObject("itemId", shopService.getItemList());
		
		return mav;
	}	
	/*
	// ȸ������ �� ������
	@RequestMapping(value="/registerUser.shop")
	public ModelAndView registerUserView(ModelAndView mav) {
		
		mav.setViewName("order");
		
		return mav;
	}
	
	// ȸ������ ���� ������
	@RequestMapping(value="/registerUser.shop")
	public ModelAndView registerUserSubmit(ModelAndView mav) {
		
		mav.setViewName("order");
		
		return mav;
	}
*/
}
