package s06;

public class EncTest2 {

	public static void main(String[] args) {
		Customer zhangsan = new Customer();
		//调用暴露的函数为属性赋值
		zhangsan.setAge(25);
		//调用暴露的函数获取属性的值
		System.out.println("张三的年龄是" + zhangsan.getAge());
		
		Customer lisi = new Customer();
		//年龄超过范围，所以赋值未成功！
		lisi.setAge(120);
		//调用暴露的函数获取属性的值，int的默认值为0
		System.out.println("李四的年龄是" + lisi.getAge());
	}

}
