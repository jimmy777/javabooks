package s06;

public class EncTest1 {

	public static void main(String[] args) {
		Customer zhangsan = new Customer();
		//对共有变量直接赋值
		zhangsan.age0 =25;
		
		System.out.println("张三的共有年龄是:"+zhangsan.age0);
	}

}
