package s07;

abstract class Person {
	/**
	  *    ���show����������rewrite�ˣ�û�����ˡ���ô���Զ���Ϊ����������ô�����Ҳ���˳����ࡣ
	 * 	public void show() {
	 *      System.out.println("���Ǹ���Person��show������");
	 *  }
	 *  
	 *  1.�����಻�ܱ�ʵ������
	 *  2.���������뱻rewrite����������Ҳ�ǳ����ࣻ
	 *  3.��������Ҳ���԰�����ͨ������
	 */
	
	String name;
	
	abstract void show();
	
	void showName(){
		System.out.println("���ຯ��showName���ҵ�������" + this.name);
	}
}

class Teacher extends Person {
	public void show() {
		System.out.println("��������Teacher��show������");

	}
}

public class AbstractTest1 {
	
	public static void toCenter(Person p) {
		//ʹ�ö�̬����Person�࣬ʵ�ʴ����������Teacherʵ����
		System.out.println("���Ǹ���̬����toCenter");
		p.show();
	}

	public static void main(String[] args) {
		Teacher tom = new Teacher();
		toCenter(tom);
		tom.name = "��ķ";
		tom.showName();
	}

}
