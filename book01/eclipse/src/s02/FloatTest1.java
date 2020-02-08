package s02;

public class FloatTest1 {

	public static void main(String[] args) {
		// 小数默认为double，所以float末尾加F或f
		float f1 = 12.6786F; // 32bit
		// 小数默认为double
		double d1 = 2434.23423423; // 64bit
		
		double d2 = Math.random();
		
		System.out.println("f1 的值："+f1);
		System.out.println("d1 的值："+d1);
		System.out.println("d2 的值："+d2);

	}

}
