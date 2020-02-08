package s07;

class Dialog{
	public void show() {
		System.out.println("这是父类 Dialog的show方法。");
	}
}

class FontDialog extends Dialog {
	public void show() {
		System.out.println("这是子类 FontDialog的show方法。");

	}
}

public class InstanceTest1 {

	/**
	 * 传入一个父类作为参数，之后传参时可以传入子类对象，成为多态
	 */
		
	public static void toCenter(Dialog dl1) {
		System.out.println("计算屏幕数据" + dl1);
		dl1.show();
	}
	
	public static void main(String[] args) {
		Dialog dl1 = new Dialog();
		toCenter(dl1);
		FontDialog fd1 = new FontDialog();
		toCenter(fd1);
		
		Dialog dialog = new FontDialog();
		//父类实例转换为子类需要做强制转换
		FontDialog fd = (FontDialog) dialog;
		
		System.out.println(fd instanceof Dialog);
		System.out.println(fd instanceof FontDialog);

		
		/**
		 * instanceof 来判断对象和类
		 */
		Dialog dialog1 = new Dialog();
		//子类不用转换直接赋值类父类的引用
		Dialog dialog2 = new FontDialog();
		FontDialog dialog3 = new FontDialog();
		
		//父类不是子类的实例
		System.out.println(dialog1 instanceof FontDialog);
		//子类可以是父类的实例
		System.out.println(dialog2 instanceof Dialog);
		//子类转换为父类
		System.out.println(dialog2 instanceof FontDialog);
		//子类转换为父类
		System.out.println(dialog3 instanceof Dialog);
		//子类
		System.out.println(dialog3 instanceof FontDialog);		
		
	}

}
