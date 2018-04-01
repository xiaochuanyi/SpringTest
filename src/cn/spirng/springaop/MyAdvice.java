package cn.spirng.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect//表示该类是一个通知类
public class MyAdvice {
	//前置通知，目标运行之前调用
	@Pointcut("execution(* service.*ServiceImpl.*(..))")
	public void pc(){
		
	}
	@Before("MyAdvice.pc()")//指定该方法是前置通知并指定切入点，后面以此类推
	public void before(){
		System.out.println("这是前置通知");
	}
	//后置通知，如果出现异常不会调用
	@AfterReturning("MyAdvice.pc()")
	public void afterreturning(){
		System.out.println("这是后置通知.出现异常就不执行");
	}
	//环绕拦截通知，在目标方法前后都调用
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("这是环绕通知之前的部分");
		Object proceed = pjp.proceed();//调用目标方法
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
