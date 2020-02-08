package s04;

public class ObjectTest6 {

	public static void main(String[] args) {
		/**
		 * 简单数据类型采用值传递方式
		 */
		int a=-10;
		Calc c=new Calc();
		//a的值复制了一份传给类类函数，叫做值传递
		c.abs(a);
		
		//a保持了原值，只是一个副本传了过去而已
		System.out.println("a="+a);
	}

}
