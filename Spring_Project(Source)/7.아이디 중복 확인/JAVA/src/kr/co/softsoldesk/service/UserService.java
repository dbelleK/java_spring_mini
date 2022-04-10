package kr.co.softsoldesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.softsoldesk.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao; //데이터베이스 주입
	
	//넘겨받은 아이디가 사용가능한지 여부 판단
	public boolean checkuserIdExist(String user_id) {
		
		String user_name = userDao.checkUserIdExist(user_id);
		
		if(user_name == null) {
			return true;
		} else {
			return false;
		}
	}
}











