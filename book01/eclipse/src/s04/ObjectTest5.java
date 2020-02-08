package s04;

class Calc {
	//成员函数带返回值，注意返回值类型
	int abs(int a) {
		return a>0?a:-a;
	}
}

public class ObjectTest5 {

	public static void main(String[] args) {
		Calc c= new Calc();
		int result = c.abs(-10);
		System.out.println("结果是"+result);
	}

}
