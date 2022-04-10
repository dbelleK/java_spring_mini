package kr.co.softsoldesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.softsoldesk.service.UserService;

@RestController //데이터형식이므로 Rest사용
public class RestApiController {
	
	@Autowired
	private UserService userService;
	
	
	//@PathVariable :주소에  데이터 붙이기
	@GetMapping("/user/checkUserIdExist/{user_id}")
	public String checkUserIdExist(@PathVariable String user_id) {
		
		boolean chk = userService.checkuserIdExist(user_id);
		
		return chk + "";
	}
}












