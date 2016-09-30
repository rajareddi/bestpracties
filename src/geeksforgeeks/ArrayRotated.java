package geeksforgeeks;

public class ArrayRotated {

	public static void main(String[] args) {
		int[][] array = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int M = array.length;
		int N = array.length;
		getRotedArray(array, M, N);

	}

	private static void getRotedArray(int[][] array, int m, int n) {
		int[][] result = new int[m][m];
		for (int i = 0; i < m ; i++) {
			for (int j = 0; j < n ; j++) {
				result[j][m-1-i] = array[i][j];
			}
		}
		display(array, m, n);
		display(result, m, n);
	}

	private static void display(int[][] array, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
