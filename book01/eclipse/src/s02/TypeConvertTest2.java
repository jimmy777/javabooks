package s02;

public class TypeConvertTest2 {

	public static void main(String[] args) {
		String strAge = "25";
		String strMoney = "34234.3"; // С��ĩβ����Ҫ��F��f
		
		/*
		 * 1���ַ���ת�����������ͣ���Ҫʹ�û������͵ķ�װ�ࣻ
		 * 2����װ�ࣺByte��Short��Integer��Long��Float��Double
		*/
		int age = Integer.parseInt(strAge);
		float money = Float.parseFloat(strMoney);
		
		System.out.println("age ��ֵ��"+age);
		System.out.println("money ��ֵ��"+money);

	}

}
