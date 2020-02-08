package s03;

public class ForTest1 {

	public static void main(String[] args) {
		/**
		 * for三要素:
		 * 1.控制变量初始化；
		 * 2.循环执行条件；
		 * 3.控制变量的变化。
		 * for(变量1;判断2;变化3)
		 * for与while一般是可以互换
		 */
		int sum=0;
//		for(int i=1;i<=1000;i++) { // 先执行1，再判断2，变化3
//			sum +=i;
//		}
		
//		int i=1;
//		for(;i<=1000;i++) { //注意1-2-3执行顺序
//			sum +=i;
//		}
		
		for(int i=1;i<=1000;sum+=i,i++) { //注意1-2-3执行顺序。3是一个逗号。
			
		}
		
		System.out.println("结果为：" + sum); 
	}

}
