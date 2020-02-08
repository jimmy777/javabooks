package s06;

public class StaticTest2 {

	public static void main(String[] args) {
		//实例化1
		Customer zhangsan = new Customer();
		zhangsan.name = "张三";
		//同一个银行客户，访问静态变量
		Customer.bankname2="香港银行";
		
		//实例化2
		Customer lisi = new Customer();
		lisi.name = "李四";
		//同一个银行客户，访问静态变量
		System.out.println("李四的bankname2银行名称是"+Customer.bankname2);
	}

}
