package s03;

public class SwitchTest1 {

	public static void main(String[] args) {
		/**
		 * switch ��if-else if-else����
		 * switch(����){
		 * 	case ֵ1:
		 * 		code1
		 * 		break;
		 * 	case ֵ2:
		 * 		code2
		 * 		break;
		 *  ...
		 * 	default:
		 * 		coden;
		 * }
		 * 
		 * default �ǿ�ѡ��
		 * �жϱ����У�byte|char|short|int
		 * break ������switch����䣬��Ȼ���������ִ�У������if-else if��һ����else if�����������������else if�Ͳ���ִ���ˡ�
		 */
		String strMouth = javax.swing.JOptionPane.showInputDialog("�����·�");
		int month = Integer.parseInt(strMouth);
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "����31��");
			break;
		case 2:
			System.out.println(month + "����28��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "����30��");
			break;
		default:
			System.out.println(month + "����");	
		}
	}

}
