package s06;

class Customer {
	String name;
	String bankname;
	//��̬����
	static String bankname2;
	
	//��̬����
	static void setBankName2(String bankName2) {
		Customer.bankname2 = bankName2;
	}
	
	//�Ծ�̬������ʼ��
	static {
		bankname2 = "�㽭����";
		System.out.println("���Ǿ�̬�����ִ��һ�Σ�");
	}
	
	//���б���
	int age0;
	
	//˽�б���
	private int age;
	
	//��¶���к�����˽�б������в���
	public void setAge(int age) {
		if(age<0 || age>100) {
			System.out.println("age�޷���ֵ");
			return;
		}
		this.age=age;
	}
	
	public int getAge() {
		return this.age;
	}
}
