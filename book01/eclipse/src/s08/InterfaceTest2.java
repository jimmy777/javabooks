package s08;

class ImageProcessor{
	/**
	 * ͼ����Ļ��ֻ࣬��ʾ��Ƭ
	 */
	public void show() {
		System.out.println("��ʾͼƬ");
	}
}

class NoiseOpe implements INoiseOpe{
	/**
	 * ��չ�¹��ܣ�ͼƬ���봦��
	 * ʵ�ֽ���ӿڼ��ɡ�
	 */
	public void work() {
		System.out.println("ͼƬ���봦��");
	}
}

class NewNoiseOpe implements INoiseOpe{
	/**
	 * ��չ�µĹ��ܣ�ʹ���µ��㷨��ͼƬ���봦��
	 * ʵ�ֽ���ӿڼ��ɡ�
	 */
	public void work() {
		System.out.println("���㷨ͼƬ���봦��");
	}
}

interface INoiseOpe{
	/**
	 * ����һ������ӿڣ�ֻҪʵ��work�������ܼ��ɡ�
	 * ���н��빦���඼Ҫʵ������ӿڵ�work�������ܡ�
	 */
	public void work();
}

class NewImageProcessor extends ImageProcessor{
	/**
	 * �µ�ͼƬ������������һ���µ�ͼƬ�����࣬������ӿ�ʵ����ʼ��ʱ���롣
	 * �Ƚ��봦����Ľӿ�work�������ܣ��ٵ��ø����show������ʾͼƬ��
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
		 * ʵ�����µ�ͼƬ�������������µĽ����㷨���д���
		 */
		ImageProcessor ip = new NewImageProcessor(new NewNoiseOpe());
		ip.show();
	}

}
