package s03;

public class NineX {

	public static void main(String[] args) {
		/**
		 * �žų˷���
		 */
		for(int r=1;r<=9;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(r+"*"+c+"="+r*c+"\t"); // ������
			}
			System.out.println(); // ����
		}
	}

}
