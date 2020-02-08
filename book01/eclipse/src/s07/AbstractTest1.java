package s07;

abstract class Person {
	/**
	  *    这个show函数被子类rewrite了，没有用了。那么可以定义为抽象函数，那么这个类也成了抽象类。
	 * 	public void show() {
	 *      System.out.println("这是父类Person的show函数。");
	 *  }
	 *  
	 *  1.抽象类不能被实例化；
	 *  2.抽象函数必须被rewrite，除非子类也是抽象类；
	 *  3.抽象类中也可以包含普通函数；
	 */
	
	String name;
	
	abstract void show();
	
	void showName(){
		System.out.println("父类函数showName，我的名字是" + this.name);
	}
}

class Teacher extends Person {
	public void show() {
		System.out.println("这是子类Teacher的show函数。");

	}
}

public class AbstractTest1 {
	
	public static void toCenter(Person p) {
		//使用多态调用Person类，实际传入的是子类Teacher实例。
		System.out.println("这是个静态函数toCenter");
		p.show();
	}

	public static void main(String[] args) {
		Teacher tom = new Teacher();
		toCenter(tom);
		tom.name = "汤姆";
		tom.showName();
	}

}
