package s03;

public class DoWhileTest1 {

	public static void main(String[] args) {
		/**
		 * ����ִ��һ�Σ����ж������Ƿ����㡣
		 * �˳�ѭ��ֱ���ж����������㡣
		 */
		int sum=0, i=1;
		do {
			sum +=i;
			i++;
		} while(i<=1000);// ����ֺŲ����١�
		System.out.println("���Ϊ��" + sum);

	}

}
