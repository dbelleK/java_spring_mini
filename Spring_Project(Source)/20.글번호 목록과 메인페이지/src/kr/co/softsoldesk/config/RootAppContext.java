package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import kr.co.softsoldesk.beans.UserBean;

//�봽濡쒖젥�듃 �옉�뾽�떆 �궗�슜�븷 bean�쓣 �젙�쓽�븯�뒗 �겢�옒�뒪
@Configuration
public class RootAppContext {
	
	    //이름으로 구분하여 등록
		@Bean("loginUserBean")
		@SessionScope
		public UserBean loginUserBean() {
			return new UserBean();
		}

}
