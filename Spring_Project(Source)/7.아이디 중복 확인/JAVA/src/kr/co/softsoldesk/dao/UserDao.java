package kr.co.softsoldesk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.softsoldesk.mapper.UserMapper;

@Repository
public class UserDao {
	
	@Autowired //mapper 주입
	private UserMapper userMapper;
	
	//입력받은 아이디 반환
	public String checkUserIdExist(String user_id) {
		return userMapper.checkUserIdExist(user_id);
	}
}
