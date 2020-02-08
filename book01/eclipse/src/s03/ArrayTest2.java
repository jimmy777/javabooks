package s03;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3};
		int[] arr2 = new int[] {100,200,300};
		arr1 = arr2; // arr2的引用赋值给了arr1，arr1和arr2都指向arr2的空间
		arr1[0] = 5;
		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr2[1] = " + arr2[1]);
		System.out.println("arr2[2] = " + arr2[2]);
		
	}

}
