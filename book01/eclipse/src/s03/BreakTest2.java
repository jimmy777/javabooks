package s03;

public class BreakTest2 {

	public static void main(String[] args) {
		/**
		 * break与死循环配合使用
		 * 
		 */
		while(true) { //while的死循环。for的死循环为：for(;;){循环体;}
			String strAge = javax.swing.JOptionPane.showInputDialog("输入客户年龄");
			int age = Integer.parseInt(strAge);
			
			if((age>=0) && (age<=100)) {
				System.out.println("年龄为：" + age);
				break; // 输入满足条件即退出循环。
			}
		}
	}

}
