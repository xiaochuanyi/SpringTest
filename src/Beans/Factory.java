package Beans;

public class Factory {
	public static User createuser(){
		System.out.println("静态工厂创建user");
		return new User();
	}
	public  User createuser2(){
		System.out.println("实例工厂创建user");
		return new User();
	}
}
