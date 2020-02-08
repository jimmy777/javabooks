package s04;

public class ObjectTest3 {

	public static void main(String[] args) {
		Customer zhangsan = new Customer();
		//调用实例的成员函数
		zhangsan.display();
		
		//实例赋值
		zhangsan.name="张三";
		zhangsan.sex="男";
		zhangsan.age=25;
		
		//调用实例函数
		zhangsan.display();
		
	}

}
