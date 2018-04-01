package cn.spirng.springaop;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import Beans.CollectionBean;
import Beans.User;
import service.UserService;
import service.UserServiceImpl;
@RunWith(SpringJUnit4ClassRunner.class)
//�������Ǵ�������
@ContextConfiguration("classpath:cn/spirng/springaop/applicationContext2.xml")
//ָ����������ʱʹ����һ�������ļ�
public class Demo {
	@Resource(name="userservicetarget")//�ҵ�nameΪuserservicetarget�Ķ��󣬽��˶���ע���u
	private UserService u;
	@Test
	public void test(){
		u.save();
	}
}
