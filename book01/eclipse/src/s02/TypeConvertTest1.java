package s02;

public class TypeConvertTest1 {

	public static void main(String[] args) {
		int age = 25;
		float money = 2343.2f;
		
		// 其他类型转换成String字符串，使用String.valueOf()函数；
		String strAge = String.valueOf(age);
		String strMoney = String.valueOf(money);
		
		System.out.println("strAge 的值："+strAge);
		System.out.println("strMoney 的值："+strMoney);
		
	}

}
