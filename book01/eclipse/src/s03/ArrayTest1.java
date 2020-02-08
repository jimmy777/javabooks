package s03;

public class ArrayTest1 {

	public static void main(String[] args) {
		/**
		 * 一维数组
		 * int[] age=new int[100];
		 * 先定义变量，再分配内存
		 * 带默认值
		 * 定义的时候也可以初始化
		 * char、float、double、boolean、String数组的初始化值
		 * 像变量一样使用数组中的元素
		 * arr.length 为数组的长度
		 * for(数组元素的类型 变量名:数组名称) { 使用变量 } 数组元素的类型和变量的类型必须相同
		 */
		
		int size = 10;
		int[] age = new int[size];
		System.out.println("age is: " + age[5]);
		
		char[] aa = new char[size];
		System.out.println("aa is: " + aa[5]);
		
		float[] ff = new float[size];
		System.out.println("ff is: " + ff[5]);
		
		double[] dd = new double[size];
		System.out.println("dd is: " + dd[5]);
		
		String[] ss = new String[size];
		System.out.println("ss is: " + ss[5]);
		
		int[] arr = new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = i +1;
		}
		
//		for(int i=0;i<arr.length;i++) {
//			sum +=arr[i];
//		}
		
		for(int e:arr) {
			sum += e;
		}
		System.out.println("sum = " + sum);
		
		
		
		
	}

}
