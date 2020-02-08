package s04;

class Number{
	int a;
}

class Calc8{
	void fun(Number num) {
		num.a = num.a + 1;
	}
}

public class ObjectTest8 {

	public static void main(String[] args) {
		/**
		 * 引用数据类型采用引用传递
		 */
		
		//num为引用类型
		Number num = new Number();
		num.a=10;
		
		Calc8 c = new Calc8();
		//传递引用类型
		c.fun(num);
		//num成员变量的值被修改了
		System.out.println("num.a的值是"+num.a);
	}

}
