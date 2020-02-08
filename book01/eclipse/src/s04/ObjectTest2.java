package s04;

public class ObjectTest2 {

	public static void main(String[] args) {
		Customer zhangsan = new Customer();
		zhangsan.age =25;
		
		//张三和李四是指向同一个实例了
		Customer lishi = zhangsan;
		System.out.println("李四的年龄是"+lishi.age);
		
		//张三修改了，那么李四也修改
		zhangsan.age =35;
		System.out.println("李四的年龄是"+lishi.age);
		
		//李四的申请的对象指向null，将被垃圾回收
		System.out.println("李四的姓名是"+lishi.name);
		System.out.println("李四的性别是"+lishi.sex);
	}

}
