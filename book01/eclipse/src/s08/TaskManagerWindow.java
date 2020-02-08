package s08;

public class TaskManagerWindow {
	
	//属性tmw是private的，初始化为空。
	private static TaskManagerWindow tmw = null;

	//方法是public的，获取实例
//	public static TaskManagerWindow getInstance() {
//		return tmw;
//	}
	
	public synchronized static TaskManagerWindow getInstance() {
		//如果是首次运行，生成一个实例，否则将实例返回给调用者。
		if (tmw == null) {
			tmw = new TaskManagerWindow();
		}
		return tmw;
	}
	
	//构造函数定义为private，不让实例化。
	private TaskManagerWindow() {
		//初始化函数
		System.out.println("任务管理器创建");
	}

	//方法是public的
	public void show() {
		System.out.println("任务管理器显示");
	}
}
