package s06;

public class EncTest2 {

	public static void main(String[] args) {
		Customer zhangsan = new Customer();
		//���ñ�¶�ĺ���Ϊ���Ը�ֵ
		zhangsan.setAge(25);
		//���ñ�¶�ĺ�����ȡ���Ե�ֵ
		System.out.println("������������" + zhangsan.getAge());
		
		Customer lisi = new Customer();
		//���䳬����Χ�����Ը�ֵδ�ɹ���
		lisi.setAge(120);
		//���ñ�¶�ĺ�����ȡ���Ե�ֵ��int��Ĭ��ֵΪ0
		System.out.println("���ĵ�������" + lisi.getAge());
	}

}
