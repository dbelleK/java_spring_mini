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
  해당 아이디가 없으면 null값을 반환한다 즉 null값이 반환되면 없는 아이디이므로 사용이 가능하다
 */