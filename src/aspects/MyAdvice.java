package aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	//ǰ��֪ͨ��Ŀ������֮ǰ����
	public void before(){
		System.out.println("����ǰ��֪ͨ");
	}
	//����֪ͨ����������쳣�������
	public void afterreturning(){
		System.out.println("���Ǻ���֪ͨ.�����쳣�Ͳ�ִ��");
	}
	//��������֪ͨ����Ŀ�귽��ǰ�󶼵���
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("���ǻ���֪֮ͨǰ�Ĳ���");
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
