package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.eclipse.jdt.internal.compiler.ast.Invocation;

import service.UserService;
import service.UserServiceImpl;

public class UserserviceProxyFactory implements InvocationHandler {
	public UserserviceProxyFactory(UserService us){
		super();
		this.us=us;
	}
	public UserService us;
	/*
	 * 生成动态代理，返回代理对象
	 */
	public UserService getUservice(){
		//生成动态代理
		UserService userservice = (UserService) Proxy.newProxyInstance(UserserviceProxyFactory.class.getClassLoader(), UserServiceImpl.class.getInterfaces()
				,this);
		//返回
		return userservice;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("打开事务");
		Object invoke = method.invoke(us, args);//us是方法调用必须的实例
		System.out.println("关闭事务");
		return invoke;
	}
}
