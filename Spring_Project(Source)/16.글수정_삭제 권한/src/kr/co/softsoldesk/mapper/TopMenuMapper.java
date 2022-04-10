package kr.co.softsoldesk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.co.softsoldesk.beans.BoardInfoBean;

public interface TopMenuMapper {
	
	@Select("select board_info_idx, board_info_name " +
			"from board_info_table " + 
			"order by board_info_idx")
	//getTopMenuList라는 메소드 이름으로 데이터베이스 리스트 생성
	List<BoardInfoBean> getTopMenuList();
}
