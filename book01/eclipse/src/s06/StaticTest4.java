package s06;

public class StaticTest4 {

	public static void main(String[] args) {
		Customer zhangsan = new Customer();
		zhangsan.name = "����";
		//���þ�̬����
		Customer.setBankName2("��������");
		
		Customer lisi = new Customer();
		lisi.name = "����";
		//ʹ�þ�̬����
		System.out.println("���ĵ�������" + Customer.bankname2);
	}

}
