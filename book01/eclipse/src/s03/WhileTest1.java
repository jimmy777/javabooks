package s03;

public class WhileTest1 {

	public static void main(String[] args) {
		/**
		 * ѭ��������������ظ���
		 * ѭ��������while��do-while��for
		 */
		int sum=0, i=1;
		while(i<=1000) { // iΪ���Ʊ������޷ֺš����ֻ��һ����䣬�����ſ���ʡ�ԡ�
			sum +=i;
			i++; // 1Ϊ���������û���ⲽ��������ѭ����
		}
		System.out.println("���Ϊ��" + sum);
	}

}
