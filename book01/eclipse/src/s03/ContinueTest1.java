package s03;

public class ContinueTest1 {

	public static void main(String[] args) {
		/**
		 * continue�˳�����ѭ������ִ��ѭ������ʣ�������ˡ�
		 */
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				continue; // �����������˳�����ѭ�����������䲻ִ���ˡ�
			}
			System.out.print(i+"\t");
		}
	}

}
