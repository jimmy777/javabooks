package s04;

class Calc9{
	int abs(int a) {
		return a>0?a:-a;
	}
	
	double abs(double a) {
		return a>0?a:-a;
	}
}

public class ObjectTest9 {

	public static void main(String[] args) {
		/**
		 * ��������overload��Ҳ�о�̬��̬
		 * ��̬Polymorphism����������̵�����֮һ��
		 * ��̬����˵��������ֻ��һ���������ø��ݲ�ͬ������д���������
		 * 1.���������ĸ�����ͬ
		 * 2.���������ĸ�����ͬ�����Ͳ�ͬ
		 * 3.���������ĸ�����ͬ��������ͬ�����ڲ����б��еĳ��ֵ�˳��ͬ
		 * 
		 */
		Calc9 c = new Calc9();
		
		System.out.println(c.abs(-12.5));
		System.out.println(c.abs(-10));
		
	}

}
