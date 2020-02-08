package s03;

public class IfTest1 {

	public static void main(String[] args) {
		String strAge = javax.swing.JOptionPane.showInputDialog("输入客户年龄");
		int age = Integer.parseInt(strAge);
		/**
		 * if尽量加大括号
		 * if(a) 代替 if(a == true)
		 * 
		 */
		if((age>0) && (age<100)) {
			System.out.println("年龄为：" + age);
		}
	}

}
