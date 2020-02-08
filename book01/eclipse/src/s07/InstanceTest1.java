package s07;

class Dialog{
	public void show() {
		System.out.println("���Ǹ��� Dialog��show������");
	}
}

class FontDialog extends Dialog {
	public void show() {
		System.out.println("�������� FontDialog��show������");

	}
}

public class InstanceTest1 {

	/**
	 * ����һ��������Ϊ������֮�󴫲�ʱ���Դ���������󣬳�Ϊ��̬
	 */
		
	public static void toCenter(Dialog dl1) {
		System.out.println("������Ļ����" + dl1);
		dl1.show();
	}
	
	public static void main(String[] args) {
		Dialog dl1 = new Dialog();
		toCenter(dl1);
		FontDialog fd1 = new FontDialog();
		toCenter(fd1);
		
		Dialog dialog = new FontDialog();
		//����ʵ��ת��Ϊ������Ҫ��ǿ��ת��
		FontDialog fd = (FontDialog) dialog;
		
		System.out.println(fd instanceof Dialog);
		System.out.println(fd instanceof FontDialog);

		
		/**
		 * instanceof ���ж϶������
		 */
		Dialog dialog1 = new Dialog();
		//���಻��ת��ֱ�Ӹ�ֵ�ุ�������
		Dialog dialog2 = new FontDialog();
		FontDialog dialog3 = new FontDialog();
		
		//���಻�������ʵ��
		System.out.println(dialog1 instanceof FontDialog);
		//��������Ǹ����ʵ��
		System.out.println(dialog2 instanceof Dialog);
		//����ת��Ϊ����
		System.out.println(dialog2 instanceof FontDialog);
		//����ת��Ϊ����
		System.out.println(dialog3 instanceof Dialog);
		//����
		System.out.println(dialog3 instanceof FontDialog);		
		
	}

}
