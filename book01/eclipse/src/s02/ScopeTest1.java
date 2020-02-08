package s02;

public class ScopeTest1 {

	public static void main(String[] args) {
		int age = 26;
//		{
//			int age2 =25; // 变量的使用范围是大括号内
//		}
		
		System.out.println("age 的值："+age); // 无法使用age

	}

}
