package s04;

class Calc2{
	void fun(int[] arr) {
		System.out.println("arr�ĵ�ַ��"+arr);
		arr[0] = arr[0]+1;
	}
}

public class ObjectTest7 {

	public static void main(String[] args) {
		/**
		 * �����������Ͳ������ô���
		 */
		int[] arr = {10};
		System.out.println("arr�ĵ�ַ��"+arr);

		Calc2 c = new Calc2();
		//���ݵ���������������
		c.fun(arr);
		System.out.println("arr[0]��ֵ��"+ arr[0]);
		
	}

}
