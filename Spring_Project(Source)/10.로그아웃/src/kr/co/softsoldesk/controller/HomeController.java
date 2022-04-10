package kr.co.softsoldesk.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.softsoldesk.beans.UserBean;

@Controller
public class HomeController {
	
	//이름을 통해서 주입시 @Resource 사용
	@Resource(name = "loginUserBean")
	private UserBean loginUserBean;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		System.out.println(loginUserBean);
		return "redirect:/main";
	}
}


