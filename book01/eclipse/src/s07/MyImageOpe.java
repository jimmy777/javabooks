package s07;

public class MyImageOpe extends ImageOpe {
	//重写父类的read方法
	public void read() {
		System.out.println("从文件读取图像");
	}
	
	//先调用父类的handle方法，再扩展一些功能
	public void handle() {
		super.handle();
		System.out.println("图像锐化");
	}
	
	//使用父类的show方法不变
	public void show() {
		super.show();
	}
}
