package s03;

public class ArrayTest1 {

	public static void main(String[] args) {
		/**
		 * һά����
		 * int[] age=new int[100];
		 * �ȶ���������ٷ����ڴ�
		 * ��Ĭ��ֵ
		 * �����ʱ��Ҳ���Գ�ʼ��
		 * char��float��double��boolean��String����ĳ�ʼ��ֵ
		 * �����һ��ʹ�������е�Ԫ��
		 * arr.length Ϊ����ĳ���
		 * for(����Ԫ�ص����� ������:��������) { ʹ�ñ��� } ����Ԫ�ص����ͺͱ��������ͱ�����ͬ
		 */
		
		int size = 10;
		int[] age = new int[size];
		System.out.println("age is: " + age[5]);
		
		char[] aa = new char[size];
		System.out.println("aa is: " + aa[5]);
		
		float[] ff = new float[size];
		System.out.println("ff is: " + ff[5]);
		
		double[] dd = new double[size];
		System.out.println("dd is: " + dd[5]);
		
		String[] ss = new String[size];
		System.out.println("ss is: " + ss[5]);
		
		int[] arr = new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = i +1;
		}
		
//		for(int i=0;i<arr.length;i++) {
//			sum +=arr[i];
//		}
		
		for(int e:arr) {
			sum += e;
		}
		System.out.println("sum = " + sum);
		
		
		
		
	}

}
