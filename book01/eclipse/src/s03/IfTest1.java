package s03;

public class IfTest1 {

	public static void main(String[] args) {
		String strAge = javax.swing.JOptionPane.showInputDialog("����ͻ�����");
		int age = Integer.parseInt(strAge);
		/**
		 * if�����Ӵ�����
		 * if(a) ���� if(a == true)
		 * 
		 */
		if((age>0) && (age<100)) {
			System.out.println("����Ϊ��" + age);
		}
	}

}
