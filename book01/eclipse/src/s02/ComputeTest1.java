package s02;

public class ComputeTest1 {

	public static void main(String[] args) {
		
		/**
		 * 算数运算
		 * 优先级：括号》算数》位移》关系》逻辑》赋值
		 */
		
		int age =25;
		//int newAge = age++; // 25先赋值给newAge，然后age再加1
		int newAge = ++age; // age先加1等于26，然后再赋值给newAge
		
		System.out.println("new age is: " + newAge);
		
		/**
		 * 字符串可以+自动转换拼接为字符串
		 */
		System.out.println("China" + 25);
		System.out.println("" + 25 + 24);
		System.out.println("" + age + newAge);
		
		int a = 1;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);


	}

}
