package s08;

class ImageProcessor{
	/**
	 * 图像处理的基类，只显示照片
	 */
	public void show() {
		System.out.println("显示图片");
	}
}

class NoiseOpe implements INoiseOpe{
	/**
	 * 扩展新功能，图片降噪处理。
	 * 实现降噪接口即可。
	 */
	public void work() {
		System.out.println("图片降噪处理");
	}
}

class NewNoiseOpe implements INoiseOpe{
	/**
	 * 扩展新的功能，使用新的算法对图片降噪处理。
	 * 实现降噪接口即可。
	 */
	public void work() {
		System.out.println("新算法图片降噪处理");
	}
}

interface INoiseOpe{
	/**
	 * 定义一个降噪接口，只要实现work函数功能即可。
	 * 所有降噪功能类都要实现这个接口的work函数功能。
	 */
	public void work();
}

class NewImageProcessor extends ImageProcessor{
	/**
	 * 新的图片处理方法，定义一个新的图片处理类，将降噪接口实例初始化时导入。
	 * 先降噪处理类的接口work函数功能，再调用父类的show函数显示图片。
	 */

	private INoiseOpe ino;
	
	public NewImageProcessor(INoiseOpe ino) {
		this.ino = ino;
	}
	
	public void show() {
		ino.work();
		super.show();
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		/**
		 * 实例化新的图片处理方法，调用新的降噪算法进行处理
		 */
		ImageProcessor ip = new NewImageProcessor(new NewNoiseOpe());
		ip.show();
	}

}
