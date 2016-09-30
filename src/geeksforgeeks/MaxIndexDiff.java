package geeksforgeeks;

public class MaxIndexDiff {

	public static void main(String[] args) {
		int arr[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
		System.out.println(maxIndexDiff(arr, arr.length));
	}

	static int maxIndexDiff(int arr[], int n) {
		int maxDiff = -1;
		int i, j;

		for (i = 0; i < n; ++i) {
			for (j = n - 1; j > i; --j) {
				if (arr[j] > arr[i] && maxDiff < (j - i))
					maxDiff = j - i;
			}
		}

		return maxDiff;
	}
}
