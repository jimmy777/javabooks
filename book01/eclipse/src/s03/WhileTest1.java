package s03;

public class WhileTest1 {

	public static void main(String[] args) {
		/**
		 * 循环，代码必须有重复性
		 * 循环包括：while、do-while、for
		 */
		int sum=0, i=1;
		while(i<=1000) { // i为控制变量。无分号。如果只有一条语句，大括号可以省略。
			sum +=i;
			i++; // 1为步长。如果没有这步，就是死循环。
		}
		System.out.println("结果为：" + sum);
	}

}
