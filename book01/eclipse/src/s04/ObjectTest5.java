package s04;

class Calc {
	//��Ա����������ֵ��ע�ⷵ��ֵ����
	int abs(int a) {
		return a>0?a:-a;
	}
}

public class ObjectTest5 {

	public static void main(String[] args) {
		Calc c= new Calc();
		int result = c.abs(-10);
		System.out.println("�����"+result);
	}

}
