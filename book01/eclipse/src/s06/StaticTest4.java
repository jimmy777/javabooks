package s06;

public class StaticTest4 {

	public static void main(String[] args) {
		Customer zhangsan = new Customer();
		zhangsan.name = "张三";
		//调用静态函数
		Customer.setBankName2("北京银行");
		
		Customer lisi = new Customer();
		lisi.name = "李四";
		//使用静态变量
		System.out.println("李四的银行是" + Customer.bankname2);
	}

}
