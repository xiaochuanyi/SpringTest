package Proxy;

import org.junit.Test;

import service.UserService;
import service.UserServiceImpl;

public class Demo1 {
	@Test
	public void test1(){
		//UserService us = new UserServiceImpl();
		UserserviceProxyFactory2 factory = new UserserviceProxyFactory2();
		UserService usProxy = factory.getUservice();
		usProxy.save();
		usProxy.delete();
	}
}
