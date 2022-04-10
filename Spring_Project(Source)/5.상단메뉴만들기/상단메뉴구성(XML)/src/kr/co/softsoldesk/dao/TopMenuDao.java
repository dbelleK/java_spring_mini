package kr.co.softsoldesk.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.softsoldesk.beans.BoardInfoBean;

//오라클에서 데이터 받아오기
//Bean중에 DAO는 Repository로 등록
@Repository
public class TopMenuDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<BoardInfoBean> getTopMenuList(){
		//topmenu.get_topmenu_list : top_menu_mapper.xml의 namespace 와 id
		List<BoardInfoBean> topMenuList = sqlSessionTemplate.selectList("topmenu.get_topmenu_list");
		return topMenuList;

	}
}
