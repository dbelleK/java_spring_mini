package kr.co.softsoldesk.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import kr.co.softsoldesk.beans.BoardInfoBean;
import kr.co.softsoldesk.service.TopMenuService;

public class TopMenuInterceptor implements HandlerInterceptor{
    //interceptor에서는 자동주입을 받을수 없음
	private TopMenuService topMenuService;
	//생성자를 통해서 주입
	public TopMenuInterceptor(TopMenuService topMenuService) {
	this.topMenuService = topMenuService;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		List<BoardInfoBean> topMenuList = topMenuService.getTopMenuList();
		request.setAttribute("topMenuList", topMenuList);
		
		return true;
	}
}
