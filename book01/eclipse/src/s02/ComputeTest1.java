package s02;

public class ComputeTest1 {

	public static void main(String[] args) {
		
		/**
		 * ��������
		 * ���ȼ������š�������λ�ơ���ϵ���߼�����ֵ
		 */
		
		int age =25;
		//int newAge = age++; // 25�ȸ�ֵ��newAge��Ȼ��age�ټ�1
		int newAge = ++age; // age�ȼ�1����26��Ȼ���ٸ�ֵ��newAge
		
		System.out.println("new age is: " + newAge);
		
		/**
		 * �ַ�������+�Զ�ת��ƴ��Ϊ�ַ���
		 */
		System.out.println("China" + 25);
		System.out.println("" + 25 + 24);
		System.out.println("" + age + newAge);
		
		int a = 1;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);


	}

}
