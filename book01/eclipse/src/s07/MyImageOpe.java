package s07;

public class MyImageOpe extends ImageOpe {
	//��д�����read����
	public void read() {
		System.out.println("���ļ���ȡͼ��");
	}
	
	//�ȵ��ø����handle����������չһЩ����
	public void handle() {
		super.handle();
		System.out.println("ͼ����");
	}
	
	//ʹ�ø����show��������
	public void show() {
		super.show();
	}
}
