package s03;

public class IfTest2 {

	public static void main(String[] args) {
		String strAge = javax.swing.JOptionPane.showInputDialog("����ͻ�����");
		int age = Integer.parseInt(strAge);
		/**
		 * if����else���� �ȼ�  ���������ؽ��1�����򷵻ؽ��2
		 */
		if ((age>0) && (age<100)) {
			System.out.println("��ȷ��");
		}else {
			System.out.println("����");
		}
	}

}
