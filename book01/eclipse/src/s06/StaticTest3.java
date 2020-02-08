package s06;

public class StaticTest3 {

	public static void main(String[] args) {
		Person p1=new Person("张三");
		Person p2=new Person("李四");
		Person p3=new Person("王强");
		Person p4=new Person("赵海");
		
		p3.die();
		p4.die();
	}

}
