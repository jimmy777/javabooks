package s02;

public class CharTest2 {

	public static void main(String[] args) {
		/*
		 * 1���;��ȵ�ֵ����ֱ�Ӹ�ֵ���߾��ȵ�ֵ����������Ϊ�߾��ȣ�
		 * 2���߾��ȵ�ֵ����ǿ��ת����ֵ���;��ȵ�ֵ��ע��Ĭ�϶�ʧ����ʱ�ͻᱨ��
		 * 3����ͬ���ȵ�ֵ������㣬�������߾��ȵ����͡�
		 */
		char c1 = 'C';
		int ic1 = c1; // char�����ַ����Ը�ֵΪint����
		
		System.out.println("ic1 ��ֵ��"+ic1);
		
		int ic2 = 65;
		char ci2 = (char)ic2; // int���Ͳ���ֱ�Ӹ�ֵ��char���ͣ�����ǿ��ת����
		System.out.println("ci2 ��ֵ��"+ci2);

	}

}
