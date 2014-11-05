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
	

	
	// 로그인 폼 페이지
	@RequestMapping(value="/loginUser.shop", method=RequestMethod.GET)
	public ModelAndView loginUserView(ModelAndView mav) {
		
		mav.setViewName("loginUser");
		
		return mav;
	}

	// 로그인 실행 페이지
	@RequestMapping(value="/loginUser.shop", method=RequestMethod.POST)
	public ModelAndView loginUserSubmit(ModelAndView mav) {
		
		mav.setViewName("listItem");
		mav.addObject("itemId", shopService.getItemList());
		
		return mav;
	}	
	/*
	// 회원가입 폼 페이지
	@RequestMapping(value="/registerUser.shop")
	public ModelAndView registerUserView(ModelAndView mav) {
		
		mav.setViewName("order");
		
		return mav;
	}
	
	// 회원가입 실행 페이지
	@RequestMapping(value="/registerUser.shop")
	public ModelAndView registerUserSubmit(ModelAndView mav) {
		
		mav.setViewName("order");
		
		return mav;
	}
*/
}
