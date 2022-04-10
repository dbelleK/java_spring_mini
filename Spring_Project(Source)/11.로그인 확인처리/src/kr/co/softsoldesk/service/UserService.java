package kr.co.softsoldesk.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.softsoldesk.beans.UserBean;
import kr.co.softsoldesk.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao; //데이터베이스 주입
	
	//RootAppContext.java에서 주입한 부분
	@Resource(name = "loginUserBean")
	private UserBean loginUserBean;
	
	//넘겨받은 아이디가 사용가능한지 여부 판단
	public boolean checkuserIdExist(String user_id) {
		
		String user_name = userDao.checkUserIdExist(user_id);
		
		if(user_name == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addUserInfo(UserBean joinUserBean) {
		userDao.addUserInfo(joinUserBean);
	
	}
	
    public void getLoginUserInfo(UserBean tempLoginUserBean) {
		
		UserBean tempLoginUserBean2 = userDao.getLoginUserInfo(tempLoginUserBean);
		//가져온 데이터가 있다면
		if(tempLoginUserBean2 != null) {
			loginUserBean.setUser_idx(tempLoginUserBean2.getUser_idx());
			loginUserBean.setUser_name(tempLoginUserBean2.getUser_name());
			loginUserBean.setUserLogin(true);
		}
	}
}











