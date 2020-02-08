package s02;

public class CharTest2 {

	public static void main(String[] args) {
		/*
		 * 1、低精度的值可以直接赋值给高精度的值，类型升级为高精度；
		 * 2、高精度的值必须强制转换后赋值给低精度的值，注意默认丢失精度时就会报错；
		 * 3、不同精度的值混合运算，结果是最高精度的类型。
		 */
		char c1 = 'C';
		int ic1 = c1; // char类型字符可以赋值为int类型
		
		System.out.println("ic1 的值："+ic1);
		
		int ic2 = 65;
		char ci2 = (char)ic2; // int类型不能直接赋值给char类型，必须强制转换。
		System.out.println("ci2 的值："+ci2);

	}

}
