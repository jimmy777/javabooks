package s08;


//class SystemConf{
//	//声明TaskManagerWindow成为一个静态变量
//	public static TaskManagerWindow tmw = new TaskManagerWindow();
//}

public class SingletonTest2 {

	/**
	 * 单例模式：任务管理器、数据库连接池、共享对象方面
	 * 提高了系统性能
	 */
	
	public static void click() {
		//使用这个静态变量tmw
		TaskManagerWindow tmw = TaskManagerWindow.getInstance();
		tmw.show();
	}
	
	public static void main(String[] args) {
		//单例，只有一个实例tmw。
		//但多了一个SystemConf类。
		click();
		click();
	}

}
