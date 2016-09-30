package geeksforgeeks;

public class MatrixPath {
	public static void main(String[] args) {

		System.out.println(printpath(2,2));

	}

	private static int printpath(int i, int j) {
		if(i==1 || j==1 ){
			return 1;
		}
		return printpath(i-1, j)+printpath(i, j-1);

	}

}
