package s04;

class Calc9{
	int abs(int a) {
		return a>0?a:-a;
	}
	
	double abs(double a) {
		return a>0?a:-a;
	}
}

public class ObjectTest9 {

	public static void main(String[] args) {
		/**
		 * 函数重载overload，也叫静态多态
		 * 多态Polymorphism是面向对象编程的特征之一。
		 * 静态，是说函数名称只有一个，但还得根据不同参数编写多个函数。
		 * 1.函数参数的个数不同
		 * 2.函数参数的个数相同，类型不同
		 * 3.函数参数的个数相同，类型相同，但在参数列表中的出现的顺序不同
		 * 
		 */
		Calc9 c = new Calc9();
		
		System.out.println(c.abs(-12.5));
		System.out.println(c.abs(-10));
		
	}

}
