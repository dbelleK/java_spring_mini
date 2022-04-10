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
	// �α����� ���� �ʾҴٸ�
			if(loginUserBean.isUserLogin() == false) {
				String contextPath = request.getContextPath();
			//������������ ��û�϶�� ������
				response.sendRedirect(contextPath + "/user/not_login");
				//���� �ܰ�� �̵����� ����
				return false;
			}
			//�α��� �Ǿ� �ִ� ����
			return true;
	}
}
