package Proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import service.UserService;
import service.UserServiceImpl;

public class UserserviceProxyFactory2 implements MethodInterceptor{
	public UserService getUservice(){
		Enhancer en = new Enhancer();//���ɴ������
		en.setSuperclass(UserServiceImpl.class);//���ö�˭���д���
		en.setCallback(this);
		UserService us= (UserService) en.create();//�����������
		return us;
	}

	@Override
	public Object intercept(Object arg0, Method method, Object[] arg, MethodProxy methodProxy) throws Throwable {
		System.out.println("������");
		Object returnValue = methodProxy.invokeSuper(arg0, arg);
		System.out.println("�ر�����");
		return returnValue;
	}
}
