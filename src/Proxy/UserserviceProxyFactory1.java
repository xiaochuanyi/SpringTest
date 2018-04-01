package Proxy;

import service.UserService;
import service.UserServiceImpl;

public class UserserviceProxyFactory1 {
	private UserService us;
	public UserserviceProxyFactory1(UserService us){
		this.us=us;
	}
	public UserService getUserService(){
		return us;
		
	}
}
