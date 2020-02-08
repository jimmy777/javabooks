package s07;

interface User{
	/**
	 * 类中全部函数都是抽象的，那么类可以定义为接口；
	 * 继承的类叫实现implement接口，类叫做实现类；
	 * 
	 * 说明：
	 * 1、接口中不需要写abstract，默认就是抽象的。接口中只能包含常量和函数；
	 * 2、接口中的函数都是public的，变量是public static final全局静态常量；
	 * 3、接口可以extends继承另一个接口，类通过implements来实现一个接口；
	 * 4、一个类可以继承一个父类，同时可以继承多个接口，逗号间隔；
	 */
	public static final String name = "xxx";
	public void show();
}

final class AdminUser implements User {
	String alias;
	
	//rewrite父类Object类的toString函数
	public String toString() {
		return this.alias;
	}
	
	//rewrite父类Object类的equals函数
	public boolean equals(AdminUser au) {
		if (alias.equals(au.alias)) {
			return true;
		}
		return false;
	}
	
	public AdminUser(String alias) {
		this.alias = alias;
	}
	
	public final double PI = 3.14;
	
	final public void show() {
		System.out.println("子类AdminUser");
	}
}

public class InterfaceTest1 {
	
	public static void toCenter(User u) {
		System.out.println("静态函数toCenter: " + User.name);
		u.show();
	}

	public static void main(String[] args) {
		AdminUser jack = new AdminUser("JACK");
		System.out.println(jack.PI);
		toCenter(jack);
		System.out.println(jack);
		
		AdminUser jack2 = new AdminUser("JACK");
		System.out.println(jack2);
		
		//判断两个字符串是否相等用equals函数
		System.out.println(jack.equals(jack2));
	}

}
