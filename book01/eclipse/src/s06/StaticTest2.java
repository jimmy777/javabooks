package s06;

public class StaticTest2 {

	public static void main(String[] args) {
		//ʵ����1
		Customer zhangsan = new Customer();
		zhangsan.name = "����";
		//ͬһ�����пͻ������ʾ�̬����
		Customer.bankname2="�������";
		
		//ʵ����2
		Customer lisi = new Customer();
		lisi.name = "����";
		//ͬһ�����пͻ������ʾ�̬����
		System.out.println("���ĵ�bankname2����������"+Customer.bankname2);
	}

}
