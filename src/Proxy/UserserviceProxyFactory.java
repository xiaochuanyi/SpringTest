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
	 * ���ɶ�̬�������ش������
	 */
	public UserService getUservice(){
		//���ɶ�̬����
		UserService userservice = (UserService) Proxy.newProxyInstance(UserserviceProxyFactory.class.getClassLoader(), UserServiceImpl.class.getInterfaces()
				,this);
		//����
		return userservice;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("������");
		Object invoke = method.invoke(us, args);//us�Ƿ������ñ����ʵ��
		System.out.println("�ر�����");
		return invoke;
	}
}
