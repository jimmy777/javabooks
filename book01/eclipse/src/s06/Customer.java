package s06;

class Customer {
	String name;
	String bankname;
	//静态变量
	static String bankname2;
	
	//静态函数
	static void setBankName2(String bankName2) {
		Customer.bankname2 = bankName2;
	}
	
	//对静态变量初始化
	static {
		bankname2 = "浙江银行";
		System.out.println("这是静态代码块执行一次！");
	}
	
	//共有变量
	int age0;
	
	//私有变量
	private int age;
	
	//暴露共有函数对私有变量进行操作
	public void setAge(int age) {
		if(age<0 || age>100) {
			System.out.println("age无法赋值");
			return;
		}
		this.age=age;
	}
	
	public int getAge() {
		return this.age;
	}
}
