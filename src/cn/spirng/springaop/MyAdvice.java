package cn.spirng.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect//��ʾ������һ��֪ͨ��
public class MyAdvice {
	//ǰ��֪ͨ��Ŀ������֮ǰ����
	@Pointcut("execution(* service.*ServiceImpl.*(..))")
	public void pc(){
		
	}
	@Before("MyAdvice.pc()")//ָ���÷�����ǰ��֪ͨ��ָ������㣬�����Դ�����
	public void before(){
		System.out.println("����ǰ��֪ͨ");
	}
	//����֪ͨ����������쳣�������
	@AfterReturning("MyAdvice.pc()")
	public void afterreturning(){
		System.out.println("���Ǻ���֪ͨ.�����쳣�Ͳ�ִ��");
	}
	//��������֪ͨ����Ŀ�귽��ǰ�󶼵���
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("���ǻ���֪֮ͨǰ�Ĳ���");
		Object proceed = pjp.proceed();//����Ŀ�귽��
		System.out.println("���ǻ���֪֮ͨ��Ĳ���");
	}
	//�쳣����֪ͨ����������쳣�ͻ����
	public void afterException(){
		System.out.println("�����쳣");
	}
	//����֪ͨ�������Ƿ�����쳣�������
	public void after(){
		System.out.println("����֪ͨ�������쳣Ҳ����");
	}
}
