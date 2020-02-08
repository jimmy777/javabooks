package s03;

public class IfTest3 {

	public static void main(String[] args) {
		/**
		 * if..else if..else.. 较复杂的判断条件
		 * 最后也可以没有else
		 * if中也可以包含if
		 */
		
		String strMouth = javax.swing.JOptionPane.showInputDialog("输入月份");
		int month = Integer.parseInt(strMouth);
		
		if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			System.out.println(month+"月有31天");
		}else if (month==2) {
			System.out.println(month+"月有28天");
		}else if (month==4 || month==6 || month==9 || month==11) {
			System.out.println(month+"月有30天");
		}else {
			System.out.println("错误！");
		}
	}

}
