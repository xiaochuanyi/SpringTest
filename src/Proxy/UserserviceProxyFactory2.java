package Proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import service.UserService;
import service.UserServiceImpl;

public class UserserviceProxyFactory2 implements MethodInterceptor{
	public UserService getUservice(){
		Enhancer en = new Enhancer();//生成代理对象
		en.setSuperclass(UserServiceImpl.class);//设置对谁进行代理
		en.setCallback(this);
		UserService us= (UserService) en.create();//创建代理对象
		return us;
	}

	@Override
	public Object intercept(Object arg0, Method method, Object[] arg, MethodProxy methodProxy) throws Throwable {
		System.out.println("打开事务");
		Object returnValue = methodProxy.invokeSuper(arg0, arg);
		System.out.println("关闭事务");
		return returnValue;
	}
}
