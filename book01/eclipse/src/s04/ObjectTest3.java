package s04;

public class ObjectTest3 {

	public static void main(String[] args) {
		Customer zhangsan = new Customer();
		//����ʵ���ĳ�Ա����
		zhangsan.display();
		
		//ʵ����ֵ
		zhangsan.name="����";
		zhangsan.sex="��";
		zhangsan.age=25;
		
		//����ʵ������
		zhangsan.display();
		
	}

}
