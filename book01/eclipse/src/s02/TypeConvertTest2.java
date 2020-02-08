package s02;

public class TypeConvertTest2 {

	public static void main(String[] args) {
		String strAge = "25";
		String strMoney = "34234.3"; // 小数末尾不需要带F或f
		
		/*
		 * 1、字符串转换成其他类型，需要使用基本类型的封装类；
		 * 2、封装类：Byte、Short、Integer、Long、Float、Double
		*/
		int age = Integer.parseInt(strAge);
		float money = Float.parseFloat(strMoney);
		
		System.out.println("age 的值："+age);
		System.out.println("money 的值："+money);

	}

}
