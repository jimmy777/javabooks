package s03;

public class ArrayTest5 {
	public static void main(String[] args) {
		/**
		 * ��ʵû�ж�ά���飬ֻ��һά�����е�Ԫ��Ҳ��һ������
		 * int[3][5]���Ƕ�����3*5��һ������
		 * 
		 */
		int[][] arr = new int[][] {{1,2,3}, // �����ά���鲢��ʼ��
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
