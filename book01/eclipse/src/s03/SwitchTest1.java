package s03;

public class SwitchTest1 {

	public static void main(String[] args) {
		/**
		 * switch 与if-else if-else类似
		 * switch(变量){
		 * 	case 值1:
		 * 		code1
		 * 		break;
		 * 	case 值2:
		 * 		code2
		 * 		break;
		 *  ...
		 * 	default:
		 * 		coden;
		 * }
		 * 
		 * default 是可选的
		 * 判断变量有：byte|char|short|int
		 * break 是跳出switch的语句，不然会继续往下执行，这点与if-else if不一样，else if的条件成立，后面的else if就不再执行了。
		 */
		String strMouth = javax.swing.JOptionPane.showInputDialog("输入月份");
		int month = Integer.parseInt(strMouth);
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "月有31天");
			break;
		case 2:
			System.out.println(month + "月有28天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "月有30天");
			break;
		default:
			System.out.println(month + "错误！");	
		}
	}

}
