package s03;

public class ContinueTest1 {

	public static void main(String[] args) {
		/**
		 * continue退出本条循环，不执行循环体内剩余的语句了。
		 */
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				continue; // 满足条件即退出本条循环，后面的语句不执行了。
			}
			System.out.print(i+"\t");
		}
	}

}
