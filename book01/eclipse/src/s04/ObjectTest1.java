package s04;

//定义一个类，里面包含3个属性
class Customer {
	//定义属性（或叫成员变量）
	String name;
	String sex;
	int age;
	
	/**
	 * 构造函数
	 * 1.函数名称与类的名称相同
	 * 2.不含返回类型
	 * 
	 * 1.定义了构造函数之后，在实例化对象时必须传入相应的参数列表，否则会保报错。
	 * 2.当一个类的对象被创建时构造函数就会被自动调用，一般为初始化工作，只会被调用一次。
	 * 3.构造函数可以被重载，可以有多个构造函数。
	 * 4.有一个默认的构造函数，空函数什么都不做。但如果用户自己写了构造函数，系统就不提供默认构造函数了。
	 */
	
	//重载构造函数
	Customer(String name, String sex, int age) {
		//this是类中的成员，实际是本对象的引用，可以理解为本对象自己
		System.out.println("本对象是"+this);
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	//默认构造函数
	Customer() {
	}

	//n、s、a三个只能在函数内部使用，叫形参。
	void init(String name, String sex, int age) {
		//this是类中的成员，实际是本对象的引用，可以理解为本对象自己
		System.out.println("本对象是"+this);
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	//定义方法（或叫成员函数）
	void display() {
		System.out.println("name: "+name);
		System.out.println("sex: "+sex);
		System.out.println("age: "+age);
	}
}

public class ObjectTest1 {

	public static void main(String[] args) {
		// 声明一个变量，但还没有分配空间
		Customer zhangsan = null;
		System.out.println(zhangsan);

		//分配空间
		zhangsan = new Customer(); 
		System.out.println(zhangsan);
		
		//实例里面的变量值都是默认值
		System.out.println("zhangsan's name: "+zhangsan.name);
		System.out.println("zhangsan's sex: "+zhangsan.sex);
		System.out.println("zhangsan's age: "+zhangsan.age);

		//将实例里面的变量赋值
		zhangsan.name = "张三";
		zhangsan.sex = "男";
		zhangsan.age = 25;
		
		System.out.println("zhangsan's name: "+zhangsan.name);
		System.out.println("zhangsan's sex: "+zhangsan.sex);
		System.out.println("zhangsan's age: "+zhangsan.age);
		
	}

}
