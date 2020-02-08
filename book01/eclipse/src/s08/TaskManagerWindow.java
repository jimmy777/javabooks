package s08;

public class TaskManagerWindow {
	
	//����tmw��private�ģ���ʼ��Ϊ�ա�
	private static TaskManagerWindow tmw = null;

	//������public�ģ���ȡʵ��
//	public static TaskManagerWindow getInstance() {
//		return tmw;
//	}
	
	public synchronized static TaskManagerWindow getInstance() {
		//������״����У�����һ��ʵ��������ʵ�����ظ������ߡ�
		if (tmw == null) {
			tmw = new TaskManagerWindow();
		}
		return tmw;
	}
	
	//���캯������Ϊprivate������ʵ������
	private TaskManagerWindow() {
		//��ʼ������
		System.out.println("�������������");
	}

	//������public��
	public void show() {
		System.out.println("�����������ʾ");
	}
}
