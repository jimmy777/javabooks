package s03;

public class BreakTest2 {

	public static void main(String[] args) {
		/**
		 * break����ѭ�����ʹ��
		 * 
		 */
		while(true) { //while����ѭ����for����ѭ��Ϊ��for(;;){ѭ����;}
			String strAge = javax.swing.JOptionPane.showInputDialog("����ͻ�����");
			int age = Integer.parseInt(strAge);
			
			if((age>=0) && (age<=100)) {
				System.out.println("����Ϊ��" + age);
				break; // ���������������˳�ѭ����
			}
		}
	}

}
