package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import kr.co.softsoldesk.beans.UserBean;

//프로젝트 작업시 사용할 bean을 정의하는 클래스
@Configuration
public class RootAppContext {
	
	    //이름으로 구분하여 등록
		@Bean("loginUserBean")
		@SessionScope
		public UserBean loginUserBean() {
			return new UserBean();
		}

}
