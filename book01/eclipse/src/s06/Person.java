package s06;

class Person {
	String name;
	static int number=0;
	
	Person(String name) {
		this.name=name;
		System.out.println("创建了"+name);
		number++;
		System.out.println("现在已经有"+number+"人了！");
	}
	
	void die() {
		System.out.println(name+"阵亡！");
		number--;
		System.out.println("现在还有"+number+"人了！");

		if (number<3) {
			System.out.println("警告！不足3人");
		}
	}
}
