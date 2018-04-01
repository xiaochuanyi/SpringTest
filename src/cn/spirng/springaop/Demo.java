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
//帮助我们创建容器
@ContextConfiguration("classpath:cn/spirng/springaop/applicationContext2.xml")
//指定创建容器时使用哪一个配置文件
public class Demo {
	@Resource(name="userservicetarget")//找到name为userservicetarget的对象，将此对象注入给u
	private UserService u;
	@Test
	public void test(){
		u.save();
	}
}
