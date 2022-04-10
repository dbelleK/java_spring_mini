package kr.co.softsoldesk.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import kr.co.softsoldesk.beans.UserBean;

public class CheckLoginInterceptor implements HandlerInterceptor{
	
private UserBean loginUserBean;
	
	public CheckLoginInterceptor(UserBean loginUserBean) {
		// TODO Auto-generated constructor stub
		this.loginUserBean = loginUserBean;
	}
	
   @Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	// 로그인을 하지 않았다면
			if(loginUserBean.isUserLogin() == false) {
				String contextPath = request.getContextPath();
			//웹브라우져에게 요청하라고 지시함
				response.sendRedirect(contextPath + "/user/not_login");
				//다음 단계로 이동하지 않음
				return false;
			}
			//로그인 되어 있는 상태
			return true;
	}
}
