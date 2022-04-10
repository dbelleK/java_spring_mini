package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	//이름을 통해서 주입시 @Resource 사용
//	@Resource(name = "loginUserBean")
//	private UserBean loginUserBean;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
//		System.out.println(loginUserBean);
		//파일저장시 절대 경로가 필요함. (물리적 경로 확인)
		System.out.println(request.getServletContext().getRealPath("/"));
		
		return "redirect:/main";
	}
}


