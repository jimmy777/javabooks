package s03;

public class IfTest3 {

	public static void main(String[] args) {
		/**
		 * if..else if..else.. �ϸ��ӵ��ж�����
		 * ���Ҳ����û��else
		 * if��Ҳ���԰���if
		 */
		
		String strMouth = javax.swing.JOptionPane.showInputDialog("�����·�");
		int month = Integer.parseInt(strMouth);
		
		if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			System.out.println(month+"����31��");
		}else if (month==2) {
			System.out.println(month+"����28��");
		}else if (month==4 || month==6 || month==9 || month==11) {
			System.out.println(month+"����30��");
		}else {
			System.out.println("����");
		}
	}

}
