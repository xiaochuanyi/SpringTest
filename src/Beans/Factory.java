package Beans;

public class Factory {
	public static User createuser(){
		System.out.println("��̬��������user");
		return new User();
	}
	public  User createuser2(){
		System.out.println("ʵ����������user");
		return new User();
	}
}
