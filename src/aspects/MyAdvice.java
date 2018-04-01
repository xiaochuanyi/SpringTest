package aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	//前置通知，目标运行之前调用
	public void before(){
		System.out.println("这是前置通知");
	}
	//后置通知，如果出现异常不会调用
	public void afterreturning(){
		System.out.println("这是后置通知.出现异常就不执行");
	}
	//环绕拦截通知，在目标方法前后都调用
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("这是环绕通知之前的部分");
		System.out.println("这是环绕通知之后的部分");
	}
	//异常拦截通知，如果出现异常就会调用
	public void afterException(){
		System.out.println("出现异常");
	}
	//后置通知，无论是否出现异常都会调用
	public void after(){
		System.out.println("后置通知，出现异常也调用");
	}
}
