package s03;

public class ForTest1 {

	public static void main(String[] args) {
		/**
		 * for��Ҫ��:
		 * 1.���Ʊ�����ʼ����
		 * 2.ѭ��ִ��������
		 * 3.���Ʊ����ı仯��
		 * for(����1;�ж�2;�仯3)
		 * for��whileһ���ǿ��Ի���
		 */
		int sum=0;
//		for(int i=1;i<=1000;i++) { // ��ִ��1�����ж�2���仯3
//			sum +=i;
//		}
		
//		int i=1;
//		for(;i<=1000;i++) { //ע��1-2-3ִ��˳��
//			sum +=i;
//		}
		
		for(int i=1;i<=1000;sum+=i,i++) { //ע��1-2-3ִ��˳��3��һ�����š�
			
		}
		
		System.out.println("���Ϊ��" + sum); 
	}

}
