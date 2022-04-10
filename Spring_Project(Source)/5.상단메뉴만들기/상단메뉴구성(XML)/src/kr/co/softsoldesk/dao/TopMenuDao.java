package kr.co.softsoldesk.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.softsoldesk.beans.BoardInfoBean;

//����Ŭ���� ������ �޾ƿ���
//Bean�߿� DAO�� Repository�� ���
@Repository
public class TopMenuDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<BoardInfoBean> getTopMenuList(){
		//topmenu.get_topmenu_list : top_menu_mapper.xml�� namespace �� id
		List<BoardInfoBean> topMenuList = sqlSessionTemplate.selectList("topmenu.get_topmenu_list");
		return topMenuList;

	}
}
