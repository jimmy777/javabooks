package s04;

public class ObjectTest2 {

	public static void main(String[] args) {
		Customer zhangsan = new Customer();
		zhangsan.age =25;
		
		//������������ָ��ͬһ��ʵ����
		Customer lishi = zhangsan;
		System.out.println("���ĵ�������"+lishi.age);
		
		//�����޸��ˣ���ô����Ҳ�޸�
		zhangsan.age =35;
		System.out.println("���ĵ�������"+lishi.age);
		
		//���ĵ�����Ķ���ָ��null��������������
		System.out.println("���ĵ�������"+lishi.name);
		System.out.println("���ĵ��Ա���"+lishi.sex);
	}

}
