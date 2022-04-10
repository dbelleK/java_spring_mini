package kr.co.softsoldesk.mapper;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	
	@Select("select user_name " +
			"from user_table " +
			"where user_id = #{user_id}")
	String checkUserIdExist(String user_id);
}

/*
  select user_name
  from user_table
  where user_id='abcd';
  �ش� ���̵� ������ null���� ��ȯ�Ѵ� �� null���� ��ȯ�Ǹ� ���� ���̵��̹Ƿ� ����� �����ϴ�
 */