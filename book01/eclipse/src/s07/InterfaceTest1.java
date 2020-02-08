package s07;

interface User{
	/**
	 * ����ȫ���������ǳ���ģ���ô����Զ���Ϊ�ӿڣ�
	 * �̳е����ʵ��implement�ӿڣ������ʵ���ࣻ
	 * 
	 * ˵����
	 * 1���ӿ��в���Ҫдabstract��Ĭ�Ͼ��ǳ���ġ��ӿ���ֻ�ܰ��������ͺ�����
	 * 2���ӿ��еĺ�������public�ģ�������public static finalȫ�־�̬������
	 * 3���ӿڿ���extends�̳���һ���ӿڣ���ͨ��implements��ʵ��һ���ӿڣ�
	 * 4��һ������Լ̳�һ�����࣬ͬʱ���Լ̳ж���ӿڣ����ż����
	 */
	public static final String name = "xxx";
	public void show();
}

final class AdminUser implements User {
	String alias;
	
	//rewrite����Object���toString����
	public String toString() {
		return this.alias;
	}
	
	//rewrite����Object���equals����
	public boolean equals(AdminUser au) {
		if (alias.equals(au.alias)) {
			return true;
		}
		return false;
	}
	
	public AdminUser(String alias) {
		this.alias = alias;
	}
	
	public final double PI = 3.14;
	
	final public void show() {
		System.out.println("����AdminUser");
	}
}

public class InterfaceTest1 {
	
	public static void toCenter(User u) {
		System.out.println("��̬����toCenter: " + User.name);
		u.show();
	}

	public static void main(String[] args) {
		AdminUser jack = new AdminUser("JACK");
		System.out.println(jack.PI);
		toCenter(jack);
		System.out.println(jack);
		
		AdminUser jack2 = new AdminUser("JACK");
		System.out.println(jack2);
		
		//�ж������ַ����Ƿ������equals����
		System.out.println(jack.equals(jack2));
	}

}
