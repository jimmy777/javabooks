package s03;

public class BreakTest1 {

	public static void main(String[] args) {
		/**
		 * break可以跳出当前循环或switch
		 * break不能跳出外层循环
		 * break可以利用label:for(...) break label;来退出外层循环。
		 */
		for(int i=1;i<=1000;i++) {
			System.out.println(i);
			if(i==2) {
				break;
			}
		}
	}

}
