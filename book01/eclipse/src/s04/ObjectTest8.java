package s04;

class Number{
	int a;
}

class Calc8{
	void fun(Number num) {
		num.a = num.a + 1;
	}
}

public class ObjectTest8 {

	public static void main(String[] args) {
		/**
		 * �����������Ͳ������ô���
		 */
		
		//numΪ��������
		Number num = new Number();
		num.a=10;
		
		Calc8 c = new Calc8();
		//������������
		c.fun(num);
		//num��Ա������ֵ���޸���
		System.out.println("num.a��ֵ��"+num.a);
	}

}
