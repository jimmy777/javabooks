package s03;

public class BreakTest1 {

	public static void main(String[] args) {
		/**
		 * break����������ǰѭ����switch
		 * break�����������ѭ��
		 * break��������label:for(...) break label;���˳����ѭ����
		 */
		for(int i=1;i<=1000;i++) {
			System.out.println(i);
			if(i==2) {
				break;
			}
		}
	}

}
