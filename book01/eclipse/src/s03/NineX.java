package s03;

public class NineX {

	public static void main(String[] args) {
		/**
		 * 九九乘法表
		 */
		for(int r=1;r<=9;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(r+"*"+c+"="+r*c+"\t"); // 不换行
			}
			System.out.println(); // 换行
		}
	}

}
