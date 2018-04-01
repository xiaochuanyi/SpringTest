package Beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component("user110")
//@Service("user110")
//@Controller("user110")
//@Repository("user110")
@Scope(scopeName="singleton")
//@Scope(scopeName="prototype")
public class User {
	@Value(value="tom")
	private String name;
	@Value(value="18")
	private int age;
	@Autowired
	@Qualifier("car")
	private Car car;	
	public User(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public User(){
		System.out.println("空参构造方法");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	@PostConstruct
	public void init(){
		System.out.println("初始化方法");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("销毁方法");
	}
}
