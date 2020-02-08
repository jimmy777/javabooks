package s03;

public class IfTest2 {

	public static void main(String[] args) {
		String strAge = javax.swing.JOptionPane.showInputDialog("输入客户年龄");
		int age = Integer.parseInt(strAge);
		/**
		 * if。。else。。 等价  条件？返回结果1：否则返回结果2
		 */
		if ((age>0) && (age<100)) {
			System.out.println("正确！");
		}else {
			System.out.println("错误！");
		}
	}

}
