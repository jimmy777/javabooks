package s04;

//����һ���࣬�������3������
class Customer {
	//�������ԣ���г�Ա������
	String name;
	String sex;
	int age;
	
	/**
	 * ���캯��
	 * 1.�������������������ͬ
	 * 2.������������
	 * 
	 * 1.�����˹��캯��֮����ʵ��������ʱ���봫����Ӧ�Ĳ����б�����ᱣ����
	 * 2.��һ����Ķ��󱻴���ʱ���캯���ͻᱻ�Զ����ã�һ��Ϊ��ʼ��������ֻ�ᱻ����һ�Ρ�
	 * 3.���캯�����Ա����أ������ж�����캯����
	 * 4.��һ��Ĭ�ϵĹ��캯�����պ���ʲô��������������û��Լ�д�˹��캯����ϵͳ�Ͳ��ṩĬ�Ϲ��캯���ˡ�
	 */
	
	//���ع��캯��
	Customer(String name, String sex, int age) {
		//this�����еĳ�Ա��ʵ���Ǳ���������ã��������Ϊ�������Լ�
		System.out.println("��������"+this);
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	//Ĭ�Ϲ��캯��
	Customer() {
	}

	//n��s��a����ֻ���ں����ڲ�ʹ�ã����βΡ�
	void init(String name, String sex, int age) {
		//this�����еĳ�Ա��ʵ���Ǳ���������ã��������Ϊ�������Լ�
		System.out.println("��������"+this);
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	//���巽������г�Ա������
	void display() {
		System.out.println("name: "+name);
		System.out.println("sex: "+sex);
		System.out.println("age: "+age);
	}
}

public class ObjectTest1 {

	public static void main(String[] args) {
		// ����һ������������û�з���ռ�
		Customer zhangsan = null;
		System.out.println(zhangsan);

		//����ռ�
		zhangsan = new Customer(); 
		System.out.println(zhangsan);
		
		//ʵ������ı���ֵ����Ĭ��ֵ
		System.out.println("zhangsan's name: "+zhangsan.name);
		System.out.println("zhangsan's sex: "+zhangsan.sex);
		System.out.println("zhangsan's age: "+zhangsan.age);

		//��ʵ������ı�����ֵ
		zhangsan.name = "����";
		zhangsan.sex = "��";
		zhangsan.age = 25;
		
		System.out.println("zhangsan's name: "+zhangsan.name);
		System.out.println("zhangsan's sex: "+zhangsan.sex);
		System.out.println("zhangsan's age: "+zhangsan.age);
		
	}

}
