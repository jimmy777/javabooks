package s04;

class Calc2{
	void fun(int[] arr) {
		System.out.println("arr的地址是"+arr);
		arr[0] = arr[0]+1;
	}
}

public class ObjectTest7 {

	public static void main(String[] args) {
		/**
		 * 引用数据类型采用引用传递
		 */
		int[] arr = {10};
		System.out.println("arr的地址是"+arr);

		Calc2 c = new Calc2();
		//传递的是引用数据类型
		c.fun(arr);
		System.out.println("arr[0]的值是"+ arr[0]);
		
	}

}
