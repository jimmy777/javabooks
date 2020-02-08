package s03;

public class DoWhileTest1 {

	public static void main(String[] args) {
		/**
		 * 至少执行一次，再判断条件是否满足。
		 * 退出循环直到判断条件不满足。
		 */
		int sum=0, i=1;
		do {
			sum +=i;
			i++;
		} while(i<=1000);// 这个分号不能少。
		System.out.println("结果为：" + sum);

	}

}
