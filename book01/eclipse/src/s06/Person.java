package s06;

class Person {
	String name;
	static int number=0;
	
	Person(String name) {
		this.name=name;
		System.out.println("������"+name);
		number++;
		System.out.println("�����Ѿ���"+number+"���ˣ�");
	}
	
	void die() {
		System.out.println(name+"������");
		number--;
		System.out.println("���ڻ���"+number+"���ˣ�");

		if (number<3) {
			System.out.println("���棡����3��");
		}
	}
}
