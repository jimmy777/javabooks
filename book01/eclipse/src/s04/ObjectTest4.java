package s04;

public class ObjectTest4 {

	public static void main(String[] args) {
		//ʵ����һ������
		Customer zhangsan = new Customer();
		zhangsan.display();
		
		//�����ຯ�����������������ʵ�Ρ�
		zhangsan.init("����", "��", 25);
		zhangsan.display();
		
	}

}
