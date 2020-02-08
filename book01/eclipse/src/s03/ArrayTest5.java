package s03;

public class ArrayTest5 {
	public static void main(String[] args) {
		/**
		 * 其实没有多维数组，只是一维数组中的元素也是一个数组
		 * int[3][5]这是定义了3*5的一个矩阵
		 * 
		 */
		int[][] arr = new int[][] {{1,2,3}, // 定义多维数组并初始化
			{100},
			{15,16}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
