package s04;

public class ObjectTest4 {

	public static void main(String[] args) {
		//实例化一个对象
		Customer zhangsan = new Customer();
		zhangsan.display();
		
		//调用类函数，并传入参数，叫实参。
		zhangsan.init("张三", "男", 25);
		zhangsan.display();
		
	}

}
