package codepracties;

public class BucketSort {

	public static void main(String[] args) {
		int[] input = { 2, 1, 5, 1, 2, 3, 4, 3, 5, 6, 7, 8, 5, 6, 7, 0 };
		BucketSort bt = new BucketSort();
		int[] outout = bt.sort(input, 0, 8);
		for (int i = 0; i < outout.length; i++) {
			for (int j = 0; j < outout[i]; j++) {
				System.out.println(i);

			}

		}
	}

	public int[] sort(int[] array, int min, int max) {
		int range = max - min + 1;
		int[] result = new int[range];
		for (int i : result) {
			result[i]++;

		}

		return result;

	}
}
