package s08;


//class SystemConf{
//	//����TaskManagerWindow��Ϊһ����̬����
//	public static TaskManagerWindow tmw = new TaskManagerWindow();
//}

public class SingletonTest2 {

	/**
	 * ����ģʽ����������������ݿ����ӳء����������
	 * �����ϵͳ����
	 */
	
	public static void click() {
		//ʹ�������̬����tmw
		TaskManagerWindow tmw = TaskManagerWindow.getInstance();
		tmw.show();
	}
	
	public static void main(String[] args) {
		//������ֻ��һ��ʵ��tmw��
		//������һ��SystemConf�ࡣ
		click();
		click();
	}

}
