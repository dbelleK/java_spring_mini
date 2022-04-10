package kr.co.softsoldesk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.softsoldesk.mapper.UserMapper;

@Repository
public class UserDao {
	
	@Autowired //mapper ����
	private UserMapper userMapper;
	
	//�Է¹��� ���̵� ��ȯ
	public String checkUserIdExist(String user_id) {
		return userMapper.checkUserIdExist(user_id);
	}
}
